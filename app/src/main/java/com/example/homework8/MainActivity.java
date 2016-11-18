package com.example.homework8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.*;



public class MainActivity extends AppCompatActivity {

    EditText ET, ET2;
    TextView tv;
    Button plus, minus, gop, dvi;
    int num1, num2;
    Integer Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET = (EditText) findViewById(R.id.editText);
        ET2 = (EditText) findViewById(R.id.editText2);
        plus = (Button) findViewById(R.id.button);
        minus = (Button) findViewById(R.id.button2);
        gop = (Button) findViewById(R.id.button3);
        dvi = (Button) findViewById(R.id.button4);
        tv = (TextView) findViewById(R.id.Result);
        View.OnClickListener clisten = new View.OnClickListener() {
            public void onClick(View v) {
                num1 = Integer.parseInt(ET.getText().toString());
                num2 = Integer.parseInt(ET2.getText().toString());
                switch(v.getId()){
                    case R.id.button :
                        Result = num1 + num2;
                        break;
                    case R.id.button2 :
                        Result = num1 - num2;
                        break;
                    case R.id.button3 :
                        Result = num1 * num2;
                        break;
                    case R.id.button4 :
                        Result = num1 / num2;
                        break;
                }
                tv.setText("계산결과 : "+Result);
            }
        };
        plus.setOnClickListener(clisten);
        minus.setOnClickListener(clisten);
        gop.setOnClickListener(clisten);
        minus.setOnClickListener(clisten);
    }
}