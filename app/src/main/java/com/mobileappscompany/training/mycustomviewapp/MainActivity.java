package com.mobileappscompany.training.mycustomviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ((LinearLayout) findViewById(R.id.activity_main)).addView(new MyCustomTextView(this));

    }
}
