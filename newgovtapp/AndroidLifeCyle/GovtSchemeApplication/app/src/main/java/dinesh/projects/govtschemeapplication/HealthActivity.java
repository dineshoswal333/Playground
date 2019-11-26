package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HealthActivity extends AppCompatActivity {
    Button Ayushman;
    Button Yeshasvini;
    Button Meal;
    Button Anila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        Ayushman=findViewById(R.id.buttonAyushman3);
        Yeshasvini=findViewById(R.id.buttonYeshasvini3);
        Meal=findViewById(R.id.buttonMeal3);
        Anila=findViewById(R.id.buttonAnila3);

        Ayushman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HealthActivity.this,AyushmanActivity.class);
                startActivity(intent);
            }
        });
        Yeshasvini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HealthActivity.this,YeshasviniActivity.class);
                startActivity(intent);
            }
        });
        Meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HealthActivity.this,Mealctivity.class);
                startActivity(intent);
            }
        });
       Anila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HealthActivity.this,AnilaActivity.class);
                startActivity(intent);
            }
        });
    }
}
