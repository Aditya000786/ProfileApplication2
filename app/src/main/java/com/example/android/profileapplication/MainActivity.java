package com.example.android.profileapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*A minor change*/
    }
    public int add(int a,int b){
        int c=a+b;
        String s="hdfh";
        return c;
    }
}
