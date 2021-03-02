package com.example.ngajiku;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HijaiyyahActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyyah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.tampil_hijaiyyah);
        show = (ImageButton) findViewById(R.id.alif);
        hide = (ImageButton) findViewById(R.id.ba);

        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);

        show.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        hide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        //Untuk Menambahkan Button Suara
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.alif); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.ba);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.ta);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.tsa);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.jim);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.haa);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.kho);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.dal);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.dzal);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.ro);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.zay);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.sin);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.syin);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.shod);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.dhod);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.tho);
        final MediaPlayer SuaraDzo = MediaPlayer.create(this, R.raw.zho);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.ain);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.ghoin);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.fa);
        final MediaPlayer Suaraqof = MediaPlayer.create(this, R.raw.qof);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.kaf);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.lam);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.mim);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.nun);
        final MediaPlayer SuaraWaw = MediaPlayer.create(this, R.raw.waw);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.ha);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.ya);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.alif); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.ba);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.ta);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.tsa);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.jim);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.haa);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.kho);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.dal);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.dzal);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.ro);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.za);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.sin);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.syin);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.shod);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.dhod);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.tho);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.dzo);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.ain);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.ghain);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.fa);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.qof);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.kaf);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.lam);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.mim);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.nun);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.waw);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.ha);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.ya);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hamzah_alif);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ba);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ta);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tsa);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.jim);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kha);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kho);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dal);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dzal);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.za);
                TampilGambar.startAnimation(animScale);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sin);
                TampilGambar.startAnimation(animScale);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.syin);
                TampilGambar.startAnimation(animScale);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.shad);
                TampilGambar.startAnimation(animScale);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dhod);
                TampilGambar.startAnimation(animScale);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tha);
                TampilGambar.startAnimation(animScale);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dzo);
                TampilGambar.startAnimation(animScale);
                SuaraDzo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ain);
                TampilGambar.startAnimation(animScale);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ghain);
                TampilGambar.startAnimation(animScale);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fa);
                TampilGambar.startAnimation(animScale);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.qof);
                TampilGambar.startAnimation(animScale);
                Suaraqof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kaf);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.lam);
                TampilGambar.startAnimation(animScale);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.mim);
                TampilGambar.startAnimation(animScale);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.nun);
                TampilGambar.startAnimation(animScale);

                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.wawu);
                TampilGambar.startAnimation(animScale);
                SuaraWaw.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ha);
                TampilGambar.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ya);
                TampilGambar.startAnimation(animScale);
                SuaraYa.start();
            }
        });

    }
}