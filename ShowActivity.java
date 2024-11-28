package com.example.timecapsule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    private ImageView backBtn;
    private Button createBtn;
    private TextView showTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        createBtn = findViewById(R.id.createBtn);
        showTitle = findViewById(R.id.showTitle);
        backBtn = findViewById(R.id.backBtn);
        showTitle.setText(getTitle(), TextView.BufferType.EDITABLE);

        createBtn.setOnClickListener(view -> {
            goToHomeActivity();
        });

        backBtn.setOnClickListener(view -> {
            goToLogoutPage();
        });


    }
    public void onClick(View view){
        TextView showTitle = findViewById(R.id.showTitle);
        TextView set_goal = findViewById(R.id.set_goal);
        Capsule s = new Capsule();
        String myTitle = s.getTitle();
        String myDescription = s.getDescription();
        showTitle.setText(myTitle);
        set_goal.setText(myDescription);
    }
    private void goToHomeActivity(){
        Intent intent = new Intent(ShowActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
    private void goToLogoutPage(){
        Intent intent = new Intent(ShowActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}