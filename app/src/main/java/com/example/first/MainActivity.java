package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
    TextView tvResult;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        tvResult = findViewById(R.id.tvResult);
        btnCalc = findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = etNum1.getText().toString();
                String s2 = etNum2.getText().toString();

                if (s1.isEmpty() || s2.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "נא למלא את שני המספרים",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                double num1 = Double.parseDouble(s1);
                double num2 = Double.parseDouble(s2);
                double result = num1 + num2;


                if (result == (long) result) {
                    tvResult.setText(String.valueOf((long) result));
                } else {
                    tvResult.setText(String.valueOf(result));
                }
            }
        });
    }
}