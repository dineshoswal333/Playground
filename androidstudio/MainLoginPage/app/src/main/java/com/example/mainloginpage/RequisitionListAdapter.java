package com.example.mainloginpage;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.mainloginpage.ModelTwo.RequisitionModel;

import java.util.ArrayList;

class RequisitionListAdapter implements ListAdapter {
    private Context context;
    ArrayList<RequisitionModel> requisitionModels;

    public RequisitionListAdapter(Context context, ArrayList<RequisitionModel> reqstnlist) {
        this.context=context;
        this.requisitionModels=reqstnlist;
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
        return requisitionModels.size();
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
        View reqstnview= LayoutInflater.from(context).inflate(R.layout.rqstnlistview,parent,false);
        TextView descriptionbox;
        final TextView moredescription;
        ImageView linesimage;
        TextView readmoretext;

        descriptionbox=reqstnview.findViewById(R.id.tvreqstntext);
        linesimage=reqstnview.findViewById(R.id.ivlines);
        moredescription=reqstnview.findViewById(R.id.readmoreitem);
        readmoretext=reqstnview.findViewById(R.id.tvreadmore);
        RequisitionModel requisition=this.requisitionModels.get(position);

        descriptionbox.setText(String.valueOf(requisition.getRequisitiondescription()));
        linesimage.setImageResource(R.drawable.linesicon);


        readmoretext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moredescription.setVisibility(View.VISIBLE);
            }
        });

        return reqstnview;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return requisitionModels.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
