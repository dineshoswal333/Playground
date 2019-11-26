package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Others2Activity extends AppCompatActivity {
    Button Development2;
    Button Top2;
    Button Badavara2;
    Button Prabuddha2;
    Button Overseas2;
    Button Social2;
    Button Green2;
    Button Matric2;
    Button Fellowship2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others2);

        Development2=findViewById(R.id.buttonDeen2);
        Top2=findViewById(R.id.buttonDigital2);
        Badavara2=findViewById(R.id.buttonGobar2);
        Prabuddha2=findViewById(R.id.buttonGram3);
        Overseas2=findViewById(R.id.buttonOverseas2);
        Social2=findViewById(R.id.buttonSocial2);
        Green2=findViewById(R.id.buttonGreen2);
        Matric2=findViewById(R.id.buttonMatric2);
        Fellowship2=findViewById(R.id.buttonFellowship2);

        Development2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others2Activity.this,Development2Activity.class);
                startActivity(intent);
            }
        });
        Top2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others2Activity.this,Top2Activity.class);
                startActivity(intent);
            }
        });
        Badavara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others2Activity.this,Badavara2Activity.class);
                startActivity(intent);
            }
        });
        Prabuddha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others2Activity.this,Prabuddha2Activity.class);
                startActivity(intent);
            }
        });
        Overseas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others2Activity.this,Overseas2Activity.class);
                startActivity(intent);
            }
        });
        Social2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others2Activity.this,Social2Activity.class);
                startActivity(intent);
            }
        });
        Green2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others2Activity.this,Green2Activity.class);
                startActivity(intent);
            }
        });
        Matric2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others2Activity.this,Matric2Activity.class);
                startActivity(intent);
            }
        });
        Fellowship2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Others2Activity.this,Fellowship2Activity.class);
                startActivity(intent);
            }
        });
    }
}
