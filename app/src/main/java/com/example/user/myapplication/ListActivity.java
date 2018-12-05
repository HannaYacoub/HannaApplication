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

        arrayList.add("1. Nadal                                                                   7660");
        arrayList.add("2. Djokovic                                                              7445");
        arrayList.add("3. Federer                                                                6260");
        arrayList.add("4. Juan Martin                                                        5760");
        arrayList.add("5. Zverev                                                                   5052");
        arrayList.add("6. Marin                                                                    4185");
        arrayList.add("7. Dominic                                                              3825");
        arrayList.add("8. Anderson                                                            3730");
        arrayList.add("9. Isner                                                                    3380");
        arrayList.add("10. Grigor                                                               3335");

        arrayAdapter = new CustomAdapter(this, R.layout.custom, players);
        lvcountries.setAdapter(arrayAdapter);
        lvcountries.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem = arrayList.get(position);
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("player",players.get(position));
        startActivity(intent);

    }
}
