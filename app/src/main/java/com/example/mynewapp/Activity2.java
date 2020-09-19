package com.example.mynewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String Email = intent.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(Email);
    }
}