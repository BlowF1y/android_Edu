package com.example.a201840113;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calcActivity extends AppCompatActivity {
    private TextView textview;
    private calcActivity activity;


    private Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    private Button btn_multiple, btn_subtraction, btn_division, btn_plus, btn_result, btn_erase;

    private boolean ok;
    private int a, b;
    private String c;

    public void btn_click(View view) {
        String num = textview.getText().toString();
            switch (view.getId()) {
                case R.id.btn_0:
                    textview.setText(num + "0");
                    break;
                case R.id.btn_1:
                    textview.setText(num + "1");
                    break;
                case R.id.btn_2:
                    textview.setText(num + "2");
                    break;
                case R.id.btn_3:
                    textview.setText(num + "3");
                    break;
                case R.id.btn_4:
                    textview.setText(num + "4");
                    break;
                case R.id.btn_5:
                    textview.setText(num + "5");
                    break;
                case R.id.btn_6:
                    textview.setText(num + "6");
                    break;
                case R.id.btn_7:
                    textview.setText(num + "7");
                    break;
                case R.id.btn_8:
                    textview.setText(num + "8");
                    break;
                case R.id.btn_9:
                    textview.setText(num + "9");
                    break;

            }
        }
    public void btn_sign_click(View view) {
        a = Integer.parseInt(textview.getText().toString());
        textview.setText("");
            switch (view.getId()){
                case R.id.btn_plus:
                    c = "+";
                    break;
                case R.id.btn_division:
                    c = "/";
                    break;
                case R.id.btn_subtraction:
                    c = "-";
                    break;
                case R.id.btn_multiple:
                    c = "x";
                    break;
            }
    }
    public void btn_result_click(View view){
        b = Integer.parseInt(textview.getText().toString());
        if (view.getId() == R.id.btn_result){
            switch (c){
                case "+" : textview.setText(Integer.toString(a+b));break;
                case "/" : textview.setText(Integer.toString(a/b));break;
                case "x" : textview.setText(Integer.toString(a*b));break;
                case "-" : textview.setText(Integer.toString(a-b));break;
            }
        }

    }
    @Override
    protected void onStart() {
            super.onStart();
        textview = (TextView) findViewById(R.id.main_text);
        btn_0 = (Button) findViewById(R.id.btn_0);
          btn_0.setOnClickListener(this::btn_click);
        btn_1 = (Button) findViewById(R.id.btn_1);
            btn_1.setOnClickListener(this::btn_click);
        btn_2 = (Button) findViewById(R.id.btn_2);
            btn_2.setOnClickListener(this::btn_click);
        btn_3 = (Button) findViewById(R.id.btn_3);
            btn_3.setOnClickListener(this::btn_click);
        btn_4 = (Button) findViewById(R.id.btn_4);
            btn_4.setOnClickListener(this::btn_click);
        btn_5 = (Button) findViewById(R.id.btn_5);
            btn_5.setOnClickListener(this::btn_click);
        btn_6 = (Button) findViewById(R.id.btn_6);
            btn_6.setOnClickListener(this::btn_click);
        btn_7 = (Button) findViewById(R.id.btn_7);
            btn_7.setOnClickListener(this::btn_click);
        btn_8 = (Button) findViewById(R.id.btn_8);
            btn_8.setOnClickListener(this::btn_click);
        btn_9 = (Button) findViewById(R.id.btn_9);
            btn_9.setOnClickListener(this::btn_click);
        btn_result = (Button) findViewById(R.id.btn_result);
            btn_result.setOnClickListener(this::btn_result_click);
        btn_plus = (Button) findViewById(R.id.btn_plus);
            btn_plus.setOnClickListener(this::btn_sign_click);
        btn_division = (Button) findViewById(R.id.btn_division);
            btn_division.setOnClickListener(this::btn_sign_click);
        btn_subtraction = (Button) findViewById(R.id.btn_subtraction);
            btn_subtraction.setOnClickListener(this::btn_sign_click);
        btn_multiple = (Button) findViewById(R.id.btn_multiple);
            btn_multiple.setOnClickListener(this::btn_sign_click);
        btn_erase = (Button) findViewById(R.id.btn_erase);
        btn_erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.btn_erase){
                    textview.setText("");
                    a = 0;
                    b = 0;
                    c = "";
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}