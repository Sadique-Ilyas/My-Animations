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

public class Activity4 extends AppCompatActivity {
    private TextView textView41, textView42, textView43, textView44, textView45, textView46, textView47, textView48, textView49, textView50;
    private Button button41, button42, button43, button44, button45, button46, button47, button48, button49, button50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        initializeViews();

        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideInDown).duration(2000).repeat(1).playOn(textView41);
            }
        });

        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideInLeft).duration(2000).repeat(1).playOn(textView42);
            }
        });

        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideInRight).duration(2000).repeat(1).playOn(textView43);
            }
        });

        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideInUp).duration(2000).repeat(1).playOn(textView44);
            }
        });

        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideOutDown).duration(2000).repeat(1).playOn(textView45);
            }
        });

        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideOutLeft).duration(2000).repeat(1).playOn(textView46);
            }
        });

        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideOutRight).duration(2000).repeat(1).playOn(textView47);
            }
        });

        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideOutUp).duration(2000).repeat(1).playOn(textView48);
            }
        });

        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.StandUp).duration(2000).repeat(1).playOn(textView49);
            }
        });

        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Swing).duration(2000).repeat(1).playOn(textView50);
            }
        });
    }

    private void initializeViews() {
        textView41 = findViewById(R.id.textView41);
        textView42 = findViewById(R.id.textView42);
        textView43 = findViewById(R.id.textView43);
        textView44 = findViewById(R.id.textView44);
        textView45 = findViewById(R.id.textView45);
        textView46 = findViewById(R.id.textView46);
        textView47 = findViewById(R.id.textView47);
        textView48 = findViewById(R.id.textView48);
        textView49 = findViewById(R.id.textView49);
        textView50 = findViewById(R.id.textView50);
        button41 = findViewById(R.id.Button41);
        button42 = findViewById(R.id.Button42);
        button43 = findViewById(R.id.Button43);
        button44 = findViewById(R.id.Button44);
        button45 = findViewById(R.id.Button45);
        button46 = findViewById(R.id.Button46);
        button47 = findViewById(R.id.Button47);
        button48 = findViewById(R.id.Button48);
        button49 = findViewById(R.id.Button49);
        button50 = findViewById(R.id.Button50);
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
            startActivity(new Intent(Activity4.this, Activity5.class));
        }
        return super.onOptionsItemSelected(item);
    }
}