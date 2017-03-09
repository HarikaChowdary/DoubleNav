package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class exhausted extends AppCompatActivity {
    ImageButton ebtn1,ebtn2,ebtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhausted);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ebtn1 = (ImageButton) findViewById(R.id.rbtn1);


        ebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(exhausted.this, Music.class);
                startActivity(intent);
            }
        });
        ebtn2 = (ImageButton) findViewById(R.id.rbtn2);


        ebtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(exhausted.this, Food.class);
                startActivity(intent);
            }
        });
        ebtn3 = (ImageButton) findViewById(R.id.ebtn3);


        ebtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(exhausted.this, Excercise.class);
                startActivity(intent);
            }
        });
    }

}
