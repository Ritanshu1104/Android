package com.example.slip12;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button First;

    Button Second;

    Button Third;

    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textView1=findViewById(R.id.textView1);
        Dialog dialog=new Dialog(this);
        dialog.setContentView(R.layout.custom_layout);
        dialog.show();

        First=dialog.findViewById(R.id.button1);
        Second=dialog.findViewById(R.id.button2);
        Third=dialog.findViewById(R.id.button3);

        First.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=First.getText().toString();
                Toast.makeText(MainActivity.this,"Welcome"+str,Toast.LENGTH_SHORT).show();
            }
        });
        Second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Second.getText().toString();
                Toast.makeText(MainActivity.this,"Welcome"+str,Toast.LENGTH_SHORT).show();
            }
        });
        Third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=Third.getText().toString();
                Toast.makeText(MainActivity.this,"Welcome"+str,Toast.LENGTH_SHORT).show();
            }
        });

    }
}