package com.amjad.careershiksha.ui.loginActiity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.amjad.careershiksha.R;
import com.amjad.careershiksha.ui.signupActivity.SignUpActivity;
import com.amjad.careershiksha.dashboardactivity.DashboardActivity;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    private TextView tvbtnSignUP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_sign_in);
        tvbtnSignUP = findViewById(R.id.tv_btn_signup);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
            }
        });

        tvbtnSignUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            }
        });


    }
}