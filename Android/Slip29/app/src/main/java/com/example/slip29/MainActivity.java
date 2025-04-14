package com.example.slip29;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private Button greetButton;
    private TextView greetingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the views
        nameEditText = findViewById(R.id.nameEditText);
        greetButton = findViewById(R.id.greetButton);
        greetingTextView = findViewById(R.id.greetingTextView);

        // Set an OnClickListener for the button
        greetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the name from the EditText
                String name = nameEditText.getText().toString().trim();

                // Check if the name is empty, otherwise set the greeting
                if (!name.isEmpty()) {
                    greetingTextView.setText("Hello, " + name + "!");
                } else {
                    greetingTextView.setText("Hello, welcome!");
                }
            }
        });
    }
}
