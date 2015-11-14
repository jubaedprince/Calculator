package com.example.jubaed.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText operator1, operator2;
    Button add, subtract, multiply, divide;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operator1 = (EditText) findViewById(R.id.operator1);
        operator2 = (EditText) findViewById(R.id.operator2);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        output = (TextView) findViewById(R.id.output);
    }

    public void calculate(View view){
        Button button = (Button)view;
        String operation = button.getText().toString();

        switch (operation){
            case "+":
                output.setText((Integer.parseInt(operator1.getText().toString())  + Integer.parseInt(operator2.getText().toString())+""));
                break;

            case "-":
                output.setText((Integer.parseInt(operator1.getText().toString()) - Integer.parseInt(operator2.getText().toString())+""));
                break;

            case "/":
                output.setText((Integer.parseInt(operator1.getText().toString())  / Integer.parseInt(operator2.getText().toString())+""));
                break;

            case "x":
                output.setText((Integer.parseInt(operator1.getText().toString())  * Integer.parseInt(operator2.getText().toString())+""));
                break;
        }
    }
}
