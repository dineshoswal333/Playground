package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button add1;
    Button delete1;
    Button show;
    TextView numbers;
    ArrayList<Integer> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        add1=findViewById(R.id.addbutton);
        list = new ArrayList<>();
        delete1=findViewById(R.id.dltbutton);
        show=findViewById(R.id.showbutton);
        numbers=findViewById(R.id.numbers);

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                list.add(0,1);
                list.add(1,2);
                list.add(2,3);
            }


        });
        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.remove(2);
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < list.size(); i++) {
                    numbers.append(list.get(i).toString());

                }
            }
        });


    }
}
