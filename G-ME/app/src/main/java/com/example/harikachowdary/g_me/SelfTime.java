package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ViewFlipper;

public class SelfTime extends AppCompatActivity implements View.OnClickListener {
ViewFlipper flipH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_time);
        flipH=(ViewFlipper) findViewById(R.id.flipperH);
        flipH.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        flipH.showNext();
    }
    public void youtube(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Y3QpubKy8_s"));
        startActivity(browserIntent);
    }
}
