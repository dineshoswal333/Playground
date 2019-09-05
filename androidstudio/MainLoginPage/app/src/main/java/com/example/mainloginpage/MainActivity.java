package com.example.mainloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

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
                if (email.getText().toString().equals("")) {
                    tv1.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                    warning1.setVisibility(View.VISIBLE);
                    warning2.setVisibility(View.VISIBLE);

                } else {
                    Intent intent = new Intent(MainActivity.this, MyReqpage.class);
                    startActivity(intent);
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
