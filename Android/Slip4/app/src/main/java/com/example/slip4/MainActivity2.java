package com.example.slip4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView recv_msg ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        recv_msg = findViewById(R.id.Fact);
        Intent intent=getIntent();
        long factorial=intent.getLongExtra("Fact",0);
        recv_msg.setText(String.valueOf(factorial));

    }
}