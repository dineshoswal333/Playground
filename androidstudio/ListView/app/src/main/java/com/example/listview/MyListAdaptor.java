package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


class MyListAdaptor extends BaseAdapter {
    public Context context;
    public ArrayList<String> title;
    public ArrayList<String> date;
    public ArrayList<String> status;

    public MyListAdaptor(Context context, ArrayList<String> tvtitle, ArrayList<String> tvdate, ArrayList<String> tvstatus) {
        this.context = context;
        this.title = tvtitle;
        this.date = tvdate;
        this.status = tvstatus;

    }


    @Override
    public int getCount() {
//        Toast.makeText(context, "Viratian"+title.size(), Toast.LENGTH_LONG).show();
        return title.size();

    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.list, parent, false);
        TextView title1,date1,status1;
        title1=view.findViewById(R.id.tvtitle);
        date1=view.findViewById(R.id.tvdate);
        status1=view.findViewById(R.id.tvstatus);

        title1.setText(title.get(position));
        date1.setText(date.get(position));
        status1.setText(status.get(position));






return view;

        }

}
