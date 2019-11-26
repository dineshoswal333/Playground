package dinesh.projects.govtschemeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Education2Activity extends AppCompatActivity {
    Button Tribals2;
    Button Child2;
    Button Laptop2;
    Button Balika2;
//    Button Khelo2;
//    Button Kishore2;
//    Button National2;
//    Button Pre2;
//    Button Samgara2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education2);

        Tribals2=findViewById(R.id.buttonTribals2);
        Child2=findViewById(R.id.buttonChild2);
        Laptop2=findViewById(R.id.buttonLaptop2);
        Balika2=findViewById(R.id.buttonBalika2);
//        Khelo2=findViewById(R.id.buttonKhelo2);
//        Kishore2=findViewById(R.id.buttonKishore2);
//        National2=findViewById(R.id.buttonNational2);
//        Pre2 =findViewById(R.id.buttonPre2);
//        Samgara2=findViewById(R.id.buttonSamgara2);

        Tribals2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education2Activity.this, Tribal2Activity.class);
                startActivity(intent);
            }
        });
        Child2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education2Activity.this,Child2Activity.class);
                startActivity(intent);
            }
        });
        Laptop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education2Activity.this,Laptop2Activity.class);
                startActivity(intent);
            }

        });
        Balika2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education2Activity.this,Balika2Activity.class);
                startActivity(intent);
            }

        });
//        Khelo2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Education2Activity.this,Khelo2Activity.class);
//                startActivity(intent);
//            }
//
//        });
//        Kishore2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Education2Activity.this,Kishore2Activity.class);
//                startActivity(intent);
//            }
//
//        });
//        National2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Education2Activity.this,National2Activity.class);
//                startActivity(intent);
//            }
//
//        });
//        Pre2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Education2Activity.this,Pre2Activity.class);
//                startActivity(intent);
//            }
//
//        });
//        Samgara2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Education2Activity.this,Samgara2Activity.class);
//                startActivity(intent);
//            }
//
//        });
    }
}