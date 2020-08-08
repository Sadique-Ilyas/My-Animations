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

public class Activity1 extends AppCompatActivity {
    private TextView textView11, textView12, textView13, textView14, textView15, textView16,
            textView17, textView18, textView19, textView20;
    private Button button11, button12, button13, button14, button15, button16, button17, button18,
            button19, button20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        initializeViews();

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FadeInLeft).duration(2000).repeat(1).playOn(textView11);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FadeInRight).duration(2000).repeat(1).playOn(textView12);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FadeInUp).duration(2000).repeat(1).playOn(textView13);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FadeOut).duration(2000).repeat(1).playOn(textView14);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FadeOutDown).duration(2000).repeat(1).playOn(textView15);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FadeOutLeft).duration(2000).repeat(1).playOn(textView16);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FadeOutRight).duration(2000).repeat(1).playOn(textView17);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FadeOutUp).duration(2000).repeat(1).playOn(textView18);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Flash).duration(2000).repeat(1).playOn(textView19);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FlipInX).duration(2000).repeat(1).playOn(textView20);
            }
        });
    }

    private void initializeViews() {
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);
        textView18 = findViewById(R.id.textView18);
        textView19 = findViewById(R.id.textView19);
        textView20 = findViewById(R.id.textView20);

        button11 = findViewById(R.id.Button11);
        button12 = findViewById(R.id.Button12);
        button13 = findViewById(R.id.Button13);
        button14 = findViewById(R.id.Button14);
        button15 = findViewById(R.id.Button15);
        button16 = findViewById(R.id.Button16);
        button17 = findViewById(R.id.Button17);
        button18 = findViewById(R.id.Button18);
        button19 = findViewById(R.id.Button19);
        button20 = findViewById(R.id.Button20);
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
            startActivity(new Intent(Activity1.this, Activity2.class));
        }
        return super.onOptionsItemSelected(item);
    }
}