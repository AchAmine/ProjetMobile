package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class signupActivity extends AppCompatActivity {
    private Button signupBtn  ;
    private TextView loginTv;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signupBtn = findViewById(R.id.btnSignup);
        loginTv = findViewById(R.id.tvLogin);
        loginTv.setOnClickListener(e -> {
            intent = new Intent(signupActivity.this , LoginActivity.class);
            startActivity(intent);
        });

    }
}