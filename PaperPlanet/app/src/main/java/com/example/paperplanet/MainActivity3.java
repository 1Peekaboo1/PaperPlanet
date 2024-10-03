package com.example.paperplanet;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button proceed = (Button) findViewById(R.id.proceed);
        proceed.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent knopka=new Intent(MainActivity3.this, MainActivity5.class);
        startActivity(knopka);
        }
    }
