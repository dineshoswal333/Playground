package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OthersActivity extends AppCompatActivity {
    Button Development;
    Button Top;
    Button Badavara;
    Button Prabuddha;
    Button Overseas;
    Button Social;
    Button Green;
    Button Matric;
    Button Fellowship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        Development=findViewById(R.id.buttonDeen2);
        Top=findViewById(R.id.buttonDigital2);
        Badavara=findViewById(R.id.buttonGobar2);
        Prabuddha=findViewById(R.id.buttonGram2);
        Overseas=findViewById(R.id.buttonOverseas2);
        Social=findViewById(R.id.buttonSocial2);
        Green=findViewById(R.id.buttonGreen2);
        Matric=findViewById(R.id.buttonMatric2);
        Fellowship=findViewById(R.id.buttonFellowship2);

        Development.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OthersActivity.this,DevelopmentActivity.class);
                startActivity(intent);
            }
        });
        Top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OthersActivity.this,TopActivity.class);
                startActivity(intent);
            }
        });
        Badavara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OthersActivity.this,BadavaraActivity.class);
                startActivity(intent);
            }
        });
        Prabuddha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OthersActivity.this,PrabuddhaActivity.class);
                startActivity(intent);
            }
        });
        Overseas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OthersActivity.this,OverseasActivity.class);
                startActivity(intent);
            }
        });
        Social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OthersActivity.this,SocialActivity.class);
                startActivity(intent);
            }
        });
        Green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OthersActivity.this,GreenActivity.class);
                startActivity(intent);
            }
        });
        Matric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OthersActivity.this,MatricActivity.class);
                startActivity(intent);
            }
        });
        Fellowship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OthersActivity.this,FellowshipActivity.class);
                startActivity(intent);
            }
        });

    }
}
