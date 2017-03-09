package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ViewFlipper;

public class Food extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper flipR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        flipR = (ViewFlipper) findViewById(R.id.viewFlipper2);
        flipR.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        flipR.showNext();
    }

    public void dpz(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dominos.co.in/"));
        startActivity(browserIntent);
    }

    public void fp(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.foodpanda.in/"));
        startActivity(browserIntent);
    }

    public void fs(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.faasos.com/"));
        startActivity(browserIntent);
    }


    public void zm(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com/hyderabad/order-food-online"));
        startActivity(browserIntent);
    }

    public void fyt(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=n2jG2c_ENQ4&list=PLnvT_7ZyrvIz02Hrb6c4cYm8HTIoH9Xju"));
        startActivity(browserIntent);
    }


}