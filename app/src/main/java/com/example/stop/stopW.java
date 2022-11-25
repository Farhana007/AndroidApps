package com.example.stop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class stopW extends AppCompatActivity {

    Button btnStart , btnStop;
    Chronometer time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_w);

        btnStart = findViewById(R.id.btn2);
        btnStop = findViewById(R.id.btn3);
        time = findViewById(R.id.time);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time.setBase(SystemClock.elapsedRealtime());
                time.start();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time.stop();
                time.setBase(SystemClock.elapsedRealtime());



            }
        });
    }
}