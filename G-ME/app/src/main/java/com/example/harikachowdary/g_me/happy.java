package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class happy extends AppCompatActivity {
ImageButton hbtn1,hbtn2,hbtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);


        hbtn1 = (ImageButton) findViewById(R.id.hbtn1);


        hbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(happy.this, SelfTime.class);
                startActivity(intent);
            }
        });
        hbtn2 = (ImageButton) findViewById(R.id.hbtn2);


        hbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(happy.this, PokeFrnd.class);
                startActivity(intent);
            }
        });
        hbtn3 = (ImageButton) findViewById(R.id.hbtn3);


        hbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(happy.this, HIntrstFacts.class);
                startActivity(intent);
            }
        });
    }
}
