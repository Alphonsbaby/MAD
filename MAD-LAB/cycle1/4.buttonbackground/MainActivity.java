package com.example.sjcet.buttonbackground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void click(View view) {
        LinearLayout layout = (LinearLayout)findViewById(R.id.backclr);
        layout.setBackgroundResource(R.color.colorAccent);
    }


}
