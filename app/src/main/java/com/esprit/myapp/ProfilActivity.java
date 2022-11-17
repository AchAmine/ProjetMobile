package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.esprit.myapp.Entity.User;

public class ProfilActivity extends AppCompatActivity {
    private Intent intent;
    private ImageView pwBtn ;
    private EditText mail,numTel;
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        user = (User) getIntent().getSerializableExtra("User");
        mail = findViewById(R.id.edEmail);
        numTel = findViewById(R.id.edPhone);
        System.out.println("-----------------------------------");
        System.out.println(user.getEmail());
        System.out.println(user.getNumTel());
        mail.setText(user.getEmail());
        numTel.setText(Integer.toString(user.getNumTel()));

        pwBtn = findViewById(R.id.goToPw);
        pwBtn.setOnClickListener(e -> {
            intent = new Intent(ProfilActivity.this , PasswordActivity.class);
            startActivity(intent);
        });
    }
}