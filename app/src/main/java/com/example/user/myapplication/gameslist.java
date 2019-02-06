package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class gameslist extends AppCompatActivity implements View.OnClickListener{

    Button btAddGame;
    ListView lvGames;
    ArrayList<String> games = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameslist);

        btAddGame=findViewById(R.id.btAddGame);
        lvGames = findViewById(R.id.gamesList);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, games);
        lvGames.setAdapter(adapter);


    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, AddGameActivity.class);
        startActivity(i);

    }
}
