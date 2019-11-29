package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelfareActivity extends AppCompatActivity {
    Button Deen;
    Button Digital;
    Button Gobar;
    Button Gram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welfare);
        Deen=findViewById(R.id.buttonDeen2);
        Digital=findViewById(R.id.buttonDigital2);
        Gobar=findViewById(R.id.buttonGobar2);
        Gram=findViewById(R.id.buttonGram2);

        Deen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WelfareActivity.this,DeenActivity.class);
                startActivity(intent);
            }
        });
        Digital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WelfareActivity.this,DigitalActivity.class);
                startActivity(intent);
            }
        }); Gobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WelfareActivity.this,GobarActivity.class);
                startActivity(intent);
            }
        }); Gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WelfareActivity.this,GramActivity.class);
                startActivity(intent);
            }
        });



    }
}
