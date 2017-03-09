package com.example.harikachowdary.g_me;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class helpme1class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpme1class);

        TabHost tab = (TabHost) findViewById(R.id.tabHost);
        tab.setup();

        TabHost.TabSpec spec3 = tab.newTabSpec("ADVICE 1");
        spec3.setIndicator("ADVICE 1");
        spec3.setContent(R.id.advice1);
        tab.addTab(spec3);



        TabHost.TabSpec spec4 = tab.newTabSpec("ADVICE 2");
        spec4.setIndicator("ADVICE 2");
        spec4.setContent(R.id.advice2);
        tab.addTab(spec4);

        TabHost.TabSpec spec5 = tab.newTabSpec("ADVICE 3");
        spec5.setIndicator("ADVICE 3");
        spec5.setContent(R.id.advice3);
        tab.addTab(spec5);

    }
    }

