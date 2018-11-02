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
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lvcountries = (ListView) findViewById(R.id.lvTopTen);

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
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        lvcountries.setAdapter(arrayAdapter);
        lvcountries.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem = arrayList.get(position);
        Intent intent = new Intent(this, DetailsActivity.class);
        if(selectedItem.equals("Nadal")) {
            intent.putExtra("player","Nadal");
        }else if(selectedItem.equals("Federer")){

        }

        if(selectedItem.equals("Federer")) {
            intent.putExtra("player","Federer");
        }else if(selectedItem.equals("Djokovic")){

        }

        if(selectedItem.equals("Djokovic")) {
            intent.putExtra("player","Djokovic");
        }else if(selectedItem.equals("Juan Martin")) {

        }

        if(selectedItem.equals("Juan Martin")) {
            intent.putExtra("player","Juan Martin");
        }else if(selectedItem.equals("Zverev")) {

        }

        if(selectedItem.equals("Zverev")) {
            intent.putExtra("player","Zverev");
        }else if(selectedItem.equals("Marin")) {

        }

        if(selectedItem.equals("Marin")) {
            intent.putExtra("player","Marin");
        }else if(selectedItem.equals("Dominic")) {

        }

        if(selectedItem.equals("Dominic")) {
            intent.putExtra("player","Dominic");
        }else if(selectedItem.equals("Grigor")) {

        }

        if(selectedItem.equals("Grigor")) {
            intent.putExtra("player","Grigor");
        }else if(selectedItem.equals("Anderson")) {

        }

        if(selectedItem.equals("Anderson")) {
            intent.putExtra("player","Anderson");
        }else if(selectedItem.equals("Isner")) {

        }

        if(selectedItem.equals("Isner")) {
            intent.putExtra("player", "Isner");

        }
        startActivity(intent);

    }
}
