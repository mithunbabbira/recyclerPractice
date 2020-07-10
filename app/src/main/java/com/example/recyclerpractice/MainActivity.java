package com.example.recyclerpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    RecyclerAdapter recyclerAdapter;

    List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();

        recyclerView =findViewById(R.id.recyclerView);
        recyclerAdapter =new RecyclerAdapter(list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(recyclerAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);


        list.add("a");
        list.add("h");
        list.add("f");
        list.add("s");
        list.add("a");
        list.add("h");
        list.add("f");
        list.add("s");
        list.add("a");
        list.add("h");
        list.add("f");
        list.add("s");
        list.add("a");
        list.add("h");
        list.add("f");
        list.add("s");

    }
}