package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FireActivity extends AppCompatActivity {

    ListView lvUsers;
    ArrayList<String> users;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);

        lvUsers = findViewById(R.id.lvUsers);
        users = new ArrayList<>();

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);



    }
}
