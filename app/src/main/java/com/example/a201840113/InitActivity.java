package com.example.a201840113;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a201840113.Order.MyOrderActivity;

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

        Button List = findViewById(R.id.btn_move_List);
        List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ListIntent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(ListIntent);
            }
        });

        Button Research = findViewById(R.id.btn_research);
        Research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ResearchIntent = new Intent(getApplicationContext(), researchActivity.class);
                startActivity(ResearchIntent);
            }
        });

        Button List_cust = findViewById(R.id.btn_move_List_custom);
        List_cust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent customIntent = new Intent(getApplicationContext(), ListCustomActivity.class);
                startActivity(customIntent);
            }
        });

        Button order = findViewById(R.id.btn_Myorder);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent orderIntent = new Intent(getApplicationContext(), MyOrderActivity.class);
                startActivity(orderIntent);
            }
        });




    }
}