package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button loginbutton;
    TextView fp;
    ImageView warning1;
    ImageView warning2;
    TextView tv1;
    TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton=findViewById(R.id.button);
        fp=findViewById(R.id.tvfp);
        warning1=findViewById(R.id.warning1);
        warning2=findViewById(R.id.warning2);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);


        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                warning1.setVisibility(1);
                warning2.setVisibility(1);
                tv1.setVisibility(1);
                tv2.setVisibility(1);


            }
        });

        fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ForgotPassword.class);
                startActivity(intent);
            }
        });
    }
    }

