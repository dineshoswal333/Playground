package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinanceActivity extends AppCompatActivity {
    Button Grants;
    Button Crops;
    Button Kayaka;
    Button Pension;
//    Button Service;
//    Button Pooled;Button Jandhan;Button Bima;Button Standup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);

        Grants=findViewById(R.id.buttonGrants2);
        Crops=findViewById(R.id.buttonCrops2);
        Kayaka=findViewById(R.id.buttonKayaka2);
        Pension=findViewById(R.id.buttonPension2);
//        Service=findViewById(R.id.buttonService);
//        Pooled=findViewById(R.id.buttonPooled);
//        Jandhan=findViewById(R.id.buttonJandhan);
//        Bima=findViewById(R.id.buttonBima);
//        Standup =findViewById(R.id.buttonStandup);


        Grants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FinanceActivity.this,GrantsActivity.class);
                startActivity(intent);
            }
        });
        Crops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FinanceActivity.this,CropActivity.class);
                startActivity(intent);
            }
        });
        Pension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FinanceActivity.this,PensionActivity.class);
                startActivity(intent);
            }
        });
        Kayaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FinanceActivity.this,KayakaActivity.class);
                startActivity(intent);
            }
        });

    }
}
