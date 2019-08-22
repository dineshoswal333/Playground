package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class burger extends AppCompatActivity {
    ImageView filter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        filter=findViewById(R.id.filter);



        super.onCreate(savedInstanceState);
        setContentView(R.layout.burger);


    }
}
