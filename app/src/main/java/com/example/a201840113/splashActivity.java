package com.example.a201840113;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler h = new Handler();
        Runnable R = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),InitActivity.class);
                startActivity(intent);
                finish();
            }
        };
        h.postDelayed(R, 2000);
    }
}