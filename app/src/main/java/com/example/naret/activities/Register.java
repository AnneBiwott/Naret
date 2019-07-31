package com.example.naret.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.naret.R;

public class Register extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        getSupportActionBar().hide();

        findViewById(R.id.registerd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login =  new Intent(Register.this,Login.class);
                startActivity(login);
            }
        });
        findViewById(R.id.btn_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Register.this, Home.class);
                startActivity(home);
            }
        });
    }
}
