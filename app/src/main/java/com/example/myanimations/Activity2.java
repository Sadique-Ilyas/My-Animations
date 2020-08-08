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

public class Activity2 extends AppCompatActivity {
    private TextView textView21,
            textView22,
            textView23,
            textView24,
            textView25,
            textView26,
            textView27,
            textView28,
            textView29,
            textView30;
    private Button button21,
            button22,
            button23,
            button24,
            button25,
            button26,
            button27,
            button28,
            button29,
            button30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        initializeViews();

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FlipInY).duration(2000).repeat(1).playOn(textView21);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FlipOutX).duration(2000).repeat(1).playOn(textView22);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FlipOutY).duration(2000).repeat(1).playOn(textView23);
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Hinge).duration(2000).repeat(1).playOn(textView24);
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Landing).duration(2000).repeat(1).playOn(textView25);
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Pulse).duration(2000).repeat(1).playOn(textView26);
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RollIn).duration(2000).repeat(1).playOn(textView27);
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RollOut).duration(2000).repeat(1).playOn(textView28);
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RotateIn).duration(2000).repeat(1).playOn(textView29);
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RotateInDownLeft).duration(2000).repeat(1).playOn(textView30);
            }
        });
    }

    private void initializeViews() {
        textView21 = findViewById(R.id.textView21);
        textView22 = findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        textView24 = findViewById(R.id.textView24);
        textView25 = findViewById(R.id.textView25);
        textView26 = findViewById(R.id.textView26);
        textView27 = findViewById(R.id.textView27);
        textView28 = findViewById(R.id.textView28);
        textView29 = findViewById(R.id.textView29);
        textView30 = findViewById(R.id.textView30);

        button21 = findViewById(R.id.Button21);
        button22 = findViewById(R.id.Button22);
        button23 = findViewById(R.id.Button23);
        button24 = findViewById(R.id.Button24);
        button25 = findViewById(R.id.Button25);
        button26 = findViewById(R.id.Button26);
        button27 = findViewById(R.id.Button27);
        button28 = findViewById(R.id.Button28);
        button29 = findViewById(R.id.Button29);
        button30 = findViewById(R.id.Button30);
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
            startActivity(new Intent(Activity2.this, Activity3.class));
        }
        return super.onOptionsItemSelected(item);
    }
}