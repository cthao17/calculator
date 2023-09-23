package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class answer extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        textView=(TextView) findViewById(R.id.textView);
        Intent intent=getIntent();
        double answer=intent.getDoubleExtra("calculated", 0.0);
        String str=String.valueOf(answer);
        textView.setText(str);
    }
}