package com.example.iqapp101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

/**
 * This activity is created for the viewing a splash screen before opening the home page
 */

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /**
         * This is the first thread created for the splash screen
         */
Thread myThread = new Thread(){
    @Override
    public void run() {
        try {
            sleep(1000);
            Intent intent = new Intent(Splash.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

};
/**
 * This block is to start the thread created for the splash screen
 */
    myThread.start();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                startActivity(new Intent(Splash.this, MainActivity.class));
                finish();
            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 5000);

    }
}