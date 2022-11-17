package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.esprit.myapp.Entity.User;

public class HomeActivity extends AppCompatActivity {

    private User user ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        user = (User) getIntent().getSerializableExtra("User");

        
    }
}