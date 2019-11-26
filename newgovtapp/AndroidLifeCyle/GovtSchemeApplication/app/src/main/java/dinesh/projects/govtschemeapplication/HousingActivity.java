package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HousingActivity extends AppCompatActivity {
    Button Ashram;
    Button Land;
    Button Awas;
    Button Bijli;
//    Button Ujjawala;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing);

        Ashram=findViewById(R.id.buttonAshram2);
        Land=findViewById(R.id.buttonLand2);
        Awas=findViewById(R.id.buttonAwas2);
        Bijli=findViewById(R.id.buttonBijli2);
//        Ujjawala=findViewById(R.id.buttonUjjawala2);
        Ashram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HousingActivity.this,AshramActivity.class);
                startActivity(intent);
            }
        });
        Land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HousingActivity.this,LandActivity.class);
                startActivity(intent);
            }
        });
        Awas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HousingActivity.this,AwasActivity.class);
                startActivity(intent);
            }
        });
        Bijli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HousingActivity.this,BijliActivity.class);
                startActivity(intent);
            }
        });
//        Ujjawala.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(HousingActivity.this,UjjawalaActivity.class);
//                startActivity(intent);
//            }
//        });

    }
}
