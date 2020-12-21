package com.example.exploretracks;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity3 extends AppCompatActivity {
    private static ImageView i,fav;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        i = (ImageView) findViewById(R.id.imageView6);
        fav=(ImageView) findViewById(R.id.imageView20);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getBaseContext(), MainActivity2.class);
                startActivity(intent);
            }
        });


    }



}