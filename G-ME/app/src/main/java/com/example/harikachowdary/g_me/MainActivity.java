package com.example.harikachowdary.g_me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton hbtn,rbtn,ebtn;
    ImageButton button,angrybtn,sadbtn;
Button todo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        hbtn = (ImageButton) findViewById(R.id.hbtn);
        button = (ImageButton) findViewById(R.id.button);
        


        hbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, happy.class);
                startActivity(intent);
            }
        });

        ebtn = (ImageButton) findViewById(R.id.ebtn);


        ebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, exhausted.class);
                startActivity(intent);
            }
        });

        rbtn = (ImageButton) findViewById(R.id.rbtn);


        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, relaxed.class);
                startActivity(intent);
            }
        });

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, playfulclass.class);
            startActivity(intent);
        }
    });

    angrybtn = (ImageButton) findViewById(R.id.angrybtn);


    angrybtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, angryclass.class);
            startActivity(intent);
        }
    });

    sadbtn = (ImageButton) findViewById(R.id.sadbtn);


    sadbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, sadclass.class);
            startActivity(intent);
        }
    });
        todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, To_do.class);
                startActivity(intent);
            }
        });


}






}