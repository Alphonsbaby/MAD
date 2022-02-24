package com.example.sjcet.calculatomsmall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sjcet.calculatomsmall.R;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6;
    EditText e1,e2,e3;
    double ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.B1);
        b2 = (Button) findViewById(R.id.B2);
        b3 = (Button) findViewById(R.id.B3);
        b4 = (Button) findViewById(R.id.B4);
        b5 = (Button) findViewById(R.id.B5);
        e1 = (EditText) findViewById(R.id.E1);
        e2 = (EditText) findViewById(R.id.E2);
        e3 = (EditText) findViewById(R.id.E3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(e1.getText().toString());
                double b=Double.parseDouble((e2.getText().toString()));
                ans=a+b;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble((e1.getText().toString()));
                double b=Double.parseDouble((e2.getText().toString()));
                ans=a-b;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(e1.getText().toString());
                double b=Double.parseDouble((e2.getText().toString()));
                ans=a*b;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(e1.getText().toString());
                double b=Double.parseDouble(e2.getText().toString());
                if(b!=0)
                    ans=a/b;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans1=String.valueOf(ans);
                e3.setText(ans1);
                ans=0;
            }
        });

    }
}
