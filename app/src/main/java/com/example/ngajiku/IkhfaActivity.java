package com.example.ngajiku;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class IkhfaActivity extends AppCompatActivity {
    ImageButton ButtonSuara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikhfa);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //deklarasi suara jadi variabel
        final MediaPlayer Suaradal = MediaPlayer.create(this,R.raw.ikhfa_dal);
        final MediaPlayer Suaradhod = MediaPlayer.create(this,R.raw.ikhfa_dhod);
        final MediaPlayer Suaradzal = MediaPlayer.create(this,R.raw.ikhfa_dzal);
        final MediaPlayer Suarafa = MediaPlayer.create(this,R.raw.ikhfa_fa);
        final MediaPlayer Suarajim = MediaPlayer.create(this,R.raw.ikhfa_jim);
        final MediaPlayer Suarakaf = MediaPlayer.create(this,R.raw.ikhfa_kaf);
        final MediaPlayer Suaraqof = MediaPlayer.create(this,R.raw.ikhfa_qof);
        final MediaPlayer Suarashod = MediaPlayer.create(this,R.raw.ikhfa_shod);
        final MediaPlayer Suarasin = MediaPlayer.create(this,R.raw.ikhfa_sin);
        final MediaPlayer Suarasyin = MediaPlayer.create(this,R.raw.ikhfa_syin);
        final MediaPlayer Suarata = MediaPlayer.create(this,R.raw.ikhfa_ta);
        final MediaPlayer Suaratha = MediaPlayer.create(this,R.raw.ikhfa_tha);
        final MediaPlayer Suaratsa = MediaPlayer.create(this,R.raw.ikhfa_tsa);
        final MediaPlayer Suarazai = MediaPlayer.create(this,R.raw.ikhfa_zai);
        final MediaPlayer Suarazha = MediaPlayer.create(this,R.raw.ikhfa_zha);

        //ngatur biar tombolnya bersuara pas diklik

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_dal);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaradal.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_dhod);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaradhod.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_dzal);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaradzal.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_fa);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suarafa.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_jim);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suarajim.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_kaf);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suarakaf.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_qof);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaraqof.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_shad);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suarashod.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_sin);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suarasin.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_syin);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suarasyin.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_ta);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suarata.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_tha);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaratha.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_tsa);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suaratsa.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_zai);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suarazai.start();
            }
        });

        ButtonSuara = (ImageButton) findViewById(R.id.ikhfa_zha);
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Suarazha.start();
            }
        });
    }
}