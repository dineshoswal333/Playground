package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KannadaActivity extends AppCompatActivity {
    Button Education3;
    //    Button Farmers2;
    Button Finance3;
    Button Health3;
    Button Housing3;
    Button Welfare3;
    Button Others3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kannada);

        Education3=findViewById(R.id.buttonEducation3);
//        Farmers2=findViewById(R.id.buttonFarmers2);
        Finance3=findViewById(R.id.buttonFinance3);
        Health3=findViewById(R.id.buttonHealth3);
        Housing3=findViewById(R.id.buttonHousing3);
        Welfare3=findViewById(R.id.buttonWelfare3);
        Others3=findViewById(R.id.buttonOthers3);

        Education3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KannadaActivity.this, Education3Activity.class);
                startActivity(intent);
            }
        });

//        Farmers2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(HindiActivity.this, Farmers2Activity.class);
//                startActivity(intent);
//            }
//        });

        Finance3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KannadaActivity.this, Finance3Activity.class);
                startActivity(intent);
            }
        });

        Health3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KannadaActivity.this, Health3Activity.class);
                startActivity(intent);
            }
        });

        Housing3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KannadaActivity.this, Housing3Activity.class);
                startActivity(intent);
            }
        });

        Welfare3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KannadaActivity.this, Welfare3Activity.class);
                startActivity(intent);
            }
        });

        Others3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KannadaActivity.this, Others3Activity.class);
                startActivity(intent);
            }
        });
    }
}
