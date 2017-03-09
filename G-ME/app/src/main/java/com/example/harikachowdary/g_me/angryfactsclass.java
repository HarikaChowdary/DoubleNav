package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ViewFlipper;

public class angryfactsclass extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper flippy3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angryfactsclass);



            flippy3 = (ViewFlipper)findViewById(R.id.viewFlipper3);
            flippy3.setOnClickListener(this);
        }

    public void onClick(View arg0)
    {
        flippy3.showNext();
    }




    public void browserfacts1(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dailygood.org/story/312/10-life-changing-facts-about-anger/"));
        startActivity(browserIntent);
    }

    public void browserfacts2(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tipsywriter.com/blog/6-interesting-facts-about-anger/"));
        startActivity(browserIntent);
    }
}
