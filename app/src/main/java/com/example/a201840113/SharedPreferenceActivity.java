package com.example.a201840113;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SharedPreferenceActivity extends AppCompatActivity {
    private Button btn_save, btn_load;
    private TextView sl_text;
    private EditText edit_shared;
    private SharedPreferences test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        sl_text = findViewById(R.id.sl_text);
        edit_shared = findViewById(R.id.edit_shared);
        btn_save = findViewById(R.id.btn_shared_save);
        btn_load = findViewById(R.id.btn_shared_load);

        test = getSharedPreferences("test", MODE_PRIVATE);
        SharedPreferences.Editor editor = test.edit();


        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("data", edit_shared.getText().toString());
                editor.commit();
            }
        });

        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sl_text.setText(test.getString("data","null"));

            }
        });
    }
}