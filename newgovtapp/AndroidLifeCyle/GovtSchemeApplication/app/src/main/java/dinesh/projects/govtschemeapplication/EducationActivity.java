package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EducationActivity extends AppCompatActivity {
    Button Tribals;
    Button Child;
    Button Laptop;
    Button Balika;
//    Button Khelo;
//    Button Kishore;
//    Button National;
//    Button Pre;
//    Button Samgara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        Tribals=findViewById(R.id.buttonTribals3);
        Child=findViewById(R.id.buttonChild3);
        Laptop=findViewById(R.id.buttonLaptop3);
        Balika=findViewById(R.id.buttonBalika3);
//        Khelo=findViewById(R.id.buttonKhelo2);
//        Kishore=findViewById(R.id.buttonKishore2);
//        National=findViewById(R.id.buttonNational2);
//        Pre =findViewById(R.id.buttonPre2);
//        Samgara=findViewById(R.id.buttonSamgara2);

        Tribals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationActivity.this, EducationPdfActivity.class);
                startActivity(intent);
            }
        });
        Child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationActivity.this, ChildPdfActivity.class);
                startActivity(intent);
            }
        });
        Laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationActivity.this,LaptopPdfActivity.class);
                startActivity(intent);
            }

        });
        Balika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EducationActivity.this,BalikaPdfActivity.class);
                startActivity(intent);
            }

        });
//        Khelo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(EducationActivity.this,KheloPdfActivity.class);
//                startActivity(intent);
//            }
//
//        });
//        Kishore.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(EducationActivity.this,KishorePdfActivity.class);
//                startActivity(intent);
//            }
//
//        });
//        National.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(EducationActivity.this,NationalPdfActivity.class);
//                startActivity(intent);
//            }
//
//        });
//        Pre.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(EducationActivity.this,PrePdfActivity.class);
//                startActivity(intent);
//            }
//
//        });
//        Samgara.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(EducationActivity.this,SamgaraPdfActivity.class);
//                startActivity(intent);
//            }
//
//        });
//
//


    }
}
