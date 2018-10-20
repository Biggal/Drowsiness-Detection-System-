package com.pdi.abigailmusagindaus.pdiproj;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;


public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        android.os.Handler handle = new android.os.Handler();

        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarTelaPrincipal();
            }
        }, 3000);
    }

    private void mostrarTelaPrincipal() {
        Intent intent = new Intent(SplashActivity.this,
                Main2Activity.class);
        startActivity(intent);
        finish();
    }

}
