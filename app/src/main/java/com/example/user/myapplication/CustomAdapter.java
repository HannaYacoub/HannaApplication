package com.example.user.myapplication;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.myapplication.R;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Player> {

    private int resourceLayout;
    private Context mContext;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<Player> objects) {
        super(context, resource, objects);
        this.resourceLayout = resource;
        this.mContext = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v =convertView;
        if(v == null)
            v = LayoutInflater.from(mContext).inflate(resourceLayout,parent, false);


        Player p = getItem(position);

        if (p != null) {
            TextView tvName = (TextView) v.findViewById(R.id.PlayerTv);
            tvName.setText(p.getName());

            ImageView imageView = (ImageView) v.findViewById(R.id.playerImageView);
            imageView.setImageResource(p.getImage());
        }
        return v;
    }
}

