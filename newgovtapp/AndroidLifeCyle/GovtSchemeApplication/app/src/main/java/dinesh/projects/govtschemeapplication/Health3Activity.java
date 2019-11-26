package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Health3Activity extends AppCompatActivity {
    Button Ayushman3;
    Button Yeshasvini3;
    Button Meal3;
    Button Anila3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health3);

        Ayushman3=findViewById(R.id.buttonAyushman3);
        Yeshasvini3 =findViewById(R.id.buttonYeshasvini3);
        Meal3=findViewById(R.id.buttonMeal3);
        Anila3=findViewById(R.id.buttonAnila3);

        Ayushman3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Health3Activity.this,Ayushman3Activity.class);
                startActivity(intent);
            }
        });
        Yeshasvini3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Health3Activity.this,Yeshasvini3Activity.class);
                startActivity(intent);
            }
        });
        Meal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Health3Activity.this,Meal3Activity.class);
                startActivity(intent);
            }
        });
        Anila3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Health3Activity.this,Anila3Activity.class);
                startActivity(intent);
            }
        });
    }
}
