package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Education3Activity extends AppCompatActivity {
    Button Tribals3;
    Button Child3;
    Button Laptop3;
    Button Balika3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education3);

        Tribals3=findViewById(R.id.buttonTribals3);
        Child3=findViewById(R.id.buttonChild3);
        Laptop3=findViewById(R.id.buttonLaptop3);
        Balika3=findViewById(R.id.buttonBalika3);

        Tribals3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education3Activity.this, Tribal3Activity.class);
                startActivity(intent);
            }
        });
        Child3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education3Activity.this, Child3Activity.class);
                startActivity(intent);
            }
        });
        Laptop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education3Activity.this,Laptop3Activity.class);
                startActivity(intent);
            }

        });
        Balika3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education3Activity.this,Balika3Activity.class);
                startActivity(intent);
            }

        });
    }
}
