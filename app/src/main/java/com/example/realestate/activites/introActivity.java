package com.example.realestate.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.example.realestate.R;

public class introActivity extends AppCompatActivity {
private Button startBtn;
    private static final int SPLASH_TIME_OUT = 3000; // 3 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(introActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // close the splash activity
            }
        }, SPLASH_TIME_OUT);
    }
//        initView();


    private void initView(){
        startBtn=findViewById(R.id.startBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
    startActivity(new Intent(introActivity.this,MainActivity.class));
            }
        });
    }
}