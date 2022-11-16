package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PasswordActivity extends AppCompatActivity {
    private Intent intent;
    private ImageView profileBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        profileBtn = findViewById(R.id.goToProf);
        profileBtn.setOnClickListener(e -> {
            intent = new Intent(PasswordActivity.this , ProfilActivity.class);
            startActivity(intent);
        });
    }
}