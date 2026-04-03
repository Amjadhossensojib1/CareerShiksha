package com.amjad.careershiksha.ui.signupActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.dashboardactivity.DashboardActivity;
import com.amjad.careershiksha.ui.loginActiity.LoginActivity;

public class SignUpActivity extends AppCompatActivity {
    private Button btnSignUp;
    private TextView tvbtnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignUp = findViewById(R.id.btn_sign_up);
        tvbtnSignIn = findViewById(R.id.tv_btn_signIn);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, DashboardActivity.class));
            }
        });
        tvbtnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
            }
        });

    }
}