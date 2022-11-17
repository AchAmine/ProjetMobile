package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.esprit.myapp.Database.Database;
import com.esprit.myapp.Entity.User;

public class signupActivity extends AppCompatActivity {
    private Button signupBtn  ;
    private TextView loginTv;
    private Intent intent;
    private Database database;
    private EditText mail, pwd , numTel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        database = Database.getInstance(getApplicationContext());
        mail = findViewById(R.id.edMail);
        pwd = findViewById(R.id.edPW);
        numTel = findViewById(R.id.edPhone);
        signupBtn = findViewById(R.id.btnSignup);
        signupBtn.setOnClickListener(e -> {
           /* intent = new Intent(signupActivity.this , LoginActivity.class);
            startActivity(intent);*/
            database.userDAO().insert(new User(Integer.parseInt(numTel.getText().toString()),mail.getText().toString(),pwd.getText().toString()));
            System.out.println(database.userDAO().getAll());
        });

        loginTv = findViewById(R.id.tvLogin);
        loginTv.setOnClickListener(e -> {
            intent = new Intent(signupActivity.this , LoginActivity.class);
            startActivity(intent);
        });

    }
}