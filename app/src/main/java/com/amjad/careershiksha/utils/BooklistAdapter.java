package com.amjad.careershiksha.utils;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.model.Booklist;
import com.amjad.careershiksha.ui.PdfviewerActivity.PDFViewerActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BooklistAdapter extends RecyclerView.Adapter<BooklistAdapter.BooklistViewHolder> {

    private List<Booklist> bookList;

    public BooklistAdapter(List<Booklist> bookList) {
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BooklistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout_booklist, parent, false);
        return new BooklistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BooklistViewHolder holder, int position) {
        holder.bind(bookList.get(position));
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class BooklistViewHolder extends RecyclerView.ViewHolder {
        private ImageView bookImage;
        private TextView bookName;

        public BooklistViewHolder(@NonNull View itemView) {
            super(itemView);
            bookImage = itemView.findViewById(R.id.iv_book_image);
            bookName  = itemView.findViewById(R.id.tv_book_name);
        }

        public void bind(Booklist booklist) {
            Picasso.get().load(booklist.getBookImage()).into(bookImage);
            bookName.setText(booklist.getBookName());

            // ✅ Click করলে PDF খুলবে
            itemView.setOnClickListener(v -> {
                Context context = v.getContext();

                if (booklist.getPdfResId() == -1) {
                    Toast.makeText(context, "এই বইয়ের PDF পাওয়া যায়নি", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(context, PDFViewerActivity.class);
                intent.putExtra("pdfResId", booklist.getPdfResId());
                intent.putExtra("bookName", booklist.getBookName());
                context.startActivity(intent);
            });
        }
    }
}