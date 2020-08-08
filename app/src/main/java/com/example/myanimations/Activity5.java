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

public class Activity5 extends AppCompatActivity {
    private TextView textView51, textView52, textView53, textView54, textView55, textView56, textView57, textView58, textView59, textView60;
    private Button button51, button52, button53, button54, button55, button56, button57, button58, button59, button60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        initializeViews();

        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.TakingOff).duration(2000).repeat(1).playOn(textView51);
            }
        });

        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Wave).duration(2000).repeat(1).playOn(textView52);
            }
        });

        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Wobble).duration(2000).repeat(1).playOn(textView53);
            }
        });

        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomIn).duration(2000).repeat(1).playOn(textView54);
            }
        });

        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomInDown).duration(2000).repeat(1).playOn(textView55);
            }
        });

        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomInLeft).duration(2000).repeat(1).playOn(textView56);
            }
        });

        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomInRight).duration(2000).repeat(1).playOn(textView58);
            }
        });

        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomInUp).duration(2000).repeat(1).playOn(textView58);
            }
        });

        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomOut).duration(2000).repeat(1).playOn(textView59);
            }
        });

        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomOutDown).duration(2000).repeat(1).playOn(textView60);
            }
        });
    }

    private void initializeViews() {
        textView51 = findViewById(R.id.textView51);
        textView52 = findViewById(R.id.textView52);
        textView53 = findViewById(R.id.textView53);
        textView54 = findViewById(R.id.textView54);
        textView55 = findViewById(R.id.textView55);
        textView56 = findViewById(R.id.textView56);
        textView57 = findViewById(R.id.textView57);
        textView58 = findViewById(R.id.textView58);
        textView59 = findViewById(R.id.textView59);
        textView60 = findViewById(R.id.textView60);
        button51 = findViewById(R.id.Button51);
        button52 = findViewById(R.id.Button52);
        button53 = findViewById(R.id.Button53);
        button54 = findViewById(R.id.Button54);
        button55 = findViewById(R.id.Button55);
        button56 = findViewById(R.id.Button56);
        button57 = findViewById(R.id.Button57);
        button58 = findViewById(R.id.Button58);
        button59 = findViewById(R.id.Button59);
        button60 = findViewById(R.id.Button60);
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
            startActivity(new Intent(Activity5.this, Activity6.class));
        }
        return super.onOptionsItemSelected(item);
    }
}