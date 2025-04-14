package com.example.slip10;

import static java.lang.Math.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

            EditText text1;
            EditText text2;
            Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                int n1=Integer.parseInt(text1.getText().toString());
                int n2=Integer.parseInt(text2.getText().toString());
                double p;
                p= pow(n1,n2);
                double avg;
                avg= (double) (n1 + n2) /2;
                Intent i;
                i = new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("Result",p);
                i.putExtra("Average",avg);
                startActivity(i);

            }
        });


    }
}