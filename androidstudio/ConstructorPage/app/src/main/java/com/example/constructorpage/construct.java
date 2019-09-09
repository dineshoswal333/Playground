package com.example.constructorpage;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class construct extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
      public void   construct(Context applicationContext)
    {
     Toast.makeText(applicationContext, "Dinesh Oswal is Viratian for life", Toast.LENGTH_LONG).show();
    }
 }

