package com.example.a201840113;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);

        Intent initIntent = getIntent();
        String result = initIntent.getStringExtra("result");
        TextView init_tv = findViewById(R.id.init_tv);
        init_tv.setText(result);

        Button calc = findViewById(R.id.btn_move_calc);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calcIntent = new Intent(getApplicationContext(),calcActivity.class);
                startActivity(calcIntent);
            }
        });

        Button next = findViewById(R.id.btn_move_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(getApplicationContext(), nextActivity.class);
                startActivity(nextIntent);

            }
        });




    }
}