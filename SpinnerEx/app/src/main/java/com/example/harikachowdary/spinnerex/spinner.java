package com.example.harikachowdary.spinnerex;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class spinner extends AppCompatActivity implements View.OnClickListener {

    protected Button selectColoursButton;

    protected CharSequence[] colours = {"T-Shirt", "Trouser", "Kurti", "Saree", "Salwar", "Sherwani"};

    protected ArrayList<CharSequence> selectedColours = new ArrayList<CharSequence>();

   public int cost, quantity = 0;
    public String str;
    public Button b;
    public EditText e;
    public int flag=0,f=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        selectColoursButton = (Button) findViewById(R.id.select_colours);

        selectColoursButton.setOnClickListener(this);

        b=(Button)findViewById(R.id.costbtn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                cost=0;



        EditText e1 = (EditText) findViewById(R.id.editText1);

                if(e1.getVisibility()==View.VISIBLE){
                   // flag=1;
                    //String strValue = e.getText().toString();
                    if (!e1.getText().toString().isEmpty()) {
                        quantity = Integer.parseInt(e1.getText().toString());
                        cost = cost + (5 * quantity);


                    }
                }



        final EditText e2 = (EditText) findViewById(R.id.editText2);


                if(e2.getVisibility() == View.VISIBLE){
                   // flag=1;
                        //String strValue = e.getText().toString();
                        if (!e2.getText().toString().isEmpty()) {
                            quantity = Integer.parseInt(e2.getText().toString());
                            cost = cost + (5 * quantity);


                        }
                    }


        final EditText e3 = (EditText) findViewById(R.id.editText3);

                if(e3.getVisibility() == View.VISIBLE) {
                    //flag=1;//String strValue = e.getText().toString();
                    if (!e3.getText().toString().isEmpty()) {
                        quantity = Integer.parseInt(e3.getText().toString());
                        cost = cost + (5 * quantity);
                        EditText e = (EditText) findViewById(R.id.editText);


                    }
                }


        final EditText e4 = (EditText) findViewById(R.id.editText4);

                if(e4.getVisibility() == View.VISIBLE) {
                   // flag=1;//String strValue = e.getText().toString();
                    if (!e4.getText().toString().isEmpty()) {
                        quantity = Integer.parseInt(e4.getText().toString());
                        cost = cost + (8 * quantity);
                        EditText e = (EditText) findViewById(R.id.editText);


                    }
                }

        final EditText e5 = (EditText) findViewById(R.id.editText5);

                if(e5.getVisibility() == View.VISIBLE) {
                  //  flag=1;//St5ing strValue = e.getText().toString();
                    if (!e5.getText().toString().isEmpty()) {
                        quantity = Integer.parseInt(e5.getText().toString());
                        cost = cost + (10 * quantity);
                        EditText e = (EditText) findViewById(R.id.editText);

                    }
                }


        final EditText e6 = (EditText) findViewById(R.id.editText6);

                if (e6.getVisibility() == View.VISIBLE) {
                   // flag=1;//String strValue = e.getText().toString();
                    if (!e6.getText().toString().isEmpty()) {
                        quantity = Integer.parseInt(e6.getText().toString());
                        cost = cost + (10 * quantity);
                        EditText e = (EditText) findViewById(R.id.editText);


                    }



                }
                e=(EditText)findViewById(R.id.editText);
                e.setVisibility(View.VISIBLE);
                e.setText("" + cost);





        }


    });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_spinner, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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
                    if ((colours[which].equals("T-Shirt"))) {
                        TextView t = (TextView) findViewById(R.id.Tee);
                        t.setVisibility(View.GONE);
                        flag++;

                        EditText e = (EditText) findViewById(R.id.editText1);
                        e.setVisibility(View.GONE);
                    } else if ((colours[which].equals("Trouser"))) {
                        TextView t = (TextView) findViewById(R.id.Trouser);
                        t.setVisibility(View.GONE);
                        flag++;// flag=0;
                        EditText e = (EditText) findViewById(R.id.editText2);
                        e.setVisibility(View.GONE);
                    } else if ((colours[which].equals("Kurti"))) {
                        TextView t = (TextView) findViewById(R.id.Kurti);
                        t.setVisibility(View.GONE);
                        flag++;// flag=0;
                        EditText e = (EditText) findViewById(R.id.editText3);
                        e.setVisibility(View.GONE);
                    } else if ((colours[which].equals("Saree"))) {
                        TextView t = (TextView) findViewById(R.id.Saree);
                        t.setVisibility(View.GONE);
                        flag++;//  flag=0;
                        EditText e = (EditText) findViewById(R.id.editText4);
                        e.setVisibility(View.GONE);
                    } else if ((colours[which].equals("Salwar"))) {
                        TextView t = (TextView) findViewById(R.id.Salwar);
                        t.setVisibility(View.GONE);
                        flag++;
                        EditText e = (EditText) findViewById(R.id.editText5);
                        e.setVisibility(View.GONE);
                    } else if ((colours[which].equals("Sherwani"))) {
                        TextView t = (TextView) findViewById(R.id.Sherwani);
                        t.setVisibility(View.GONE);
                        flag++;// flag=0;
                        EditText e = (EditText) findViewById(R.id.editText6);
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

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

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

       /* if (str.isEmpty()) {
            b.setVisibility(View.GONE);
            e.setVisibility(View.GONE);
        } else {*/

            StringTokenizer st = new StringTokenizer(str, ",");
            while (st.hasMoreTokens()) {
                b.setVisibility(View.VISIBLE);
                String strr = st.nextToken();
                if ((strr.equals("T-Shirt"))) {
                    TextView t = (TextView) findViewById(R.id.Tee);
                    t.setVisibility(View.VISIBLE);
                   //f++;
                    EditText e = (EditText) findViewById(R.id.editText1);
                    e.setVisibility(View.VISIBLE);
                } else if ((strr.equals("Trouser"))) {
                    TextView t = (TextView) findViewById(R.id.Trouser);
                    t.setVisibility(View.VISIBLE);
                    //f++;
                    EditText e = (EditText) findViewById(R.id.editText2);
                    e.setVisibility(View.VISIBLE);
                } else if ((strr.equals("Kurti"))) {
                    TextView t = (TextView) findViewById(R.id.Kurti);
                    t.setVisibility(View.VISIBLE);
                    //f++;
                    EditText e = (EditText) findViewById(R.id.editText3);
                    e.setVisibility(View.VISIBLE);
                } else if ((strr.equals("Saree"))) {
                    TextView t = (TextView) findViewById(R.id.Saree);
                    t.setVisibility(View.VISIBLE);
                    //f++;
                    EditText e = (EditText) findViewById(R.id.editText4);
                    e.setVisibility(View.VISIBLE);
                } else if ((strr.equals("Salwar"))) {
                    TextView t = (TextView) findViewById(R.id.Salwar);
                    t.setVisibility(View.VISIBLE);
                    //f++;
                    EditText e = (EditText) findViewById(R.id.editText5);
                    e.setVisibility(View.VISIBLE);
                } else if ((strr.equals("Sherwani"))) {
                    TextView t = (TextView) findViewById(R.id.Sherwani);
                    t.setVisibility(View.VISIBLE);
                    //f++;
                    EditText e = (EditText) findViewById(R.id.editText6);
                    e.setVisibility(View.VISIBLE);
                }


            }


        }


    }




//}









