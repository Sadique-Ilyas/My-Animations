package com.example.myanimations;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Activity3 extends AppCompatActivity {
    private TextView textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40;
    private Button button31, button32, button33, button34, button35, button36, button37, button38, button39, button40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        initializeViews();

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RotateInDownRight).duration(2000).repeat(1).playOn(textView31);
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RotateInUpLeft).duration(2000).repeat(1).playOn(textView32);
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RotateInUpRight).duration(2000).repeat(1).playOn(textView33);
            }
        });

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RotateOut).duration(2000).repeat(1).playOn(textView34);
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RotateOutDownLeft).duration(2000).repeat(1).playOn(textView35);
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RotateOutDownRight).duration(2000).repeat(1).playOn(textView36);
            }
        });

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RotateOutUpLeft).duration(2000).repeat(1).playOn(textView37);
            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RotateOutUpRight).duration(2000).repeat(1).playOn(textView38);
            }
        });

        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand).duration(2000).repeat(1).playOn(textView39);
            }
        });

        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Shake).duration(2000).repeat(1).playOn(textView40);
            }
        });
    }

    private void initializeViews() {
        textView31 = findViewById(R.id.textView31);
        textView32 = findViewById(R.id.textView32);
        textView33 = findViewById(R.id.textView33);
        textView34 = findViewById(R.id.textView34);
        textView35 = findViewById(R.id.textView35);
        textView36 = findViewById(R.id.textView36);
        textView37 = findViewById(R.id.textView37);
        textView38 = findViewById(R.id.textView38);
        textView39 = findViewById(R.id.textView39);
        textView40 = findViewById(R.id.textView40);
        button31 = findViewById(R.id.Button31);
        button32 = findViewById(R.id.Button32);
        button33 = findViewById(R.id.Button33);
        button34 = findViewById(R.id.Button34);
        button35 = findViewById(R.id.Button35);
        button36 = findViewById(R.id.Button36);
        button37 = findViewById(R.id.Button37);
        button38 = findViewById(R.id.Button38);
        button39 = findViewById(R.id.Button39);
        button40 = findViewById(R.id.Button40);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.nextActivity) {
            startActivity(new Intent(Activity3.this, Activity4.class));
        }
        return super.onOptionsItemSelected(item);
    }
}