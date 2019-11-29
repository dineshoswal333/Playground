package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Others3Activity extends AppCompatActivity {
    Button Development3;
    Button Top3;
    Button Badavara3;
    Button Prabuddha3;
    Button Overseas3;
    Button Social3;
    Button Green3;
    Button Matric3;
    Button Fellowship3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others3);

        Development3=findViewById(R.id.buttonDeen2);
        Top3=findViewById(R.id.buttonDigital2);
        Badavara3 =findViewById(R.id.buttonGobar2);
        Prabuddha3=findViewById(R.id.buttonGram2);
        Overseas3 =findViewById(R.id.buttonOverseas2);
        Social3=findViewById(R.id.buttonSocial2);
        Green3=findViewById(R.id.buttonGreen2);
        Matric3=findViewById(R.id.buttonMatric2);
        Fellowship3=findViewById(R.id.buttonFellowship2);

        Development3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others3Activity.this,Development3Activity.class);
                startActivity(intent);
            }
        });
        Top3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others3Activity.this,Top3Activity.class);
                startActivity(intent);
            }
        });
        Badavara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others3Activity.this,Badavara3Activity.class);
                startActivity(intent);
            }
        });
        Prabuddha3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others3Activity.this,Prabuddha3Activity.class);
                startActivity(intent);
            }
        });
        Overseas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others3Activity.this,Overseas3Activity.class);
                startActivity(intent);
            }
        });
        Social3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others3Activity.this,Social3Activity.class);
                startActivity(intent);
            }
        });
        Green3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others3Activity.this,Green3Activity.class);
                startActivity(intent);
            }
        });
        Matric3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others3Activity.this,Matric3Activity.class);
                startActivity(intent);
            }
        });
        Fellowship3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others3Activity.this,Fellowship3Activity.class);
                startActivity(intent);
            }
        });
    }
}
