package com.example.mainloginpage;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.mainloginpage.ModelThree.ReqViewModel;

import java.util.ArrayList;

class ReqViewlisadapter implements ListAdapter {
    private Context context;
    ArrayList<ReqViewModel> reqViewModels;

    public ReqViewlisadapter(Context context, ArrayList<ReqViewModel> reqViewModels1)
    {
        this.context=context;
        this.reqViewModels=reqViewModels1;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return reqViewModels.size();
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
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View reqview= LayoutInflater.from(context).inflate(R.layout.rqstnlistview,parent,false);
        TextView descriptionreqview;

        descriptionreqview=reqview.findViewById(R.id.tvdescreqview);

        ReqViewModel req=this.reqViewModels.get(position);
        req.setDescriptionreqview(String.valueOf(req.getDescriptionreqview()));




        return reqview;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return reqViewModels.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
