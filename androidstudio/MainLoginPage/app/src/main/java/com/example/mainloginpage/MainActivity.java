package com.example.mainloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    Button loginbutton;
    TextView fp;
    ImageView warning1;
    ImageView warning2;
    TextView tv1;
    TextView tv2;
    EditText email;
    TextInputLayout password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton=findViewById(R.id.buttonlogin);
        fp=findViewById(R.id.tvfp);
        email=findViewById(R.id.etemail);
        password=findViewById(R.id.password);
        warning1=findViewById(R.id.ivwarning1);
        warning2=findViewById(R.id.ivwarning2);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((email.getText().toString().equals("Dinesh")) && (password.getEditText().getText().toString().equals("dinesh009"))) {
                    Toast.makeText( getApplicationContext(), "Login successful", Toast.LENGTH_LONG).show();
                    Intent intent1=new Intent(MainActivity.this,FragmentReqActivity.class);
                    startActivity(intent1);



                } else {
                    Toast.makeText(getApplicationContext(), "enter correct login details", Toast.LENGTH_LONG).show();
                    tv1.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                    warning1.setVisibility(View.VISIBLE);
                    warning2.setVisibility(View.VISIBLE);

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
