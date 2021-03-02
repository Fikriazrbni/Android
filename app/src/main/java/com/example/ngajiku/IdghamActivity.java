package com.example.ngajiku;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class IdghamActivity extends AppCompatActivity {
    ImageButton ButtonSuara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idgham);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer Suaraya = MediaPlayer.create(this,R.raw.idgham_ya);
        final MediaPlayer Suaranun = MediaPlayer.create(this,R.raw.idgham_nun);
        final MediaPlayer Suaramim = MediaPlayer.create(this,R.raw.idgham_mim);
        final MediaPlayer Suarawaw = MediaPlayer.create(this,R.raw.idgham_waw);
        final MediaPlayer Suaralam = MediaPlayer.create(this,R.raw.idgham_lam);
        final MediaPlayer Suararo = MediaPlayer.create(this,R.raw.idgham_ro);

        ButtonSuara = (ImageButton) findViewById(R.id.idgham_lam);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Suaralam.start();
                }
            });

        ButtonSuara = (ImageButton) findViewById(R.id.idgham_ya);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaraya.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.idgham_nun);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaranun.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.idgham_mim);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaramim.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.idgham_wawu);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suarawaw.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.idgham_ro);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suararo.start();
            }
        });


    }
}