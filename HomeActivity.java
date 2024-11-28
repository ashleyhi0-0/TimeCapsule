package com.example.timecapsule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private EditText title, set_goal;
    private Button createBtn, unlockBtn;
    private ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        createBtn = findViewById(R.id.createBtn);
        title = findViewById(R.id.title);
        backBtn = findViewById(R.id.backBtn);

        createBtn.setOnClickListener(view -> {
            goToHidePage();
        });

        backBtn.setOnClickListener(view -> {
            goToLogoutPage();
        });

    }

    private void goToHidePage(){
        Intent intent = new Intent(HomeActivity.this, HideActivity.class);
        startActivity(intent);
    }
    private void goToLogoutPage(){
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}