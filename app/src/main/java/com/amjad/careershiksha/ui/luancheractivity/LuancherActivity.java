package com.amjad.careershiksha.ui.luancheractivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.amjad.careershiksha.ui.onboardactivity.OnboardActivity;
import com.amjad.careershiksha.R;

public class LuancherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luancher);

        Handler handler = new Handler();
        Runnable r = new Runnable() {
            public void run() {
                startActivity(new Intent(LuancherActivity.this, OnboardActivity.class));
                finish();
            }
        };
        handler.postDelayed(r, 1000);

    }
}