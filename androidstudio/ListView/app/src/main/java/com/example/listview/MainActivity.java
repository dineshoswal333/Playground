package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.lvlist);
        ArrayList<String> title= new ArrayList<>();
        ArrayList<String> date= new ArrayList<>();
        ArrayList<String> status= new ArrayList<>();

        title.add("PUR-2019-056");
        date.add("06 July 2019");
        status.add("APPROVED");
//        String title[]={"PUR-2019-056","PUR-2019-056","PUR-2019-056","PUR-2019-056","PUR-2019-056"};
//        String date[]={"06 July 2019","06 July 2019","06 July 2019","06 July 2019","06 July 2019"};
//        String status[]={"APPROVED","APPROVED","APPROVED","APPROVED","APPROVED"};

        ListAdapter listAdapter=new MyListAdaptor(getApplicationContext(),title,date,status);
        listView.setAdapter(listAdapter);

    }
}
