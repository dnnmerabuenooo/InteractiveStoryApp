package com.example.interactivestory;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page10 extends AppCompatActivity {

    TextView page10;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page10);

        page10 = findViewById(R.id.page10);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page10.setText(name + " gazed at the stars and was joyous. He divided into the pond.");
    }

    public void goToPage11(View view){
        Intent i = new Intent(this, Page11.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage9(View view){
        Intent i = new Intent(this, Page9.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}