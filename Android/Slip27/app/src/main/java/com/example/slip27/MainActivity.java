package com.example.slip27;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnchangecase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText editTextInput=findViewById(R.id.editTextInput);
        RadioGroup radioGroup=findViewById(R.id.radioGroup);
         btnchangecase=findViewById(R.id.changeCase);
        btnchangecase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb1=findViewById(R.id.radioUpper);
                RadioButton rb2=findViewById(R.id.radioLower);
                String userInput =editTextInput.getText().toString();

                String result="";
                if(rb1.isChecked())
                {
                    result=userInput.toUpperCase();
                } else if (rb2.isChecked()) {
                    result=userInput.toLowerCase();
                }else {
                    result="Please select option";
                }
                Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();

                }

        });

    }
}