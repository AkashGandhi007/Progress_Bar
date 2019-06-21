package com.akash.loading_dialog;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog dialog;
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(MainActivity.this);
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View dialoView = layoutInflater.inflate(R.layout.loader , null);
        builder.setView(dialoView);
        builder.setCancelable(false);
        dialog = builder.create();
        dialog.show();
    }
}
