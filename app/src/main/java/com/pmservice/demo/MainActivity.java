package com.pmservice.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void myFunction(){
        int i = 0;
        i = i + 1;

        int ii = 0;
        ii = i + 1;
    }
    private void demoPull(){
        int a = 0;
    }
}
