package com.example.naret.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.naret.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        getSupportActionBar().setTitle("Home");
    }
}
