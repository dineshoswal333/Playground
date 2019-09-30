package com.example.mainloginpage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mainloginpage.Delegates.RequestDelegate;
import com.example.mainloginpage.Global.RequestStatus;
import com.example.mainloginpage.Model.RequestModel;

import java.util.ArrayList;


public class MyRequestFragment extends Fragment {
    Button newreq;
    ImageView filter;
    ListPopupWindow listPopupWindow;
    TextView pop;
    ListView listView;
    Button reqviewfragbtn;

    private RequestDelegate requestDelegate;

    public MyRequestFragment(){

    }

    public void setRequestDelegate(RequestDelegate requestDelegate){
        this.requestDelegate = requestDelegate;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view1 = inflater.inflate(R.layout.fragment_my_request, container, false);

        newreq = view1.findViewById(R.id.newreqbutton);
        filter = view1.findViewById(R.id.ivfilter);
        listView = view1.findViewById(R.id.lvlistview);


//        reqviewfragbtn=view1.findViewById(R.id.reqviewfragbtn);
//        reqviewfragbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ReqViewFragment reqViewFragment=new ReqViewFragment();
//                FragmentTransaction transaction2=getFragmentManager().beginTransaction();
//                transaction2.replace(R.id.mainlayout,reqViewFragment);
//                transaction2.commit();
//            }
//        });

//        listView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ReqViewFragment reqViewFragment=new ReqViewFragment();
//                FragmentTransaction transaction2=getFragmentManager().beginTransaction();
//                transaction2.replace(R.id.mainlayout,reqViewFragment);
//                transaction2.commit();
//            }
//        });
        final ArrayList<RequestModel> reqlist = new ArrayList<>();

        RequestModel requestModel = new RequestModel();

        requestModel.setRequestnumber("PUR-2019-056");
        requestModel.setRequestStatus(RequestStatus.AWAITING_APPROVAL);
        requestModel.setDescription("06 July 2019");
        reqlist.add(requestModel);


        requestModel = new RequestModel();
        requestModel.setRequestnumber("PUR-2019-028");
        requestModel.setRequestStatus(RequestStatus.APPROVED);
        requestModel.setDescription("06 July 2019");
        reqlist.add(requestModel);

        requestModel = new RequestModel();
        requestModel.setRequestnumber("PUR-2019-030");
        requestModel.setRequestStatus(RequestStatus.CLOSED);
        requestModel.setDescription("06 July 2019");
        reqlist.add(requestModel);

        requestModel = new RequestModel();
        requestModel.setRequestnumber("PUR-2019-018");
        requestModel.setRequestStatus(RequestStatus.DRAFT);
        requestModel.setDescription("06 July 2019");
        reqlist.add(requestModel);

        requestModel = new RequestModel();
        requestModel.setRequestnumber("PUR-2019-009");
        requestModel.setRequestStatus(RequestStatus.REJECTED);
        requestModel.setDescription("06 July 2019");
        reqlist.add(requestModel);


        MyListAdaptor listAdapter = new MyListAdaptor(view1.getContext(), reqlist);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                RequestModel requestModel = reqlist.get(position);
                if (requestDelegate != null) {
                    requestDelegate.onRequestItemClick(requestModel);
                }

            }
        });



                newreq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),RequisitionPage.class);
                startActivity(intent);
            }
        });


        String[] products={"CLEAR", "APPROVED", "DRAFT","AWAITING",
                "REJECTED"};
        pop=view1.findViewById(R.id.tvpopup);

        listPopupWindow = new ListPopupWindow(
                getContext());
        listPopupWindow.setAdapter(new ArrayAdapter(
                getContext(),
                R.layout.popup, products));
        listPopupWindow.setAnchorView(filter);
        listPopupWindow.setModal(true);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPopupWindow.show();
            }
        });


   return view1;
    }


}