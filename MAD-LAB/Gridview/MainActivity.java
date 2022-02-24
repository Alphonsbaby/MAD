package com.example.sjcet.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView gridView;
    static final String[] gridviewvalue={
            "facebook","Instagram","YouTube",
            "facebook","Instagram","YouTube",
            "facebook","Instagram","YouTube"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gv);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,gridviewvalue);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String itemname=gridView.getItemAtPosition(i).toString();
        Toast.makeText(this,itemname,Toast.LENGTH_SHORT).show();
    }

}