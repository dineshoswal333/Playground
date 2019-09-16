package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class MyListAdaptor extends BaseAdapter {
    String title[] = {}, date[] = {}, status[] = {};
    private Context context;

    public MyListAdaptor(Context  applicationContext, String[] tvtitle, String[] tvdate, String[] tvstatus) {
        this.context=context;
        this.title=tvtitle;
        this.date=tvdate;
        this.status=tvstatus;

    }

    public MyListAdaptor(Context context, ArrayList<String> title, ArrayList<String> date, ArrayList<String> status) {

    }


    @Override
    public int getCount() {
        return title.length;
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
        return null;
    }

}
