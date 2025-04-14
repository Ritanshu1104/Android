package com.example.slip10;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView text1;

    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        Intent i=getIntent();
        double p;
        p=i.getDoubleExtra("Result",0.0);
        text1.setText("Result is"+p);
        double avg;
        avg=i.getDoubleExtra("Average",0.0);
        text2.setText("Average is"+avg);


    }
}