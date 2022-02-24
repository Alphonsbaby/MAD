package com.example.sjcet.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"OnCreate called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","oncreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onresume called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","onresume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onpause called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","onpause called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onReStart called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","onReStart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy called",Toast.LENGTH_SHORT).show();
        Log.d("Activitylifecycle","onDestroy called");
    }
}