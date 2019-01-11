package com.example.faza.finaltes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //membuat objek button yang berisi tombol button
        Button btn = (Button) findViewById(R.id.buttons);
        //memberi aksi klik pada objek button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //link perpindahan activity
                Intent intent = new Intent(MainActivity.this,ActivityUtama.class);
                startActivity(intent);
            }
        });
        ;

    }

}
