package com.example.slip18;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button submit;

    EditText user,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.user);
        pwd=findViewById(R.id.pwd);
        submit=findViewById(R.id.s1);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = user.getText().toString().trim();
                String password = user.getText().toString().trim();
                String s1 = "abcde";
                String s2 = "abcde";
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter the username and password", Toast.LENGTH_LONG).show();
                } else if (username.equals(s1) && (password.equals(s2))) {
                    Toast.makeText(MainActivity.this, "Go  to next  activity", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Wrong username or password", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}