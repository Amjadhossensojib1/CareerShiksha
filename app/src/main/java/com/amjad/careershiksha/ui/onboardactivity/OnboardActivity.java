package com.amjad.careershiksha.ui.onboardactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.amjad.careershiksha.dashboardactivity.DashboardActivity;
import com.amjad.careershiksha.R;

public class OnboardActivity extends AppCompatActivity {
    private Button btnGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);

        btnGetStarted = findViewById(R.id.btn_getstarted);
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OnboardActivity.this, DashboardActivity.class));
            }
        });

    }
}