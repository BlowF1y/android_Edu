package com.example.a201840113.Order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.a201840113.R;

public class MyOrder2Activity extends AppCompatActivity {
    private CheckBox cb_salad, cb_spagetti, cb_cheeseball;
    private Button button;
    private String food_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order2);
        food_data = getIntent().getStringExtra("food");
        Log.e("!!!", ""+food_data);

        cb_salad = findViewById(R.id.cb_side1);
        cb_cheeseball = findViewById(R.id.cb_side2);
        cb_spagetti = findViewById(R.id.cb_side3);


        button = findViewById(R.id.btn_order_next_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String side_menu = "";
                if (cb_salad.isChecked()){
                    side_menu += "샐러드";
                }else if(cb_cheeseball.isChecked()){
                    side_menu += "치즈볼";
                }else if(cb_spagetti.isChecked()){
                    side_menu += "스파게티";
                }else{
                    side_menu += "사이드 추가 없음";
                }

                Intent order3 = new Intent(getApplicationContext(), MyOrder3Activity.class);
                order3.putExtra("food", food_data);
                order3.putExtra("side", side_menu);
                startActivity(order3);
            }
        });
    }
}