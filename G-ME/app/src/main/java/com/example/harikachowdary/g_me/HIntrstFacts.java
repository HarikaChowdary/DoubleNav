package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ViewFlipper;

public class HIntrstFacts extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper fliphf;
    private View args0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hintrst_facts);
        fliphf=(ViewFlipper) findViewById(R.id.FlipperHf);
        fliphf.setOnClickListener(this);
        fliphf.showNext();
    }



    public void ff(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.boredpanda.com/happy-facts/"));
        startActivity(browserIntent);
    }
    public void sf(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lifehack.org/articles/lifestyle/the-science-happiness.html"));
        startActivity(browserIntent);
    }
    public void wf(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://inktank.fi/60-of-the-worlds-happiest-facts/"));
        startActivity(browserIntent);
    }

    @Override
    public void onClick(View v) {

    }
}
