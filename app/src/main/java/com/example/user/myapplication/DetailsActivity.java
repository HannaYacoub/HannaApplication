package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvAge;
    TextView tvWeight;
    TextView tvLength;
    TextView tvGrandslams;
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
        tvGrandslams = findViewById(R.id.tvGrandslams);
        tvPartner = findViewById(R.id.tvPartner);
        tvFrenchopen = findViewById(R.id.tvFrenchopen);


    }
}
