package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener{

    //1.
    Button btGames, btRating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //2.
        btGames = findViewById(R.id.btGames);
        btGames.setOnClickListener(this);

        btRating = findViewById(R.id.btRating);
        btRating.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(btGames == v){
            Intent i = new Intent(this, gameslist.class);
            startActivity(i);
        }else{
            Intent i = new Intent(this, ListActivity.class);
            startActivity(i);
        }
    }
}
