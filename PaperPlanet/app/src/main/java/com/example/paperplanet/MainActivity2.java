package com.example.paperplanet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button perehod=(Button) findViewById(R.id.perehod);// создаем кнопку на форме с айди названием переход
        perehod.setOnClickListener(this);

        Button tretia=(Button) findViewById(R.id.tretia); // описание второй кнопки
        tretia.setOnClickListener(this::onClick2);

        ImageButton imageButton=(ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(this::onClick3);
    }

    @Override
    public void onClick(View view) {//работа по переходу по кнопке между формами
        Intent vtoraua=new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(vtoraua);
    }
    public void onClick2(View view) {
        Intent vtoraua = new Intent(MainActivity2.this, MainActivity4.class);
        startActivity(vtoraua);
    }
    public void onClick3(View view) {
        Intent vtoraua = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(vtoraua);
    }
}