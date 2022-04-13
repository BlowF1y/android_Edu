package com.example.a201840113;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.a201840113.data.ListData;

import java.util.ArrayList;


public class ListCustomActivity extends AppCompatActivity {
    private ListView lv_view;
    private ArrayList<ListData> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_custom);
        list = new ArrayList<ListData>();
        list.add(new ListData("류중경","010-1234-5678",true));
        list.add(new ListData("류중경2","010-4563-5678",true));
        list.add(new ListData("류중경3","010-5678-5678",true));

        lv_view = findViewById(R.id.custom_list);

        lv_view.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return list.size();
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @SuppressLint("ViewHolder")
            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                view = getLayoutInflater().inflate(R.layout.activity_list_custom_item,viewGroup,false);

                TextView tx_view_1 = view.findViewById(R.id.tx_1);

                TextView tx_view_2 = view.findViewById(R.id.tx_2);
                tx_view_1.setText(list.get(i).getName());
                tx_view_2.setText(list.get(i).getNumber());
                ImageView imageView = view.findViewById(R.id.img_1);

                return view;
            }
        });


    }
}