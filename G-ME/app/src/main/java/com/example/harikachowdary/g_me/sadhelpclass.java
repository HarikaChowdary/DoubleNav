package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TabHost;
import android.widget.ViewFlipper;

public class sadhelpclass extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper flippy2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sadhelpclass);

        flippy2 = (ViewFlipper)findViewById(R.id.viewFlipper2);
        flippy2.setOnClickListener(this);

        TabHost tab = (TabHost) findViewById(R.id.tabHost);
        tab.setup();

        TabHost.TabSpec spec6 = tab.newTabSpec("WAY OUT");
        spec6.setIndicator("WAY OUT");
        spec6.setContent(R.id.wayout);
        tab.addTab(spec6);






    }

    public void onClick(View arg0)
    {
        flippy2.showNext();
    }

    public void browsersadlink1(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.wikihow.com/Overcome-Sadness"));
        startActivity(browserIntent);
    }

    public void browsersadlink2(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.oprah.com/spirit/Why-Youre-Sad-How-to-Stop-Being-Sad-Deepak-Chopra"));
        startActivity(browserIntent);
    }


}

