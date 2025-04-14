package com.example.slip5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etSurname, etClass, etHobbies, etMarks;
    RadioGroup radioGroupGender;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etSurname = findViewById(R.id.etSurname);
        etClass = findViewById(R.id.etClass);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        etHobbies = findViewById(R.id.etHobbies);
        etMarks = findViewById(R.id.etMarks);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String surname = etSurname.getText().toString();
                String studentClass = etClass.getText().toString();
                int selectedGenderId = radioGroupGender.getCheckedRadioButtonId();
                RadioButton selectedGenderButton = findViewById(selectedGenderId);
                String gender = selectedGenderButton.getText().toString();
                String hobbies = etHobbies.getText().toString();
                String marks = etMarks.getText().toString();

                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("surname", surname);
                intent.putExtra("class", studentClass);
                intent.putExtra("gender", gender);
                intent.putExtra("hobbies", hobbies);
                intent.putExtra("marks", marks);
                startActivity(intent);
            }
        });
    }
}
