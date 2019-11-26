package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnglishActivity extends AppCompatActivity {
    Button Education;
//    Button Farmers;
    Button Finance;
    Button Health;
    Button Housing;
    Button Welfare;
    Button Others;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        Education=findViewById(R.id.buttonEducation3);
//        Farmers=findViewById(R.id.buttonFarmers2);
        Finance=findViewById(R.id.buttonFinance3);
        Health=findViewById(R.id.buttonHealth3);
        Housing=findViewById(R.id.buttonHousing3);
        Welfare=findViewById(R.id.buttonWelfare3);
        Others=findViewById(R.id.buttonOthers3);

        Education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, EducationActivity.class);
                startActivity(intent);
            }
        });

//        Farmers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(EnglishActivity.this, FarmersActivity.class);
//                startActivity(intent);
//            }
//        });

        Finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, FinanceActivity.class);
                startActivity(intent);
            }
        });

        Health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, HealthActivity.class);
                startActivity(intent);
            }
        });

        Housing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, HousingActivity.class);
                startActivity(intent);
            }
        });

        Welfare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, WelfareActivity.class);
                startActivity(intent);
            }
        });

        Others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnglishActivity.this, OthersActivity.class);
                startActivity(intent);
            }
        });

    }
}
