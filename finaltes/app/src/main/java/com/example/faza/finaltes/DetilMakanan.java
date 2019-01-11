package com.example.faza.finaltes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetilMakanan extends AppCompatActivity {

    TextView txtJudul;
    ImageView imgMakanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detilmakanan);

        txtJudul = (TextView)findViewById(R.id.txtJudul);
        imgMakanan = (ImageView)findViewById(R.id.imgMakanan);
        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
        txtJudul.setText(receivedName);
        imgMakanan.setImageResource(receivedImage);
    }
}
