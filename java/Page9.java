package com.example.interactivestory;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page9 extends AppCompatActivity {

    TextView page9;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page9);

        page9 = findViewById(R.id.page9);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page9.setText("Then " + name + " saw a pond.");
    }

    public void goToPage10(View view){
        Intent i = new Intent(this, Page10.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage8(View view){
        Intent i = new Intent(this, Page8.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}