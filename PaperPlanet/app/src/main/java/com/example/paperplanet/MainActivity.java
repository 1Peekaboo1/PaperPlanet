package com.example.paperplanet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private final int bb=5000; //Объявление переменной которая будет ждать 5 секунд, затем переменится на другую форму

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
            Intent tralala=new Intent(MainActivity.this,MainActivity2.class);
            MainActivity.this.startActivity(tralala);
            MainActivity.this.finish();
        }
        },bb);
    }
}