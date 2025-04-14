package com.example.slip25;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;
    private StringBuilder input = new StringBuilder();
    private double value1 = Double.NaN;
    private double value2;
    private char currentOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txtResult);

        setNumberClickListeners();
        setOperatorClickListeners();
    }

    private void setNumberClickListeners() {
        int[] numberIds = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
                R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id.btnDot};

        View.OnClickListener numberClickListener = view -> {
            Button button = (Button) view;
            input.append(button.getText());
            txtResult.setText(input.toString());
        };

        for (int id : numberIds) {
            findViewById(id).setOnClickListener(numberClickListener);
        }
    }

    private void setOperatorClickListeners() {
        int[] operatorIds = {R.id.btnAdd, R.id.btnAdd2, R.id.btnSubtract,
                R.id.btnMultiply, R.id.btnDivide, R.id.btnModulus};

        View.OnClickListener operatorClickListener = view -> {
            if (input.length() > 0) {
                value1 = Double.parseDouble(input.toString());
                input.setLength(0);
                Button button = (Button) view;
                currentOp = button.getText().charAt(0);
                txtResult.setText(String.valueOf(value1) + " " + currentOp);
            }
        };

        for (int id : operatorIds) {
            findViewById(id).setOnClickListener(operatorClickListener);
        }

        findViewById(R.id.btnEquals).setOnClickListener(view -> {
            if (input.length() > 0 && !Double.isNaN(value1)) {
                value2 = Double.parseDouble(input.toString());
                double result = calculateResult();
                txtResult.setText(String.valueOf(result));
                input.setLength(0);
                value1 = result;
            }
        });

        findViewById(R.id.btnClear).setOnClickListener(view -> {
            input.setLength(0);
            txtResult.setText("0");
            value1 = Double.NaN;
            value2 = 0;
        });
    }

    private double calculateResult() {
        switch (currentOp) {
            case '+': return value1 + value2;
            case '-': return value1 - value2;
            case '*': return value1 * value2;
            case '/': return value2 != 0 ? value1 / value2 : 0;
            case '%': return value1 % value2;
            default: return 0;
        }
    }
}
