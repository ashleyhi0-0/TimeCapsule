package com.example.timecapsule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText username, email, password;
    Button registerBtn;
    TextView eLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.create_username);
        email = findViewById(R.id.create_email);
        password = findViewById(R.id.create_password);
        registerBtn = findViewById(R.id.btnRegister);
        eLogin = findViewById(R.id.eLogin);

        eLogin.setOnClickListener(view -> {
            if(username.equals("admin")&&password.equals("123")){
                Toast.makeText(Register.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                goToLoginPage();
            } else{
                Toast.makeText(Register.this, "Login Failed", Toast.LENGTH_SHORT).show();
            }
        });
        registerBtn.setOnClickListener(view -> {
            goToHomePage();
        });
    }
    private void goToHomePage(){
        Intent intent = new Intent(Register.this, HomeActivity.class);
        startActivity(intent);
    }
    private void goToLoginPage(){
            Intent intent = new Intent(Register.this, MainActivity.class);
            startActivity(intent);
    }
}