package com.example.interactivestory;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page11 extends AppCompatActivity {

    TextView page11;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);

        page11 = findViewById(R.id.page11);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page11.setText(name + " hit the surface of the water.");
    }

    public void goToPage12(View view){
        Intent i = new Intent(this, Page12.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage10(View view){
        Intent i = new Intent(this, Page10.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}