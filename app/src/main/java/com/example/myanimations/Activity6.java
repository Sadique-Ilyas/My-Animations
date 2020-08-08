package com.example.myanimations;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Activity6 extends AppCompatActivity {
    private TextView textView61, textView62, textView63;
    private Button button61, button62, button63;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        /* INITIALIZING VIEWS
            System.out.println("---------------------------------------------------------------------");
            System.out.print("private TextView ");
            for (int i = 61; i < 71; i++) {
                //System.out.println("textView" + i + " = findViewById(R.id.textView" +i+ ");");
                System.out.print("textView" + i + ",");
            }
            System.out.println();
            System.out.print("private Button ");
            for (int i = 61; i < 71; i++) {
                //System.out.println("button" + i + " = findViewById(R.id.Button" +i+ ");");
                System.out.print("button" + i + ",");
            }
            System.out.println("\n---------------------------------------------------------------------");
         */

        initializeViews();

        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomOutLeft).duration(2000).repeat(1).playOn(textView61);
            }
        });

        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomOutRight).duration(2000).repeat(1).playOn(textView62);
            }
        });

        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomOutUp).duration(2000).repeat(1).playOn(textView63);
            }
        });
    }

    private void initializeViews() {
        textView61 = findViewById(R.id.textView61);
        textView62 = findViewById(R.id.textView62);
        textView63 = findViewById(R.id.textView63);
        button61 = findViewById(R.id.Button61);
        button62 = findViewById(R.id.Button62);
        button63 = findViewById(R.id.Button63);
    }
}