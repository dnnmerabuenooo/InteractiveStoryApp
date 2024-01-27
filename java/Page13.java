package com.example.interactivestory;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page13 extends AppCompatActivity {

    TextView page13;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page13);

        page13 = findViewById(R.id.page13);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page13.setText(name + " sat and watched the stars twinkling in the pond.");
    }

    public void goToHomePage(View view){
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage12(View view){
        Intent i = new Intent(this, Page12.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}