package com.example.slip_3;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePicker picker;
    Button btnDisplay;
    Button btnShow;
    TextView tvw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tvw=(TextView) findViewById(R.id.textView1);
        picker=(DatePicker) findViewById(R.id.datePicker);
        btnDisplay=(Button) findViewById(R.id.display);
        btnShow=(Button) findViewById(R.id.show_dialog);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvw.setText("Selected date: "+picker.getDayOfMonth()+"/"+(picker.getMonth()+1)+"/"+picker.getYear());
            }
        });
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar c= Calendar.getInstance();
                int mYear=c.get(Calendar.YEAR);
                int mMonth=c.get(Calendar.MONTH);
                int mDay=c.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog picker=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        tvw.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },mYear,mMonth,mDay);

                picker.show();

            }
        });

    }
}