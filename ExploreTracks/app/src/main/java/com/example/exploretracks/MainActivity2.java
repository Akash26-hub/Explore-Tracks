package com.example.exploretracks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {
    private static ImageView i2,fav,dialog;
    TextView dialogtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        i2 = (ImageView) findViewById(R.id.button);
        fav=(ImageView) findViewById(R.id.imageView33);
        dialog = (ImageView) findViewById(R.id.imageView24);
        dialogtext=(TextView)findViewById(R.id.textView12);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getBaseContext(), MainActivity3.class);

                finish();
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