package com.example.ngajiku;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class IqlabActivity extends AppCompatActivity {

    ImageButton ButtonSuara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqlab);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        final MediaPlayer Suaraba = MediaPlayer.create(this,R.raw.iqlab_ba);

        ButtonSuara = (ImageButton) findViewById(R.id.iqlab_ba);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaraba.start();
            }
        });
    }
}