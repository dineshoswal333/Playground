package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HindiActivity extends AppCompatActivity {
    Button Education2;
//    Button Farmers2;
    Button Finance2;
    Button Health2;
    Button Housing2;
    Button Welfare2;
    Button Others2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi);

        Education2=findViewById(R.id.buttonEducation3);
//        Farmers2=findViewById(R.id.buttonFarmers2);
        Finance2=findViewById(R.id.buttonFinance3);
        Health2=findViewById(R.id.buttonHealth3);
        Housing2=findViewById(R.id.buttonHousing3);
        Welfare2=findViewById(R.id.buttonWelfare3);
        Others2=findViewById(R.id.buttonOthers3);

        Education2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HindiActivity.this, Education2Activity.class);
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

        Finance2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HindiActivity.this, Finance2Activity.class);
                startActivity(intent);
            }
        });

        Health2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HindiActivity.this, Health2Activity.class);
                startActivity(intent);
            }
        });

        Housing2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HindiActivity.this, Housing2Activity.class);
                startActivity(intent);
            }
        });

        Welfare2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HindiActivity.this, Welfare2Activity.class);
                startActivity(intent);
            }
        });

        Others2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HindiActivity.this, Others2Activity.class);
                startActivity(intent);
            }
        });
    }
}
