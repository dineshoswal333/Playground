package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    TextInputLayout password;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName=findViewById(R.id.editTextuserName);
        password=findViewById(R.id.password);
        loginButton=findViewById(R.id.loginButton);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((userName.getText().toString().equals("gvtschemes")) && (password.getEditText().getText().toString().equals("gvt@123"))) {
                    Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, LanguageActivity.class);
                    startActivity(intent);



                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_LONG).show();
                }

            }

        });


    }

    }

