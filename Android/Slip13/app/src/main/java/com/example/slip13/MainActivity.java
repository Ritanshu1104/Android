package com.example.slip13;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

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
        EditText f_name=findViewById(R.id.f_name);
        EditText l_name=findViewById(R.id.l_name);
        EditText address=findViewById(R.id.address);
        EditText phone=findViewById(R.id.phone);
        EditText email=findViewById(R.id.email);

        Button submit=findViewById(R.id.btn_submit);
        Button clear=findViewById(R.id.btn_clear);

        RadioButton male=findViewById(R.id.M);
        RadioButton female=findViewById(R.id.f);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= f_name.getText().toString();
                String str2= l_name.getText().toString();
                String str3= address.getText().toString();
                String str4= phone.getText().toString();
                String str5= email.getText().toString();
                String str6= male.getText().toString();
                String str7= female.getText().toString();
                String result=("Firstname: "+str+"\nLastname: "+str2+"\nAddress: "+str3+"\nPhone: "+str4+"\nEmail: "+str5+"\nmale: "+str6+"\nFemale"+str7 );
                Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();
        clear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
        });



    }
}