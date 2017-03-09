package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ViewFlipper;

public class sadfactsclass extends AppCompatActivity implements View.OnClickListener{


    ViewFlipper flippy1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sadfactsclass);

        flippy1 = (ViewFlipper)findViewById(R.id.viewFlipper1);
        flippy1.setOnClickListener(this);
    }

    public void onClick(View arg0)
    {
        flippy1.showNext();
    }

    public void browserinsplines(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.inc.com/jeff-haden/75-inspiring-motivational-quotes-for-being-happier.html"));
        startActivity(browserIntent);
    }
}
