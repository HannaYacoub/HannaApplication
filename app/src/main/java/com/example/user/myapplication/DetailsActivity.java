package com.example.user.myapplication;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Map;

public class DetailsActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvAge;
    TextView tvWeight;
    TextView tvLength;
    TextView tvGrandslams ;
    TextView tvPartner;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvName = findViewById(R.id.tvName);
        tvAge = findViewById(R.id.tvAge);
        tvWeight = findViewById(R.id.tvWeight);
        tvLength = findViewById(R.id.tvLength);
        tvGrandslams = findViewById(R.id.tvGrandslams );
        imageView = findViewById(R.id.imageView2);


        Player player = (Player) getIntent().getSerializableExtra("player");

        tvName.setText(player.getName());
        tvAge.setText(player.getAge());
        tvWeight.setText(player.getWeight());
        tvGrandslams.setText(player.getGrandslams());
        imageView.setImageResource(player.getImage());


    }
}
