package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class AddGameActivity extends AppCompatActivity implements View.OnClickListener{
    EditText gameName,time;
    Button done;
    TimePicker addtime;
    int hour, min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_game);
        gameName = (EditText) findViewById(R.id.gameName);
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(this);

        addtime = (TimePicker) findViewById(R.id.timePicker);
        addtime.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                hour = hourOfDay;
                min = minute;
                Toast.makeText(getApplicationContext(), hourOfDay+":"+minute, Toast.LENGTH_SHORT).show();
            }
        });

    }



    @Override
    public void onClick(View v) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference();
        reference.child("Games").push().setValue(new Game(gameName.getText().toString(), hour, min));
        Intent i = new Intent(this,gameslist.class);
        startActivity(i);
    }
}
