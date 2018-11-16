package com.example.user.myapplication;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
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
    TextView tvFrenchopen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvName = findViewById(R.id.tvName);
        tvAge = findViewById(R.id.tvAge);
        tvWeight = findViewById(R.id.tvWeight);
        tvLength = findViewById(R.id.tvLength);
        tvGrandslams = findViewById(R.id.tvGrandslams );

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference refrence = database.getReference("Players");

 /*       lvUsers = findViewById(R.id.lvUsers);
        users = new ArrayList<>();

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
        lvUsers.setAdapter(adapter);*/

        refrence.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Map<String, String> map = (Map<String, String>) dataSnapshot.getValue();
                tvName.setText(map.get("Name"));

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
