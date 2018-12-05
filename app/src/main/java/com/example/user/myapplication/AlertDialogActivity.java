package com.example.user.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AlertDialogActivity extends AppCompatActivity implements DialogInterface.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if(which==dialog.BUTTON_POSITIVE)
        {
            super.onBackPressed();
            dialog.cancel();
        }
        if (which==dialog.BUTTON_NEGATIVE)
        {
            dialog.cancel();
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Are you sure");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes",this);
        builder.setNegativeButton("No",this);

        AlertDialog dialog=builder.create();
        dialog.show();
    }

    public static class Item {
        private int image;
        private String name;

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Item(int image, String name) {

            this.image = image;
            this.name = name;
        }
    }
}
