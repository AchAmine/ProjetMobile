package com.esprit.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.esprit.myapp.Database.Database;
import com.esprit.myapp.Entity.User;

public class LoginActivity extends AppCompatActivity {

    private Button loginBtn ;
    private TextView signupTv , forgotPwTv;
    private EditText mail, pwd ;
    private Intent intent ;
    private Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        database = Database.getInstance(getApplicationContext());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signupTv = findViewById(R.id.tvSignup);
        signupTv.setOnClickListener(e -> {
            intent = new Intent(LoginActivity.this , signupActivity.class);
            startActivity(intent);
        });


        loginBtn = findViewById(R.id.btnLogin);
        loginBtn.setOnClickListener(e -> {
            mail = findViewById(R.id.edMail);
            pwd = findViewById(R.id.edPassword);

            String email = mail.getText().toString().trim();
            String password = pwd.getText().toString().trim();

            User user = database.userDAO().getUser(email, password);
            if (user != null) {
                intent = new Intent(LoginActivity.this , MenuActivity.class);

                intent.putExtra("User", user);
                startActivity(intent);

                finish();
            }else{
                Toast.makeText(LoginActivity.this, "Incorrect email or password", Toast.LENGTH_SHORT).show();
            }

        });


    }
}