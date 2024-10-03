package com.example.paperplanet;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button avtori = (Button) findViewById(R.id.avtori);
        avtori.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent knopka=new Intent(MainActivity4.this, MainActivity5.class);
        startActivity(knopka);
        }
    }
