package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.esprit.myapp.Entity.User;

public class FormActivity extends AppCompatActivity {

    private Button submitBtn;
    private Intent intent;
    private User user ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        user = (User) getIntent().getSerializableExtra("User");

        submitBtn = findViewById(R.id.submitButton);
        submitBtn.setOnClickListener(e -> {
            intent = new Intent(FormActivity.this , MenuActivity.class);
            startActivity(intent);
        });
    }
}