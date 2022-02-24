package com.example.sjcet.constlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view) {
                Intent i = new Intent(MainActivity.this, register.class);
                startActivity(i);
    }

    public void login(View view) {
        EditText E1, E2;
        E1 =(EditText) findViewById(R.id.eduname);
        E2 = (EditText) findViewById(R.id.edpass);

        if ((E1.getText().toString().equals("admin")) && (E2.getText().toString().equals("admin")))
        {
            Intent i = new Intent(MainActivity.this,home.class);
            startActivity(i);
        }

        else
        {
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }

    }
}
