package com.example.slip11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etAddress, etPhone;
    Button btnInsert, btnShow;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etAddress = findViewById(R.id.etAddress);
        etPhone = findViewById(R.id.etPhone);
        btnInsert = findViewById(R.id.btnInsert);
        btnShow = findViewById(R.id.btnShow);

        databaseHelper = new DatabaseHelper(this);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String address = etAddress.getText().toString();
                String phone = etPhone.getText().toString();

                if (name.isEmpty() || address.isEmpty() || phone.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill all fields!", Toast.LENGTH_SHORT).show();
                } else {
                    boolean isInserted = databaseHelper.insertCustomer(name, address, phone);
                    if (isInserted) {
                        Toast.makeText(MainActivity.this, "Customer Added Successfully!", Toast.LENGTH_SHORT).show();
                        etName.setText("");
                        etAddress.setText("");
                        etPhone.setText("");
                    } else {
                        Toast.makeText(MainActivity.this, "Failed to Add Customer!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseHelper.showAllCustomers();
            }
        });
    }
}
