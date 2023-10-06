package com.example.realestate.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import com.example.realestate.Models.SharedPreferencesHelper;
import com.example.realestate.R;

public class splashActivity extends AppCompatActivity {
private Button startBtn;
    private static final int SPLASH_TIME_OUT = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferencesHelper prefsHelper = new SharedPreferencesHelper(splashActivity.this);

                // Check if the user is logged in
                boolean isLoggedIn = !TextUtils.isEmpty(prefsHelper.getEmail()) && !TextUtils.isEmpty(prefsHelper.getPassword());

                if (isLoggedIn) {
                    // User is already logged in, navigate to the main activity
                    Intent intent = new Intent(splashActivity.this, MainActivity.class); // Replace with your main activity
                    startActivity(intent);
                } else {
                    // User is not logged in, navigate to the login activity
                    Intent intent = new Intent(splashActivity.this, introActivity.class); // Replace with your login activity
                    startActivity(intent);
                }

                finish(); // Close the splash activity
            }
        }, SPLASH_TIME_OUT);
    }

//        initView();


    private void initView(){
        startBtn=findViewById(R.id.startBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
    startActivity(new Intent(splashActivity.this,MainActivity.class));
            }
        });
    }
}