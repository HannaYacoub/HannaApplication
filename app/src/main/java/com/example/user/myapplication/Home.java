package com.example.user.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener,DialogInterface.OnClickListener{

    //1.
    Button btGames, btRating ;    @Override
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
    @Override
    public void onClick(DialogInterface dialog, int which) {
        if(which==dialog.BUTTON_POSITIVE)
        {
                finish();
        }else{
            Intent intent= new Intent(getApplication(),Home.class);
            startActivity(intent);
        }


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Are you sure you want to close application?");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes",this);
        builder.setNegativeButton("No",this);

        AlertDialog dialog=builder.create();
        dialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.settings:

                break;
            case R.id.about:
                Intent i = new Intent(this, AboutActivity.class);
                startActivity(i);
                break;
        }
        return true;
    }
}
