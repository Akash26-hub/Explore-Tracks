package com.example.exploretracks;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity3 extends AppCompatActivity {
    private static ImageView i,fav, dialog;
    TextView dialogtext;
    ToggleButton toggleButton;
    RecyclerView r;
    RecyclerView.Adapter MyListAdapter;
    RecyclerView.LayoutManager layoutManager;

    String[] list={"The Beginning", "The Beginning","The Beginning", "The Beginning", "The Beginning"};
    String[] timer={"20 min", "20 min", "20 min", "20 min", "20 min"};
    int[] img={R.drawable.rec11, R.drawable.rectangle9, R.drawable.rectangle9, R.drawable.rectangle9, R.drawable.rectangle9};
    int[] img2={R.drawable.paus,R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow};
    int[] img3={R.drawable.heartfull, R.drawable.heartfull, R.drawable.heartfull, R.drawable.heartfull, R.drawable.heartfull};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        i = (ImageView) findViewById(R.id.imageView6);
        dialog = (ImageView) findViewById(R.id.imageView24);
        dialogtext=(TextView)findViewById(R.id.textView12);
        fav=(ImageView) findViewById(R.id.imageView20);
        r =(RecyclerView) findViewById(R.id.r);
        r.setHasFixedSize(true);

        r.setLayoutManager(new LinearLayoutManager(this));
        MyListAdapter = new MyListAdapter(this, list,timer,img,img2,img3);
        r.setAdapter(MyListAdapter);


        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getBaseContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
        fav.setOnClickListener(new View.OnClickListener() {
            int button01pos = 0;
            public void onClick(View v) {
                if (button01pos == 0) {
                    fav.setImageResource(R.drawable.fav);
                    button01pos = 1;
                } else if (button01pos == 1) {
                    fav.setImageResource(R.drawable.favorite2);
                    button01pos = 0;
                }
                dialog.setVisibility(View.VISIBLE);
                dialogtext.setVisibility(View.VISIBLE);
                Timer t = new Timer();
                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        dialog.setVisibility(View.INVISIBLE);
                        dialogtext.setVisibility(View.INVISIBLE);
                    }
                }, 3000);
            }
        });

    }



}