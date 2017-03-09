package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class moreplayful extends AppCompatActivity {

    TabHost tabHost;
    ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moreplayful);

        expandableListView=(ExpandableListView)findViewById(R.id.exp_ListView);
        List<String> Headings = new ArrayList<String>();

        // List<ImageView> IM2=new ArrayList<ImageView>();
        List<String> L1= new ArrayList<String>();
        List<String> L2= new ArrayList<String>();


       TabHost tab = (TabHost) findViewById(R.id.tabHost);
        tab.setup();

        TabHost.TabSpec spec1 = tab.newTabSpec("COMEDY SHOWS");
        spec1.setIndicator("COMEDY SHOWS");
        spec1.setContent(R.id.comedyshows);
        tab.addTab(spec1);






        TabHost.TabSpec spec2 = tab.newTabSpec("TACTICS");
        spec2.setIndicator("TACTICS");
        spec2.setContent(R.id.tactics);
        tab.addTab(spec2);




        HashMap<String,List<String>> childlist = new HashMap<String,List<String>>();
        String heading_items[] = getResources().getStringArray(R.array.comedy_shows);
        String l1[]= getResources().getStringArray(R.array.comedy_inter);
        String l2[]= getResources().getStringArray(R.array.comedy_ind);


        for(String title : heading_items)
        {
            Headings.add(title);
        }
        for(String title : l1)
        {
            L1.add(title);
        }
        for(String title : l2)
        {
            L2.add(title);
        }

        childlist.put(Headings.get(0),L1);
        childlist.put(Headings.get(1),L2);

        MyAdapter myAdapter=new MyAdapter(this,Headings,childlist);
        expandableListView.setAdapter(myAdapter);

    }

    public void browsercomedy(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sidereel.com/_television/genres/comedy"));
        startActivity(browserIntent);
    }


    public void browsertactic1(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.frictionalgames.com/forum/thread-5768.html"));
        startActivity(browserIntent);
    }
    public void browsertactic2(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=scare+tactics+best"));
        startActivity(browserIntent);
    }

}
