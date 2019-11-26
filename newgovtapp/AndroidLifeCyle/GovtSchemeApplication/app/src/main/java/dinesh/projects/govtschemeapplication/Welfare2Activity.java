package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welfare2Activity extends AppCompatActivity {
    Button Deen2;
    Button Digital2;
    Button Gobar2;
    Button Gram2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welfare2);

        Deen2=findViewById(R.id.buttonDeen2);
        Digital2=findViewById(R.id.buttonDigital2);
        Gobar2=findViewById(R.id.buttonGobar2);
        Gram2=findViewById(R.id.buttonGram3);

        Deen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Welfare2Activity.this,Deen2Activity.class);
                startActivity(intent);
            }
        });
        Digital2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Welfare2Activity.this,Digital2Activity.class);
                startActivity(intent);
            }
        }); Gobar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Welfare2Activity.this,Gobar2Activity.class);
                startActivity(intent);
            }
        }); Gram2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Welfare2Activity.this,Gram2Activity.class);
                startActivity(intent);
            }
        });
    }
}
