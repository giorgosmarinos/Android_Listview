package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview1);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("android");
        arrayList.add("application");
        arrayList.add("which");
        arrayList.add("shows");
        arrayList.add("how");
        arrayList.add("to");
        arrayList.add("create");
        arrayList.add("list");
        arrayList.add("view");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter((arrayAdapter));
    }
}
