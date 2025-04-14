package com.example.slip15;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup1,radioGroup2;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);

        RadioButton Male = findViewById(R.id.radioOption1_1);
        RadioButton Female = findViewById(R.id.radioOption1_2);
        RadioButton Yes = findViewById(R.id.radioOption2_1);
        RadioButton No = findViewById(R.id.radioOption2_2);

        submitButton = findViewById(R.id.submitButton);

        TextView textView = findViewById(R.id.textView);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedid1 = radioGroup1.getCheckedRadioButtonId();
                int selectedid2 = radioGroup2.getCheckedRadioButtonId();


                if (selectedid1 != -1 && selectedid2 != -1) {
                    String str = "Male: " + Male.isChecked() + "\n Female: " + Female.isChecked() + "\nYes" + Yes.isChecked() + "\nNo" + No.isChecked();
                    textView.setText(str);
                } else {
                    Toast.makeText(MainActivity.this, "Please select options in both groups", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}