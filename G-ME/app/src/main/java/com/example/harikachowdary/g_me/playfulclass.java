package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class playfulclass extends AppCompatActivity {


    ImageButton moreplayfulbtn,playfulfactsbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playfulclass);


        moreplayfulbtn = (ImageButton) findViewById(R.id.moreplayfulbtn);


        moreplayfulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(playfulclass.this, moreplayful.class);
                startActivity(intent);
            }
        });

        playfulfactsbtn = (ImageButton) findViewById(R.id.playfulfactsbtn);


        playfulfactsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(playfulclass.this, playfulfacts.class);
                startActivity(intent);
            }
        });}
    public void browsergame(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.miniclip.com/games/en/"));
        startActivity(browserIntent);
    }

    }





