package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.esprit.myapp.Database.Database;
import com.esprit.myapp.Entity.Complaint;
import com.esprit.myapp.Entity.User;

import java.util.HashMap;

public class FormActivity extends AppCompatActivity {

    private Button submitBtn;
    private Intent intent;
    private User user ;
    private Database database;
    private EditText object, details;
    private ImageView imgTag1 , imgTag2 , imgTag3 , imgTag4 , imgTag5 , imgTag6 ;
    String tag = "";

    //private HashMap<>
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        database = Database.getInstance(getApplicationContext());
        user = (User) getIntent().getSerializableExtra("User");

        object = findViewById(R.id.object);
        details = findViewById(R.id.details);

        // getTag
        getTag();
        //
        submitBtn = findViewById(R.id.submitButton);
        submitBtn.setOnClickListener(e -> {
            System.out.println("USER " +user);
            System.out.println("Tag " +tag);
            database.complaintDAO().insert(new Complaint(object.getText().toString(),details.getText().toString(),tag,user.getId()));
            System.out.println(database.complaintDAO().getAll());
            intent = new Intent(FormActivity.this , MenuActivity.class);
            intent.putExtra("User" , user);
            startActivity(intent);
        });
    }

    public void getTag() {
        imgTag1 = findViewById(R.id.imgtag1);
        imgTag2 = findViewById(R.id.imgtag1);
        imgTag3 = findViewById(R.id.imgtag3);
        imgTag4 = findViewById(R.id.imgtag4);
        imgTag5 = findViewById(R.id.imgtag5);
        imgTag6 = findViewById(R.id.imgtag6);

        imgTag1.setOnClickListener(e -> {
            tag = "Trash";
        });

        imgTag2.setOnClickListener(e -> {
            tag = "Leak";
        });

        imgTag3.setOnClickListener(e -> {
            tag = "Mosquito";
        });

        imgTag4.setOnClickListener(e -> {
            tag = "Pothole";
        });

        imgTag5.setOnClickListener(e -> {
            tag = "Lighting";
        });

        imgTag6.setOnClickListener(e -> {
            tag = "Other";
        });
    }

}