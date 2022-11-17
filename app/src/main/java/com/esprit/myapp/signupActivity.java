package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.esprit.myapp.Database.Database;
import com.esprit.myapp.Entity.User;

public class signupActivity extends AppCompatActivity {
    private Button signupBtn  ;
    private TextView loginTv;
    private Intent intent;
    private Database database;
    private EditText mail, pwd , numTel , confirmPwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        database = Database.getInstance(getApplicationContext());

        //
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mail = findViewById(R.id.edMail);
        pwd = findViewById(R.id.edPW);
        numTel = findViewById(R.id.edPhone);
        confirmPwd = findViewById(R.id.edPW2);
        signupBtn = findViewById(R.id.btnSignup);
        signupBtn.setOnClickListener(e -> {

            if (pwd.getText().toString().equals(confirmPwd.getText().toString())) {
                database.userDAO().insert(new User(Integer.parseInt(numTel.getText().toString()), mail.getText().toString(), pwd.getText().toString()));
                System.out.println(database.userDAO().getAll());
                 intent = new Intent(signupActivity.this , LoginActivity.class);
            startActivity(intent);
            } else {
                Toast.makeText(signupActivity.this, "Password is not matching", Toast.LENGTH_SHORT).show();

            }
        });

        loginTv = findViewById(R.id.tvLogin);
        loginTv.setOnClickListener(e -> {
            intent = new Intent(signupActivity.this , LoginActivity.class);
            startActivity(intent);
        });

    }
}