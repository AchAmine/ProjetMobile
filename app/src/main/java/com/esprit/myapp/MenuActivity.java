package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.esprit.myapp.Entity.User;

import de.hdodenhof.circleimageview.CircleImageView;

public class MenuActivity extends AppCompatActivity {

    private ImageView  formBtn;
    private CircleImageView homeBtn , profileBtn;
    private Intent intent ;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        user = (User) getIntent().getSerializableExtra("User");
        System.out.println(user.getEmail());
        formBtn = findViewById(R.id.goToForm);
        formBtn.setOnClickListener(e -> {
            intent = new Intent(MenuActivity.this , FormActivity.class);
            startActivity(intent);
        });


        profileBtn = findViewById(R.id.profile_image);
        profileBtn.setOnClickListener(e -> {
            intent = new Intent(MenuActivity.this , ProfilActivity.class);
            intent.putExtra("User", user);
            startActivity(intent);
        });
    }

}