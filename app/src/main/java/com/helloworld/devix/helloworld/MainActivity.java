package com.helloworld.devix.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView textViewHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textViewHelloWorld = findViewById(R.id.textViewHelloWorld);
        textViewHelloWorld.setText("Hello World!");


    }
}
