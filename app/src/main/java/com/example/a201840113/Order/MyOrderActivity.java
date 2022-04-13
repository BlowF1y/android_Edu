package com.example.a201840113.Order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.a201840113.R;

public class MyOrderActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton rb_chicken, rb_hamburger, rb_pizza;
    private Button btn_next;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        rb_chicken = findViewById(R.id.rb_chicken);
        rb_hamburger = findViewById(R.id.rb_hamburger);
        rb_pizza = findViewById(R.id.rb_pizza);
        radioGroup = findViewById(R.id.rg_fastfood);

        imageView = findViewById(R.id.food_image);
        rb_chicken.setChecked(true);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb_chicken:
                        Toast.makeText(MyOrderActivity.this, "치킨",Toast.LENGTH_SHORT).show();
                        imageView.setImageResource(R.drawable.chicken);
                        break;
                    case R.id.rb_hamburger:
                        Toast.makeText(MyOrderActivity.this, "햄버거",Toast.LENGTH_SHORT).show();
                        imageView.setImageResource(R.drawable.hamburger);
                        break;
                    case R.id.rb_pizza:
                        Toast.makeText(MyOrderActivity.this, "피자",Toast.LENGTH_SHORT).show();
                        imageView.setImageResource(R.drawable.pizza);
                        break;
                }
            }
        });


        btn_next = findViewById(R.id.btn_order_next_1);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String food = "";
                if (rb_chicken.isChecked()){
                    food += "치킨";
                }else if (rb_hamburger.isChecked()){
                    food += "햄버거";
                }else if (rb_pizza.isChecked()){
                    food += "피자";
                }
                Intent order2 = new Intent(getApplicationContext(), MyOrder2Activity.class);
                order2.putExtra("food", food);
                startActivity(order2);
            }
        });

    }
}