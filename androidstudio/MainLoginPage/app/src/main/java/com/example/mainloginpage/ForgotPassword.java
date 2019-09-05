package com.example.mainloginpage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {
    Button button;
    ImageView warning3;
    ImageView warning4;
    TextView tv4;
    TextView tv3;
    EditText email;
    AlertDialog.Builder alertBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        button=findViewById(R.id.cntbutton);
        warning3=findViewById(R.id.ivwarning3);
        warning4=findViewById(R.id.ivwarning4);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        email=findViewById(R.id.etemail2);

        alertBuilder = new AlertDialog.Builder(this);
        final View alertView = getLayoutInflater().inflate(R.layout.fpalert, null);
        alertBuilder.setView(alertView);
        final AlertDialog alertDialog = alertBuilder.create();
        button = findViewById(R.id.cntbutton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("")) {
                    tv3.setVisibility(View.VISIBLE);
                    tv4.setVisibility(View.VISIBLE);
                    warning3.setVisibility(View.VISIBLE);
                    warning4.setVisibility(View.VISIBLE);
                } else {
                    alertDialog.show();
                }
            }
        });
    }
}
