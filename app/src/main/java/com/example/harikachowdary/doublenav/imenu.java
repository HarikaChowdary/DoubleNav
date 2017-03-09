package com.example.harikachowdary.doublenav;

/**
 * Created by HarikaChowdary on 6/18/2016.
 */
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class imenu extends Fragment implements View.OnClickListener {

    protected Button selectColoursButton;

    protected CharSequence[] colours = {"a", "b", "c", "d", "e", "f"};

    protected ArrayList<CharSequence> selectedColours = new ArrayList<CharSequence>();

    public int cost, quantity = 0;
    public String str;
    public Button b;
    public EditText e;
    public int flag=0,f=0;
    public View myView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

         myView = inflater.inflate(R.layout.imenu, container, false);
       // return myView;
        selectColoursButton = (Button) myView.findViewById(R.id.select_colours);

        selectColoursButton.setOnClickListener(this);

       b=(Button)myView.findViewById(R.id.costbtn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                cost=0;
                // flag=0;


                EditText e1 = (EditText) myView.findViewById(R.id.editText1);

                if(e1.getVisibility()==View.VISIBLE){
                     if (!e1.getText().toString().isEmpty()) {
                        quantity = Integer.parseInt(e1.getText().toString());
                        cost = cost + (5 * quantity);


                    }
                }



                final EditText e2 = (EditText) myView.findViewById(R.id.editText2);


                if(e2.getVisibility() == View.VISIBLE){
                    // flag=1;
                    //String strValue = e.getText().toString();
                    if (!e2.getText().toString().isEmpty()) {
                        quantity = Integer.parseInt(e2.getText().toString());
                        cost = cost + (5 * quantity);


                    }
                }


                final EditText e3 = (EditText) myView.findViewById(R.id.editText3);

                if(e3.getVisibility() == View.VISIBLE) {
                    //flag=1;//String strValue = e.getText().toString();
                    if (!e3.getText().toString().isEmpty()) {
                        quantity = Integer.parseInt(e3.getText().toString());
                        cost = cost + (5 * quantity);
                        EditText e = (EditText) myView.findViewById(R.id.editText);


                    }
                }


                final EditText e4 = (EditText) myView.findViewById(R.id.editText4);

                if(e4.getVisibility() == View.VISIBLE) {
                    // flag=1;//String strValue = e.getText().toString();
                    if (!e4.getText().toString().isEmpty()) {
                        quantity = Integer.parseInt(e4.getText().toString());
                        cost = cost + (8 * quantity);
                        EditText e = (EditText) myView.findViewById(R.id.editText);


                    }
                }

                final EditText e5 = (EditText) myView.findViewById(R.id.editText5);

                if(e5.getVisibility() == View.VISIBLE) {
                    //  flag=1;//St5ing strValue = e.getText().toString();
                    if (!e5.getText().toString().isEmpty()) {
                        quantity = Integer.parseInt(e5.getText().toString());
                        cost = cost + (10 * quantity);
                        EditText e = (EditText) myView.findViewById(R.id.editText);

                    }
                }


                final EditText e6 = (EditText) myView.findViewById(R.id.editText6);

                if (e6.getVisibility() == View.VISIBLE) {
                    // flag=1;//String strValue = e.getText().toString();
                    if (!e6.getText().toString().isEmpty()) {
                        quantity = Integer.parseInt(e6.getText().toString());
                        cost = cost + (10 * quantity);
                        EditText e = (EditText) myView.findViewById(R.id.editText);


                    }



                }
                e=(EditText)myView.findViewById(R.id.editText);
                e.setVisibility(View.VISIBLE);
                e.setText("" + cost);





            }


        });



        return myView;

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.select_colours:

              showSelectColoursDialog();
                // TODO: Show the colours dialog

                break;

            default:

                break;
        }
    }

    protected void showSelectColoursDialog() {

        boolean[] checkedColours = new boolean[colours.length];

        int count = colours.length;

        for (int i = 0; i < count; i++)

            checkedColours[i] = selectedColours.contains(colours[i]);

        DialogInterface.OnMultiChoiceClickListener coloursDialogListener = new DialogInterface.OnMultiChoiceClickListener() {

            @Override

            public void onClick(DialogInterface dialog, int which, boolean isChecked) {



                if (isChecked)


                {   selectedColours.add(colours[which]);f++;}

                else

                {


                    selectedColours.remove(colours[which]);
                    if ((colours[which].equals("a"))) {
                        TextView t = (TextView) getView().findViewById(R.id.txt1);
                        t.setVisibility(View.GONE);
                        flag++;

                        EditText e = (EditText) getView().findViewById(R.id.editText1);
                        e.setVisibility(View.GONE);
                    } else if ((colours[which].equals("b"))) {
                        TextView t = (TextView) getView().findViewById(R.id.txt2);
                        t.setVisibility(View.GONE);
                        flag++;// flag=0;
                        EditText e = (EditText) getView().findViewById(R.id.editText2);
                        e.setVisibility(View.GONE);
                    } else if ((colours[which].equals("c"))) {
                        TextView t = (TextView) getView().findViewById(R.id.txt3);
                        t.setVisibility(View.GONE);
                        flag++;// flag=0;
                        EditText e = (EditText) getView().findViewById(R.id.editText3);
                        e.setVisibility(View.GONE);
                    } else if ((colours[which].equals("d"))) {
                        TextView t = (TextView) getView().findViewById(R.id.txt4);
                        t.setVisibility(View.GONE);
                        flag++;//  flag=0;
                        EditText e = (EditText) getView().findViewById(R.id.editText4);
                        e.setVisibility(View.GONE);
                    } else if ((colours[which].equals("e"))) {
                        TextView t = (TextView) getView().findViewById(R.id.txt5);
                        t.setVisibility(View.GONE);
                        flag++;
                        EditText e = (EditText) getView().findViewById(R.id.editText5);
                        e.setVisibility(View.GONE);
                    } else if ((colours[which].equals("f"))) {
                        TextView t = (TextView) getView().findViewById(R.id.txt6);
                        t.setVisibility(View.GONE);
                        flag++;// flag=0;
                        EditText e = (EditText) getView().findViewById(R.id.editText6);
                        e.setVisibility(View.GONE);
                    }


                    if((f-flag)==0)
                    {
                        e.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                    }


                }


                onChangeSelectedColours();



            }

        };

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Select");

        builder.setMultiChoiceItems(colours, checkedColours, coloursDialogListener);

        AlertDialog dialog = builder.create();

        dialog.show();

    }


    protected void onChangeSelectedColours() {

        StringBuilder stringBuilder = new StringBuilder();

        for (CharSequence colour : selectedColours)

        {
            stringBuilder.append(colour + ",");

        }
        selectColoursButton.setText(stringBuilder.toString());
        str = selectColoursButton.getText().toString();



        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            b.setVisibility(View.VISIBLE);
            String strr = st.nextToken();
            if ((strr.equals("a"))) {
                TextView t = (TextView) getView().findViewById(R.id.txt1);
                t.setVisibility(View.VISIBLE);
                //f++;
                EditText e = (EditText) getView().findViewById(R.id.editText1);
                e.setVisibility(View.VISIBLE);
            } else if ((strr.equals("b"))) {
                TextView t = (TextView) getView().findViewById(R.id.txt2);
                t.setVisibility(View.VISIBLE);
                //f++;
                EditText e = (EditText) getView().findViewById(R.id.editText2);
                e.setVisibility(View.VISIBLE);
            } else if ((strr.equals("c"))) {
                TextView t = (TextView) getView().findViewById(R.id.txt3);
                t.setVisibility(View.VISIBLE);
                //f++;
                EditText e = (EditText) getView().findViewById(R.id.editText3);
                e.setVisibility(View.VISIBLE);
            } else if ((strr.equals("d"))) {
                TextView t = (TextView) getView().findViewById(R.id.txt4);
                t.setVisibility(View.VISIBLE);
                //f++;
                EditText e = (EditText) getView().findViewById(R.id.editText4);
                e.setVisibility(View.VISIBLE);
            } else if ((strr.equals("e"))) {
                TextView t = (TextView) getView().findViewById(R.id.txt5);
                t.setVisibility(View.VISIBLE);
                //f++;
                EditText e = (EditText) getView().findViewById(R.id.editText5);
                e.setVisibility(View.VISIBLE);
            } else if ((strr.equals("f"))) {
                TextView t = (TextView) getView().findViewById(R.id.txt6);
                t.setVisibility(View.VISIBLE);
                //f++;
                EditText e = (EditText) getView().findViewById(R.id.editText6);
                e.setVisibility(View.VISIBLE);
            }


        }


    }

    }


















