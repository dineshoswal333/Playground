package com.example.mainloginpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

class MyListAdapter extends BaseAdapter {
     String title[]={},  date[]={}, status[]={};
     private Context context;



    public MyListAdapter(Context context, String[] title, String[] date, String[] status) {
        this.context=context;
        this.title=title;
        this.date=date;
        this.status=status;
    }

    @Override
    public int getCount() {
        return title.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    public View getView(int position, View convertView, ViewGroup parent, char[][] tvtitle, char[][] tvdate, char[][] tvstatus) {
        View view= LayoutInflater.from(context).inflate(R.layout.listview,parent,false);
        TextView title,date,status;
        title=view.findViewById(R.id.title);
        date=view.findViewById(R.id.tvdate);
        status=view.findViewById(R.id.tvstatus);


        tvtitle.notifyAll(String.valueOf(title[position]));
        tvdate.notifyAll(String.valueOf(date[position]));
        tvstatus.notifyAll(String.valueOf(status[position]));
        return view;
    }
}
