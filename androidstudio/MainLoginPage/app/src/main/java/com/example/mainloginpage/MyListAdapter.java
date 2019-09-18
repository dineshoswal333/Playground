package com.example.mainloginpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

class MyListAdapter extends BaseAdapter {
     String titles[]={},  dates[]={}, statustext[]={};
     private Context context;



    public MyListAdapter(Context context, String[] title, String[] date, String[] status) {
        this.context=context;
        this.titles=title;
        this.dates=date;
        this.statustext=status;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position ) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        return null;
    }

    public View getView(int position, View convertView, ViewGroup parent, char[][] title, char[][] date, char[][] status) {
////        View view= LayoutInflater.from(context).inflate(R.layout.listview,parent,false);
//        TextView titles,dates,statustext;
//        titles=view.findViewById(R.id.title);
//        dates=view.findViewById(R.id.tvdate);
//        statustext=view.findViewById(R.id.tvstatus);
//        titles.setText(String.valueOf(title[position]));
//        dates.setText(String.valueOf(date[position]));
//        statustext.setText(String.valueOf(status[position]));
        return null;
    }
}
