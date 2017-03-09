package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class sadclass extends AppCompatActivity {

    ImageButton sadhelp,sadfactsbtn,hangoutbtn,musicbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sadclass);

        sadhelp = (ImageButton) findViewById(R.id.sadhelp);


        sadhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sadclass.this, sadhelpclass.class);
                startActivity(intent);
            }
        });

        sadfactsbtn = (ImageButton) findViewById(R.id.sadfactsbtn);


        sadfactsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sadclass.this, sadfactsclass.class);
                startActivity(intent);
            }
        });

        hangoutbtn = (ImageButton) findViewById(R.id.hangoutbtn);


        hangoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sadclass.this, hangout.class);
                startActivity(intent);
            }
        });

        musicbtn = (ImageButton) findViewById(R.id.musicbtn);


        musicbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sadclass.this, Music.class);
                startActivity(intent);
            }
        });
    }
}
