package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Health2Activity extends AppCompatActivity {
    Button Ayushman2;
    Button Yeshasvini2;
    Button Meal2;
    Button Anila2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health2);
        Ayushman2=findViewById(R.id.buttonAyushman3);
        Yeshasvini2 =findViewById(R.id.buttonYeshasvini3);
        Meal2=findViewById(R.id.buttonMeal3);
        Anila2=findViewById(R.id.buttonAnila3);

        Ayushman2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Health2Activity.this,Ayushman2Activity.class);
                startActivity(intent);
            }
        });
        Yeshasvini2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Health2Activity.this,Yeshasvini2Activity.class);
                startActivity(intent);
            }
        });
        Meal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Health2Activity.this,Meal2Activity.class);
                startActivity(intent);
            }
        });
        Anila2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Health2Activity.this,Anila2Activity.class);
                startActivity(intent);
            }
        });
    }
}
