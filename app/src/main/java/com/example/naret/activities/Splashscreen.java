package com.example.naret.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.naret.R;

public class Splashscreen extends AppCompatActivity {
    ImageView mImage;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        mImage = findViewById(R.id.naret_logo);
        mText  = findViewById(R.id.start_text);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        mImage.startAnimation(myanim);
        mText.startAnimation(myanim);

        final Intent i = new Intent(this, Login.class);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    finish();

                }
            }

        };
        timer.start();
    }
}
