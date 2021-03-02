package com.example.ngajiku;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class IzharActivity extends AppCompatActivity {
    ImageButton ButtonSuara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izhar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        final MediaPlayer Suaraain = MediaPlayer.create(this,R.raw.izhar_ain);
        final MediaPlayer Suaraalif = MediaPlayer.create(this,R.raw.izhar_alif);
        final MediaPlayer Suaraghoin = MediaPlayer.create(this,R.raw.izhar_ghoin);
        final MediaPlayer Suaraha = MediaPlayer.create(this,R.raw.izhar_ha);
        final MediaPlayer Suarahaa = MediaPlayer.create(this,R.raw.izhar_haa);
        final MediaPlayer Suarakho = MediaPlayer.create(this,R.raw.izhar_kho);



        ButtonSuara = (ImageButton) findViewById(R.id.izhar_ain);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaraain.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.izhar_alif);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaraalif.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.izhar_ghoin);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaraghoin.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.izhar_ha);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaraha.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.izhar_kha);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suarahaa.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.izhar_kho);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suarakho.start();
            }
        });

    }
}