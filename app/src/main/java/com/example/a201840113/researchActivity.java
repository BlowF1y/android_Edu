package com.example.a201840113;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class researchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);


        CheckBox cb_a = findViewById(R.id.apple);
        CheckBox cb_b = findViewById(R.id.peer);
        CheckBox cb_c = findViewById(R.id.mango);

        cb_a.setChecked(true);

        Button bt_next = findViewById(R.id.next);
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("!!!", "cb_a :"+ cb_a.isChecked());
                Log.e("!!!", "cb_b :"+ cb_b.isChecked());
                Log.e("!!!", "cb_c :"+ cb_c.isChecked());

                String str = "";
                if (cb_a.isChecked()){
                    str += "사과";
                }else if (cb_b.isChecked()){
                    str += "배";
                }else if (cb_c.isChecked()){
                    str += "망고";
                }
                Intent intent = new Intent(getApplicationContext(), NextResearchActivity.class);
                intent.putExtra("str", str);
                startActivity(intent);
            }
        });

    }
}