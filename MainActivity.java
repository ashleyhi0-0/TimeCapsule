package com.example.timecapsule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private Button loginBtn;
    private TextView eRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);


        username = findViewById(R.id.input_username);
        password = findViewById(R.id.input_password);
        loginBtn = findViewById(R.id.btnLogin);
        eRegister = findViewById(R.id.eRegister);

        eRegister.setOnClickListener(view -> {
            goToRegisterPage();
        });

        loginBtn.setOnClickListener(view -> {
            goToHomePage();
        });

    }
    private void goToRegisterPage(){
        Intent intent = new Intent(MainActivity.this, Register.class);
        startActivity(intent);

    }
    private void goToHomePage(){
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
    }

}