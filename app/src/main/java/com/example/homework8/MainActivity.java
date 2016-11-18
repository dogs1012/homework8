package com.example.homework8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    EditText ET,ET2;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET = (EditText)findViewById(R.id.editText);

        ET2 = (EditText)findViewById(R.id.editText2);

        tv = (TextView)findViewById(R.id.result);﻿


    }
    public void plus(View v){

        int num1 = Integer.parseInt(ET.getText().toString());
        int num2 = Integer.parseInt(ET2.getText().toString());

        int result = num1 + num2;
        tv.setText("답은 :"  + result);

    }
    public void minus(View v){

        int num1 = Integer.parseInt(ET.getText().toString());
        int num2 = Integer.parseInt(ET2.getText().toString());

        int result = num1 - num2;
        tv.setText("답은 : " + result);}
    public void gop(View v){

        int num1 = Integer.parseInt(ET.getText().toString());
        int num2 = Integer.parseInt(ET2.getText().toString());

        int result = num1 * num2;
        tv.setText("답은 : " + result);}
    public void div(View v){

        int num1 = Integer.parseInt(ET.getText().toString());
        int num2 = Integer.parseInt(ET2.getText().toString());

        int result = num1 / num2;
        tv.setText("답은 ,: " + result);}
}
