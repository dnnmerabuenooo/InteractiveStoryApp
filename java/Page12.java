package com.example.interactivestory;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page12 extends AppCompatActivity {

    TextView page12;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page12);

        page12 = findViewById(R.id.page12);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page12.setText(name + " climbed out and sat on the bank.");
    }

    public void goToPage13(View view){
        Intent i = new Intent(this, Page13.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage11(View view){
        Intent i = new Intent(this, Page11.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}