package com.example.harikachowdary.doublenav;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by HarikaChowdary on 6/7/2016.
 */
public class ThirdFragment extends Fragment{

    View myView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myView = inflater.inflate(R.layout.third_layout,container,false);
        Button newPage = (Button) myView.findViewById(R.id.paymentbtn);
        newPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), payment.class);
                startActivity(intent);
            }
        });
        return myView;
    }

  /*  @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);

        TextView t1=(TextView) view.findViewById(R.id.textView3);
        EditText e1=(EditText) view.findViewById(R.id.pname);
        EditText e2=(EditText) view.findViewById(R.id.postaladdr);
        EditText e3=(EditText) view.findViewById(R.id.mail);
        EditText e4=(EditText) view.findViewById(R.id.number);
        TextView t2=(TextView) view.findViewById(R.id.cost);
        EditText e5=(EditText) view.findViewById(R.id.editText7);

        TextView t3=(TextView) view.findViewById(R.id.textView4);
        EditText e6=(EditText) view.findViewById(R.id.editText8);
        TextView t4=(TextView) view.findViewById(R.id.textView5);

    }*/


}
