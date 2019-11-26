    package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LanguageActivity extends AppCompatActivity {
    Button English;
    Button Hindi;
    Button Kannada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        English=findViewById(R.id.buttonEnglish);
        Hindi=findViewById(R.id.buttonHindi);
        Kannada=findViewById(R.id.buttonKannada);

        English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LanguageActivity.this,EnglishActivity.class);
                startActivity(intent);
            }
        });

        Hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LanguageActivity.this,HindiActivity.class);
                startActivity(intent);
            }
        });

        Kannada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LanguageActivity.this,KannadaActivity.class);
                startActivity(intent);
            }
        });

        }

    }

