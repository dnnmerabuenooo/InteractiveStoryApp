package com.example.interactivestory;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page6 extends AppCompatActivity {

    TextView page6;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        page6 = findViewById(R.id.page6);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page6.setText(name + " stretched his hands.. but the stars were still out of his reach.");
    }

    public void goToPage7(View view){
        Intent i = new Intent(this, Page7.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage5(View view){
        Intent i = new Intent(this, Page5.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}