package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FarmersActivity extends AppCompatActivity {
    Button Fasal;
    Button Kaushal;
    Button Approach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmers);

        Fasal=findViewById(R.id.buttonfasal2);
        Kaushal=findViewById(R.id.buttonKaushal2);
        Approach=findViewById(R.id.buttonApproach2);

        Fasal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FarmersActivity.this,FasalPdfActivity.class);
                startActivity(intent);
            }
        });
        Kaushal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FarmersActivity.this,KaushalActivity.class);
                startActivity(intent);
            }
        });
        Approach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FarmersActivity.this,ApproachActivity.class);
                startActivity(intent);
            }
        });
    }
}
