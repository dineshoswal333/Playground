package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Housing2Activity extends AppCompatActivity {
    Button Ashram2;
    Button Land2;
    Button Awas2;
    Button Bijli2;
//    Button Ujjawala2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing2);

        Ashram2=findViewById(R.id.buttonAshram2);
        Land2=findViewById(R.id.buttonLand2);
        Awas2=findViewById(R.id.buttonAwas2);
        Bijli2=findViewById(R.id.buttonBijli2);
//        Ujjawala2=findViewById(R.id.buttonUjjawala2);
        Ashram2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Housing2Activity.this,Ashram2Activity.class);
                startActivity(intent);
            }
        });
        Land2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Housing2Activity.this,Land2Activity.class);
                startActivity(intent);
            }
        });
        Awas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Housing2Activity.this,Awas2Activity.class);
                startActivity(intent);
            }
        });
        Bijli2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Housing2Activity.this,Bijli2Activity.class);
                startActivity(intent);
            }
        });
//        Ujjawala2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(Housing2Activity.this,Ujjawala2Activity.class);
//                startActivity(intent);
//            }
//        });
    }
}
