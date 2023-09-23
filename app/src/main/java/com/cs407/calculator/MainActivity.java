package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    public void addClick(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);

        double x = Double.parseDouble(firstNum.getText().toString());
        double y = Double.parseDouble(secondNum.getText().toString());
        double answer = x + y;
        goToActivity(answer);
    }

    public void subtractClick(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);

        double x = Double.parseDouble(firstNum.getText().toString());
        double y = Double.parseDouble(secondNum.getText().toString());
        double answer = x - y;
        goToActivity(answer);
    }

    public void multiplyClick(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);

        double x = Double.parseDouble(firstNum.getText().toString());
        double y = Double.parseDouble(secondNum.getText().toString());
        double answer = x * y;
        goToActivity(answer);
    }

    public void divideClick(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);

        double x = Double.parseDouble(firstNum.getText().toString());
        double y = Double.parseDouble(secondNum.getText().toString());
        double answer = x / y;
        goToActivity(answer);
    }

    public void goToActivity(double s) {
        Intent intent = new Intent(this, answer.class);
        intent.putExtra("calculated", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}