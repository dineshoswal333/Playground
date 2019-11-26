package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Finance2Activity extends AppCompatActivity {
    Button Grants2;
    Button Crops2;
    Button Kayaka2;
    Button Pension2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance2);

        Grants2=findViewById(R.id.buttonGrants3);
        Crops2=findViewById(R.id.buttonCrops3);
        Kayaka2=findViewById(R.id.buttonKayaka3);
        Pension2=findViewById(R.id.buttonPension3);
//        Service=findViewById(R.id.buttonService);
//        Pooled=findViewById(R.id.buttonPooled);
//        Jandhan=findViewById(R.id.buttonJandhan);
//        Bima=findViewById(R.id.buttonBima);
//        Standup =findViewById(R.id.buttonStandup);


        Grants2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Finance2Activity.this,Grants2Activity.class);
                startActivity(intent);
            }
        });
        Crops2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Finance2Activity.this,Crops2Activity.class);
                startActivity(intent);
            }
        });
        Pension2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Finance2Activity.this,Pension2Activity.class);
                startActivity(intent);
            }
        });
        Kayaka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Finance2Activity.this,Kayaka2Activity.class);
                startActivity(intent);
            }
        });
    }
}
