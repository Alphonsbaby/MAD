package com.example.sjcet.pgm4_regvalid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstname, lastname, uemail, uphoneno, upassword;
    RadioGroup gender;
    DatePicker dob;
    Button btnsubmit;

    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "mypref";
    private static final String KEY_NAME = "name";
    private static final String KEY_EMAIL = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = findViewById(R.id.fname);
        lastname = findViewById(R.id.lname);
        uemail = findViewById(R.id.email);
        uphoneno = findViewById(R.id.phoneno);
        upassword = findViewById(R.id.password);
        gender = findViewById(R.id.gender);
        dob = findViewById(R.id.dob);
        btnsubmit = findViewById(R.id.btsubmit);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String name = sharedPreferences.getString(KEY_NAME,null);

        if (name != null) {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }


        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_NAME,firstname.getText().toString());
                editor.putString(KEY_EMAIL,uemail.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
