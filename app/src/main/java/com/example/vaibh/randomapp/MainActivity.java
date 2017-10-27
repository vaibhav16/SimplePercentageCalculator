package com.example.vaibh.randomapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView totalTextView;
    EditText percentText;
    EditText numberText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalTextView = (TextView) findViewById(R.id.totalTextView);
        percentText = (EditText) findViewById(R.id.percentText);
        numberText = (EditText) findViewById(R.id.numberText);

        Button calcButton  =  (Button) findViewById(R.id.calcButton);
        calcButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                float percent =  Float.parseFloat(percentText.getText().toString());
                float dec = percent/100;
                float total= dec * Float.parseFloat(numberText.getText().toString());
                totalTextView.setText(Float.toString(total));

            }
        });

    }








}
