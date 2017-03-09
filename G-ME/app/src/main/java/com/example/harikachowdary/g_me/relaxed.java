package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class relaxed extends AppCompatActivity {
    ImageButton rbtn1,rbtn2,rbtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relaxed);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rbtn1 = (ImageButton) findViewById(R.id.rbtn1);


        rbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(relaxed.this, Shopping.class);
                startActivity(intent);
            }
        });
        rbtn2 = (ImageButton) findViewById(R.id.rbtn2);


        rbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(relaxed.this, SetGoals.class);
                startActivity(intent);
            }
        });
        rbtn3 = (ImageButton) findViewById(R.id.rbtn3);


        rbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(relaxed.this, RIntrstFacts.class);
                startActivity(intent);
            }
        });
    }

}
