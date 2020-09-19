package com.example.mynewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT ="com.example.mynewapp.EXTRA_TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextPage();
            }
        });
    }   public void openNextPage(){
        EditText editText = (EditText) findViewById(R.id.EmailID);
        String Email = editText.getText().toString();
        Intent intent =new Intent(this,Activity2.class);
        intent.putExtra(EXTRA_TEXT,Email);
        startActivity(intent);
    }
}