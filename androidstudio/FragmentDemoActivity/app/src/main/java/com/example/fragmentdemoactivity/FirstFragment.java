package com.example.fragmentdemoactivity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {
    public FirstFragment() {

    }

    Button nextbutton;
    Button thirdfragbtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.fragment_first, container, false);

       nextbutton=v.findViewById(R.id.nextbtn);
       nextbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            SecondFragment secondFragment=new SecondFragment();
               FragmentTransaction transaction1=getFragmentManager().beginTransaction();
               transaction1.replace(R.id.mainlayout,secondFragment);
               transaction1.commit();
           }
       });

       thirdfragbtn=v.findViewById(R.id.thirdfragmentbtn);
       thirdfragbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ThirdFragmentActivity thirdFragmentActivity=new ThirdFragmentActivity();
               FragmentTransaction transaction2=getFragmentManager().beginTransaction();
               transaction2.replace(R.id.mainlayout,thirdFragmentActivity);
               transaction2.commit();
           }
       });

        return v;
    }
}
