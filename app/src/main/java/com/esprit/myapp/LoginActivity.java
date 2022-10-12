package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Button loginBtn ;
    private TextView signupTv , forgotPwTv;
    private Intent intent ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signupTv = findViewById(R.id.tvSignup);
        signupTv.setOnClickListener(e -> {
            intent = new Intent(LoginActivity.this , signupActivity.class);
            startActivity(intent);
        });


        loginBtn = findViewById(R.id.btnLogin);
        loginBtn.setOnClickListener(e -> {
            intent = new Intent(LoginActivity.this , HomeActivity.class);
            startActivity(intent);
        });


    }
}