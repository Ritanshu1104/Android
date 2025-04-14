package com.example.slip5;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    TextView tvName, tvSurname, tvClass, tvGender, tvHobbies, tvMarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvName = findViewById(R.id.tvName);
        tvSurname = findViewById(R.id.tvSurname);
        tvClass = findViewById(R.id.tvClass);
        tvGender = findViewById(R.id.tvGender);
        tvHobbies = findViewById(R.id.tvHobbies);
        tvMarks = findViewById(R.id.tvMarks);

        // Get data from intent
        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String studentClass = getIntent().getStringExtra("class");
        String gender = getIntent().getStringExtra("gender");
        String hobbies = getIntent().getStringExtra("hobbies");
        String marks = getIntent().getStringExtra("marks");

        // Display the data
        tvName.setText(name);
        tvSurname.setText(surname);
        tvClass.setText(studentClass);
        tvGender.setText(gender);
        tvHobbies.setText(hobbies);
        tvMarks.setText(marks);
    }
}
