package com.example.faza.finaltes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //library untuk mengatur aliran untuk mengeksekusi tampilan
        Thread thread = new Thread(){
          public void run(){
              try {
                  //splash screen selama 4 detik
                  sleep(4000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }finally {
                  //setelah menjalankan splash screen lalu masuk ke activity halaman utama
                  startActivity(new Intent(SplashActivity.this, Login.class));
                  finish();
              }
          }
        };
        thread.start();
    }
}
