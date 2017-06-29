package com.example.mlrit.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Spinner sp;
    String[] name={"a","b","c","d","e"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,name);
                sp.setAdapter(ad);

    }
}
