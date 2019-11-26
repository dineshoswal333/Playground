package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Finance3Activity extends AppCompatActivity {
    Button Grants3;
    Button Crops3;
    Button Kayaka3;
    Button Pension3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance3);

        Grants3=findViewById(R.id.buttonGrants3);
        Crops3=findViewById(R.id.buttonCrops3);
        Kayaka3=findViewById(R.id.buttonKayaka3);
        Pension3=findViewById(R.id.buttonPension3);

        Grants3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Finance3Activity.this,Grant3Activity.class);
                startActivity(intent);
            }
        });
        Crops3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Finance3Activity.this,Crop3Activity.class);
                startActivity(intent);
            }
        });
        Pension3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Finance3Activity.this,Pension3Activity.class);
                startActivity(intent);
            }
        });
        Kayaka3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Finance3Activity.this,Kayaka3Activity.class);
                startActivity(intent);
            }
        });
    }
}
