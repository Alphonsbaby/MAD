package com.example.sjcet.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Click(View view) {
        EditText edit = (EditText)findViewById(R.id.edtxt);
        TextView tview = (TextView)findViewById(R.id.rxtv);
        String result = edit.getText().toString();
        tview.setText(result);
    }
}
