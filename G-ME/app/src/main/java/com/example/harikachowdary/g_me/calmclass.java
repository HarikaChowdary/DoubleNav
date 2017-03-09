package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ViewFlipper;

public class calmclass extends AppCompatActivity {

    ViewFlipper flippy4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calmclass);


    }




    public void browserquotes1(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.goodreads.com/quotes/tag/anger-management"));
        startActivity(browserIntent);
    }

    public void browserquotes2(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tinybuddha.com/blog/20-things-to-do-when-youre-feeling-angry-with-someone/"));
        startActivity(browserIntent);
    }
}
