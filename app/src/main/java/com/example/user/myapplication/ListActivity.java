package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView lvcountries;
    CustomAdapter arrayAdapter;
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayList<Player> players = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lvcountries = (ListView) findViewById(R.id.lvTopTen);


        players.add(new Player("Rafael Nadal", "22", "80", "1.80", "15",R.drawable.nadal));
        players.add(new Player("Novak Djokovic", "31", "80", "1.88", "14",R.drawable.djokovic));
        players.add(new Player("Roger Federer", "37", "80", "1.85", "20",R.drawable.federer));
        players.add(new Player("Juan Martin del Porto", "30", "80", "1.98", "1",R.drawable.juanmartin));
        players.add(new Player("Alexander Zverev", "21", "80", "1.98", "0",R.drawable.zverev));
        players.add(new Player("Marin Cilic", "30", "80", "1.98", "1",R.drawable.marincilic));
        players.add(new Player("Dominic Thiem", "25", "80", "1.85", "0",R.drawable.dominicthiem));
        players.add(new Player("Kevin Anderson", "32", "80", "2.03", "0",R.drawable.anderson));
        players.add(new Player("john Isner", "33", "80", "2.8", "0",R.drawable.isner));
        players.add(new Player("Grigor Dimitrov", "27", "80", "1.90", "0",R.drawable.grigor));


        arrayAdapter = new CustomAdapter(this, R.layout.custom, players);
        lvcountries.setAdapter(arrayAdapter);
        lvcountries.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("player",players.get(position));
        startActivity(intent);

    }
}
