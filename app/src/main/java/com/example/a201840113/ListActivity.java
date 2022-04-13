package com.example.a201840113;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lv_data = findViewById(R.id.lv_data);
        lv_data.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1,new String[]{"123","456","789"}));
    }
}