package com.example.slip7;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    Button btnRed,btnBlue,btnGreen,btnYellow,btnPurple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.text1);
        btnRed=findViewById(R.id.b1);
        btnBlue=findViewById(R.id.b2);
        btnGreen=findViewById(R.id.b3);
        btnYellow=findViewById(R.id.b4);
        btnPurple=findViewById(R.id.b5);

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(30F);
                tv.setTextColor(Color.parseColor("red"));
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(20F);
                tv.setTextColor(Color.parseColor("#0000FF"));
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(30F);
                tv.setTextColor(Color.parseColor("#00FF00"));
            }
        });

        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(20F);
                tv.setTextColor(Color.parseColor("yellow"));
            }
        });
        btnPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(20F);
                tv.setTextColor(Color.parseColor("purple"));
            }
        });



    }
}