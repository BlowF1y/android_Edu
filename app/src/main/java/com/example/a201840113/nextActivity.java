package com.example.a201840113;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class nextActivity extends AppCompatActivity {
    private int result;
    private String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        TextView textView = findViewById(R.id.next_tv);
        Button finish_btn = findViewById(R.id.finish);
        finish_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent initIntent = new Intent(getApplicationContext(), nextActivity.class);

                a = textView.getText().toString();
                result = Integer.parseInt(a);
                initIntent.putExtra("result", result);
                finish();

            }
        });

    }
}