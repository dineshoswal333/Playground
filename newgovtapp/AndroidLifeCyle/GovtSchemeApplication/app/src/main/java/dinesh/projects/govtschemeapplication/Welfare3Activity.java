package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welfare3Activity extends AppCompatActivity {
    Button Deen3;
    Button Digital3;
    Button Gobar3;
    Button Gram3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welfare3);

        Deen3=findViewById(R.id.buttonDeen2);
        Digital3=findViewById(R.id.buttonDigital2);
        Gobar3=findViewById(R.id.buttonGobar2);
        Gram3=findViewById(R.id.buttonGram2);

        Deen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Welfare3Activity.this,Deen3Activity.class);
                startActivity(intent);
            }
        });
        Digital3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Welfare3Activity.this,Digital3Activity.class);
                startActivity(intent);
            }
        }); Gobar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Welfare3Activity.this,Gobar3Activity.class);
                startActivity(intent);
            }
        }); Gram3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Welfare3Activity.this,Gram3Activity.class);
                startActivity(intent);
            }
        });
    }
}
