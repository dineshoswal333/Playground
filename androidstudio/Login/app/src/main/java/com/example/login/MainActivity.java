package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button loginbutton;
    TextView fp;
    ImageView warning1;
    ImageView warning2;
    TextView tv1;
    TextView tv2;
    EditText email;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton = findViewById(R.id.loginbtn);
        password = findViewById(R.id.etpassword);
        fp = findViewById(R.id.tvfp);
        warning1 = findViewById(R.id.warning1);
        warning2 = findViewById(R.id.warning2);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        email = findViewById(R.id.etemail);


        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (email.getText().toString().equals("") || (password.getText().toString().equals(""))) {
                    warning1.setVisibility(View.VISIBLE);
                    warning2.setVisibility(View.VISIBLE);
                    tv1.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                }


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

