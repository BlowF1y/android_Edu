package com.example.a201840113;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NextResearchActivity extends AppCompatActivity {

    private String preData;
    private RadioGroup rg_contents;
    private RadioButton rb_1, rb_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_research);

        preData = getIntent().getStringExtra("str");
        Log.e("!!!", ""+preData);

        rb_1 = findViewById(R.id.rb_1);
        rb_2 = findViewById(R.id.rb_2);
        rg_contents = findViewById(R.id.rg_contents);

        rb_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NextResearchActivity.this, "rb_1 : " + rb_1.isChecked()+", rb_2 : "+ rb_2.isChecked(),Toast.LENGTH_SHORT ).show();
            }
        });

        rb_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NextResearchActivity.this, "rb_1 : " + rb_1.isChecked()+", rb_2 : "+ rb_2.isChecked(),Toast.LENGTH_SHORT ).show();
            }
        });

        rg_contents.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rb_3:
                        Toast.makeText(NextResearchActivity.this, "도보를 선택했습니다", Toast.LENGTH_SHORT ).show();
                        break;
                    case  R.id.rb_4:
                        Toast.makeText(NextResearchActivity.this, "자전거를 선택했습니다", Toast.LENGTH_SHORT ).show();
                        break;
                }
            }
        });
    }
}