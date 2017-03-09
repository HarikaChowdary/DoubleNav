package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ViewFlipper;

public class RIntrstFacts extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper flipRF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rintrst_facts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        flipRF = (ViewFlipper) findViewById(R.id.viewFlipperR);
        flipRF.setOnClickListener(this);

    }

    public void vyt(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eyU3bRy2x44&list=PLI3kQhLH6NvDGxgc0RBzZG3P2OOUVTWqT"));
        startActivity(browserIntent);
    }

    @Override
    public void onClick(View v) {
        flipRF.showNext();
    }
}
