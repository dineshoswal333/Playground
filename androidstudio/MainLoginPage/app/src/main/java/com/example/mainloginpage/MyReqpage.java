package com.example.mainloginpage;

import android.content.Intent;
import android.os.Bundle;

import com.example.mainloginpage.Global.RequestStatus;
import com.example.mainloginpage.Model.RequestModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyReqpage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button newreq;
    ImageView filter;
    ListPopupWindow listPopupWindow;
    TextView pop;
  ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_reqpage);
        newreq=findViewById(R.id.newreqbutton);
        filter=findViewById(R.id.ivfilter);
        listView=findViewById(R.id.lvlistview);
  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View v, int position,
                                long id) {

                     Intent intent = new Intent(MyReqpage.this, ListViewActivity.class);

                    startActivity(intent);
                            }
                    });

        ArrayList<RequestModel> reqlist=new ArrayList<>();

        RequestModel requestModel=new RequestModel();

        requestModel.setRequestnumber("PUR-2019-056");
        requestModel.setRequestStatus(RequestStatus.AWAITING_APPROVAL);
        requestModel.setDescription("06 July 2019");
        reqlist.add(requestModel);



        requestModel=new RequestModel();
        requestModel.setRequestnumber("PUR-2019-028");
        requestModel.setRequestStatus(RequestStatus.APPROVED);
        requestModel.setDescription("06 July 2019");
        reqlist.add(requestModel);

        requestModel=new RequestModel();
        requestModel.setRequestnumber("PUR-2019-030");
        requestModel.setRequestStatus(RequestStatus.CLOSED);
        requestModel.setDescription("06 July 2019");
        reqlist.add(requestModel);

        requestModel=new RequestModel();
        requestModel.setRequestnumber("PUR-2019-018");
        requestModel.setRequestStatus(RequestStatus.DRAFT);
        requestModel.setDescription("06 July 2019");
        reqlist.add(requestModel);

        requestModel=new RequestModel();
        requestModel.setRequestnumber("PUR-2019-009");
        requestModel.setRequestStatus(RequestStatus.REJECTED);
        requestModel.setDescription("06 July 2019");
        reqlist.add(requestModel);


        MyListAdaptor listAdapter=new MyListAdaptor(getApplicationContext(),reqlist);
        listView.setAdapter(listAdapter);
//        listView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent= new Intent(MyReqpage.this,ListViewActivity.class);
//                startActivity(intent);
//            }
//        });


//        String title[]={"Rose","Lotus","Jasmine","RCB","Bengularu Bulls"};
//        String date[]={"22-Aug","24-Aug","28-Aug","30-Aug","2-Sep"};
//        String status[]={"APPROVED","REJECTED","DRAFT","AWAITING","COMPLETED"};
//        ListAdapter listAdapter=new MyListAdapter(getApplicationContext(),title,date,status);

        newreq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MyReqpage.this,RequisitionPage.class);
                startActivity(intent);
            }
        });


        String[] products={"CLEAR", "APPROVED", "DRAFT","AWAITING",
                "REJECTED"};
        pop=findViewById(R.id.tvpopup);

        listPopupWindow = new ListPopupWindow(
                getApplicationContext());
        listPopupWindow.setAdapter(new ArrayAdapter(
                getApplicationContext(),
                R.layout.popup, products));
        listPopupWindow.setAnchorView(filter);
        listPopupWindow.setModal(true);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPopupWindow.show();
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_reqpage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
