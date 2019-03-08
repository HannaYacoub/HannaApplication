package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class AddGameActivity extends AppCompatActivity implements View.OnClickListener{
    EditText gameName,time;
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_game);
        gameName = (EditText) findViewById(R.id.gameName);
        time = (EditText) findViewById(R.id.time);
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        Intent i = new Intent(this,gameslist.class);
        startActivity(i);
    }
}
