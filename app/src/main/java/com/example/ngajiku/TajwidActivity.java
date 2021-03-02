package com.example.ngajiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.media.MediaPlayer;

public class TajwidActivity extends AppCompatActivity {

    ImageButton pindah1;
    ImageButton pindah2;
    ImageButton pindah3;
    ImageButton pindah4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajwid);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah1 = (ImageButton) findViewById(R.id.idzhar);
        pindah2 = (ImageButton) findViewById(R.id.idgham);
        pindah3 = (ImageButton) findViewById(R.id.iqlab);
        pindah4 = (ImageButton) findViewById(R.id.ikhfa);
        final MediaPlayer SuaraButton = MediaPlayer.create(this,R.raw.click2);

        pindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(TajwidActivity.this,IzharActivity.class);
            SuaraButton.start();
            startActivity(intent);
            }
        });

        pindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajwidActivity.this,IdghamActivity.class);
                SuaraButton.start();
                startActivity(intent);
            }
        });

        pindah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajwidActivity.this,IqlabActivity.class);
                SuaraButton.start();
                startActivity(intent);
            }
        });

        pindah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TajwidActivity.this,IkhfaActivity.class);
                SuaraButton.start();
                startActivity(intent);
            }
        });

    }
}