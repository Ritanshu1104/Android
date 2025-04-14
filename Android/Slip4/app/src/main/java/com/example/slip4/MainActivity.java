package com.example.slip4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText Number=(EditText) findViewById(R.id.NNumber);
        Button submit=(Button) findViewById(R.id.btn_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long factorial =1;
                int Number1=Integer.parseInt(Number.getText().toString());
                for(int i=Number1;i>0;i--)
                {
                    factorial=i*factorial;
                }
                Intent intent=new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("Fact",factorial);
                startActivity(intent);

            }
        });

    }
}