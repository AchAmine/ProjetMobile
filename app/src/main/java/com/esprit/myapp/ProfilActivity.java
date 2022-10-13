package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ProfilActivity extends AppCompatActivity {
    private Intent intent;
    private ImageView pwBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        pwBtn = findViewById(R.id.goToPw);
        pwBtn.setOnClickListener(e -> {
            intent = new Intent(ProfilActivity.this , PasswordActivity.class);
            startActivity(intent);
        });
    }
}