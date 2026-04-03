package com.amjad.careershiksha.ui.PdfviewerActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.pdf.PdfRenderer;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.amjad.careershiksha.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class PDFViewerActivity extends AppCompatActivity {

    private LinearLayout container;
    private ProgressBar progressBar;
    private TextView titleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer);

        titleTextView = findViewById(R.id.pdfTitle);
        container     = findViewById(R.id.pdfContainer);
        progressBar   = findViewById(R.id.progressBar);

        int pdfResId    = getIntent().getIntExtra("pdfResId", -1);
        String bookName = getIntent().getStringExtra("bookName");

        if (bookName != null) titleTextView.setText(bookName);

        if (pdfResId == -1) {
            Toast.makeText(this, "PDF পাওয়া যায়নি", Toast.LENGTH_SHORT).show();
            finish();
            return;
        }

        // Background thread এ PDF load করুন
        int finalPdfResId = pdfResId;
        new Thread(() -> {
            try {
                // Step 1: raw থেকে cache এ copy
                InputStream input = getResources().openRawResource(finalPdfResId);
                File tempFile = new File(getCacheDir(), "temp_book.pdf");
                FileOutputStream out = new FileOutputStream(tempFile);
                byte[] buf = new byte[4096];
                int len;
                while ((len = input.read(buf)) > 0) out.write(buf, 0, len);
                input.close();
                out.close();

                // Step 2: PdfRenderer দিয়ে render
                ParcelFileDescriptor fd = ParcelFileDescriptor.open(
                        tempFile, ParcelFileDescriptor.MODE_READ_ONLY);
                PdfRenderer renderer = new PdfRenderer(fd);
                int pageCount = renderer.getPageCount();

                for (int i = 0; i < pageCount; i++) {
                    PdfRenderer.Page page = renderer.openPage(i);

                    int width  = page.getWidth() * 2;
                    int height = page.getHeight() * 2;

                    Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    canvas.drawColor(0xFFFFFFFF);
                    page.render(bitmap, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY);
                    page.close();

                    // UI thread এ ImageView যোগ করুন
                    Bitmap finalBitmap = bitmap;
                    runOnUiThread(() -> {
                        ImageView imageView = new ImageView(PDFViewerActivity.this);
                        imageView.setImageBitmap(finalBitmap);
                        imageView.setAdjustViewBounds(true);
                        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT);
                        params.setMargins(0, 0, 0, 6);
                        imageView.setLayoutParams(params);
                        container.addView(imageView);
                    });
                }

                renderer.close();

                // Loading শেষ
                runOnUiThread(() -> progressBar.setVisibility(View.GONE));

            } catch (Exception e) {
                e.printStackTrace();
                runOnUiThread(() -> {
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(PDFViewerActivity.this,
                            "PDF লোড হয়নি: " + e.getMessage(),
                            Toast.LENGTH_LONG).show();
                });
            }
        }).start();
    }
}