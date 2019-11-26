package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Farmers2Activity extends AppCompatActivity {
    Button Fasal2;
    Button Kaushal2;
    Button Approach2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmers2);
        Fasal2=findViewById(R.id.buttonfasal2);
        Kaushal2=findViewById(R.id.buttonKaushal2);
        Approach2=findViewById(R.id.buttonApproach2);

        Fasal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Farmers2Activity.this,Fasal2Activity.class);
                startActivity(intent);
            }
        });
        Kaushal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Farmers2Activity.this,Kaushal2Activity.class);
                startActivity(intent);
            }
        });
        Approach2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Farmers2Activity.this,Approach2Activity.class);
                startActivity(intent);
            }
        });
    }
}
