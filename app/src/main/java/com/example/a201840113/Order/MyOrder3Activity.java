package com.example.a201840113.Order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.a201840113.R;

public class MyOrder3Activity extends AppCompatActivity {
    private String food, side;
    private RadioButton rb_coke, rb_cokeX;
    private RadioGroup rg_coke;
    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order3);

        food = getIntent().getStringExtra("food");
        side = getIntent().getStringExtra("side");
        rb_coke = findViewById(R.id.rb_cokeOK);
        rb_cokeX = findViewById(R.id.rb_cokeNO);

        next = findViewById(R.id.btn_order_next_3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String coke = "";
                if (rb_coke.isChecked()){
                    coke += "콜라추가";
                }else if (rb_cokeX.isChecked()){
                    coke += "콜라X";
                }
                Intent order4 = new Intent(getApplicationContext(), MyOrderResultActivity.class);
                order4.putExtra("food", food);
                order4.putExtra("side", side);
                order4.putExtra("coke", coke);
                startActivity(order4);

            }
        });

    }
}