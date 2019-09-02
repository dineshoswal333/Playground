package com.example.login;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotPassword extends AppCompatActivity {
    Button continuebutton;
    ImageView warning1;
    ImageView warning2;
    TextView tv1;
    TextView tv2;
    EditText edittextemail;
    AlertDialog.Builder alertBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fpwarning);

        warning1 = findViewById(R.id.warning1);
        continuebutton=findViewById(R.id.cntbutton);
        warning2 = findViewById(R.id.warning2);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        edittextemail = findViewById(R.id.editTextemail);


        alertBuilder = new AlertDialog.Builder(this);
        final View alertView = getLayoutInflater().inflate(R.layout.alertbox, null);
        alertBuilder.setView(alertView);
        final AlertDialog alertDialog = alertBuilder.create();
        continuebutton = findViewById(R.id.cntbutton);

        continuebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittextemail.getText().toString().equals("")) {
                    warning1.setVisibility(View.VISIBLE);
                    warning2.setVisibility(View.VISIBLE);
                    tv1.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);

                }
                else
                    {
                    alertDialog.show();
                }
            }
        });
    }
        }


