package org.tensorflow.lite.examples.classification;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class StartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.goldenPoppy));

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(StartupActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 2000);   //waits for 2 seconds
    }
}