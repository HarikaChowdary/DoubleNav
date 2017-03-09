package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PokeFrnd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poke_frnd);


    }
    public void fb(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(browserIntent);
    }
    public void tw(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/?lang=en"));
        startActivity(browserIntent);
    }
    public void ms(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://myspace.com/"));
        startActivity(browserIntent);
    }
    public void gm(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/collections/featured"));
        startActivity(browserIntent);
    }

}
