package com.example.mainloginpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mainloginpage.Model.RequestModel;

import java.util.ArrayList;

class MyListAdaptor extends BaseAdapter {

    private Context context;
    ArrayList<RequestModel> req;
    public MyListAdaptor(Context context, ArrayList<RequestModel> requestlist) {
        this.context=context;
        this.req=requestlist;
    }

    @Override
    public int getCount() {
        return req.size();
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
        View views=LayoutInflater.from(context).inflate(R.layout.listitems,parent,false);
        TextView title1,date1,status1;
        ImageView bellicon;


        RequestModel request=this.req.get(position);
        title1=views.findViewById(R.id.tvtitle);
        date1=views.findViewById(R.id.tvdate);
        status1=views.findViewById(R.id.tvstatus);
        bellicon=views.findViewById(R.id.ivbellicon);


        title1.setText(String.valueOf(request.getRequestnumber()));
        date1.setText(String.valueOf(request.getDescription()));
        status1.setText(String.valueOf(request.getRequestStatus()));
        bellicon.setImageResource(R.drawable.bellicon1);

        return views;
    }
}
