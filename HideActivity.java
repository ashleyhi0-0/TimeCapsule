package com.example.timecapsule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HideActivity extends AppCompatActivity {
    private Button unlockBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide);

        unlockBtn = findViewById(R.id.unlockBtn);

        unlockBtn.setOnClickListener(view -> {
            goToShowActivity();
        });

    }
    private void goToShowActivity(){
        Intent intent = new Intent(HideActivity.this, ShowActivity.class);
        startActivity(intent);
        finish();
    }
}