package com.apps.ankitraz.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main3Activity extends AppCompatActivity {
    ImageButton b1, b2, b3;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        username = getIntent().getStringExtra("user");

        b1 = (ImageButton) findViewById(R.id.logout);
        b2 = (ImageButton) findViewById(R.id.sea_button);
        b3 = (ImageButton) findViewById(R.id.search_button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Main3Activity.this, MainActivity.class);
                finish();
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Main3Activity.this, TimelineActivity.class);
                i1.putExtra("username", username);
                startActivity(i1);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(i1);
            }
        });
    }
}