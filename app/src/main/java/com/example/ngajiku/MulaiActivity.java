package com.example.ngajiku;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class MulaiActivity extends AppCompatActivity {
    ImageButton alertdialog1;
    ImageButton pindah1;
    ImageButton pindah2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);
        pindah1 = (ImageButton) findViewById(R.id.imageButton4);
        pindah2 = (ImageButton) findViewById(R.id.imageButton5);
        alertdialog1 = (ImageButton) findViewById(R.id.imageButton6);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.click2);

        pindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent intent = new Intent(MulaiActivity.this, HijaiyyahActivity.class);
                startActivity(intent);
            }
        });

        pindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent intent = new Intent(MulaiActivity.this, TajwidActivity.class);
                startActivity(intent);
            }
        });
        alertdialog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog1 = new AlertDialog.Builder(MulaiActivity.this);
                dialog1.setTitle("INFORMASI");
                dialog1.setMessage("Silahkan pilih mau belajar apa anda?");
                dialog1.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MulaiActivity.this, "Yuk Pilih", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialog1 = dialog1.create();
                alertDialog1.show();
            }
        });

    }
}