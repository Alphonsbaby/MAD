package com.example.sjcet.constlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void rgstr(View view) {
        EditText E1,E2,E3,E4,E5;
        E1 = (EditText) findViewById(R.id.edtxt1);
        E2 = (EditText) findViewById(R.id.edtxt2);
        E3 = (EditText) findViewById(R.id.edtxt3);
        E4 = (EditText) findViewById(R.id.edtxt4);
        E5 = (EditText) findViewById(R.id.edtxt5);

        String MobilePattern = "[0-9]{10}";

        if(E1.length() == 0) {
            Toast.makeText(this, "Enter name", Toast.LENGTH_SHORT).show();
        }

        else if(E2.length() == 0) {
            Toast.makeText(this, "Enter Address", Toast.LENGTH_SHORT).show();
        }

        else if(E3.length() == 0) {
            Toast.makeText(this, "Enter Email", Toast.LENGTH_SHORT).show();
        }

        else if(E4.length() == 0) {
            Toast.makeText(this, "Enter phone no", Toast.LENGTH_SHORT).show();
        }
        else if((E4.length() != 10) && (!E5.getText().toString().matches(MobilePattern)) ) {
            Toast.makeText(this, "enter valid phone number", Toast.LENGTH_SHORT).show();
        }

        else if(E5.length() == 0) {
            Toast.makeText(this, "Enter valid password", Toast.LENGTH_SHORT).show();
        }
        else if(E5.length() < 8) {
            Toast.makeText(this, "Password should be minimum 8 characters", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "resgistered successfully", Toast.LENGTH_SHORT).show();
        }

    }
}
