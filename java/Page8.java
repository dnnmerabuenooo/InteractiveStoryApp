package com.example.interactivestory;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page8 extends AppCompatActivity {

    TextView page8;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);

        page8 = findViewById(R.id.page8);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page8.setText(name + " put a hand to his heart and told himself,");
    }

    public void goToPage9(View view){
        Intent i = new Intent(this, Page9.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage7(View view){
        Intent i = new Intent(this, Page7.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}