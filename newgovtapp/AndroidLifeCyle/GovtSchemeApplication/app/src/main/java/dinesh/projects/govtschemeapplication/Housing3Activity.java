package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Housing3Activity extends AppCompatActivity {
    Button Ashram3;
    Button Land3;
    Button Awas3;
    Button Bijli3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing3);

        Ashram3=findViewById(R.id.buttonAshram2);
        Land3=findViewById(R.id.buttonLand2);
        Awas3=findViewById(R.id.buttonAwas2);
        Bijli3=findViewById(R.id.buttonBijli2);
//        Ujjawala2=findViewById(R.id.buttonUjjawala2);
        Ashram3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Housing3Activity.this,Ashram3Activity.class);
                startActivity(intent);
            }
        });
        Land3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Housing3Activity.this,Land3Activity.class);
                startActivity(intent);
            }
        });
        Awas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Housing3Activity.this,Awas3Activity.class);
                startActivity(intent);
            }
        });
        Bijli3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Housing3Activity.this,Bijli3Activity.class);
                startActivity(intent);
            }
        });
    }
}
