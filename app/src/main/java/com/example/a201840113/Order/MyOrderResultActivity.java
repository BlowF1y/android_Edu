package com.example.a201840113.Order;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.a201840113.R;

public class MyOrderResultActivity extends AppCompatActivity {
    private TextView food, side, coke;
    private String food_data, side_data, coke_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order_result);

        food_data = getIntent().getStringExtra("food");
        side_data = getIntent().getStringExtra("side");
        coke_data = getIntent().getStringExtra("coke");

        food = findViewById(R.id.food_text);
        side = findViewById(R.id.side_text);
        coke = findViewById(R.id.coke_text);

        food.setText(food_data);
        side.setText(side_data);
        coke.setText(coke_data);

    }
}