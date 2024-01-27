package com.example.interactivestory;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page3 extends AppCompatActivity {

    TextView page3;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        page3 = findViewById(R.id.page3);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        page3.setText("Then, " + name + " saw a hillock.");
    }

    public void goToPage4(View view){
        Intent i = new Intent(this, Page4.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }

    public void goToPage2(View view){
        Intent i = new Intent(this, Page2.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}