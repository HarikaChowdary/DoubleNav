package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class angryclass extends AppCompatActivity {

    ImageButton helpme1,calmbtn,angryfbtn,ahangoutbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angryclass);






                helpme1 = (ImageButton) findViewById(R.id.helpme1);


                helpme1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(angryclass.this, helpme1class.class);
                        startActivity(intent);
                    }
                });

        calmbtn = (ImageButton) findViewById(R.id.calmbtn);


        calmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(angryclass.this, calmclass.class);
                startActivity(intent);
            }
        });

        angryfbtn = (ImageButton) findViewById(R.id.angryfbtn);


        angryfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(angryclass.this, angryfactsclass.class);
                startActivity(intent);
            }
        });


        ahangoutbtn = (ImageButton) findViewById(R.id.ahangoutbtn);


        ahangoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(angryclass.this, hangout.class);
                startActivity(intent);
            }
        });
    }




    }




