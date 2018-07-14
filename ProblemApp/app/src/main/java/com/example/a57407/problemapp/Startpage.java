package com.example.a57407.problemapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

public class Startpage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView myListView;
    String[] items;
    String[] numbers;
    String[] Item_cate={"switch","assistTransport","excavate","others","about"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.test_listview);
        items = res.getStringArray(R.array.category);
        numbers = res.getStringArray(R.array.number);
//        myListView.setAdapter(new ArrayAdapter<String>(this,R.layout.my_listview_detail,items));
        ItemAdapter itemAdapter = new ItemAdapter(this,items,numbers);
        myListView.setAdapter(itemAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showDetailActivity = new Intent(getApplicationContext(),Switch_choose_Activity.class);
                Intent ass_transActivity = new Intent(getApplicationContext(),Ass_Trans_Activity.class);
                Intent excavateActivity = new Intent(getApplicationContext(),Exca_Activity.class);
                Intent otherActivity = new Intent(getApplicationContext(),Other_Activity.class);
                Intent aboutActivity = new Intent(getApplicationContext(),About_Activity.class);
                showDetailActivity.putExtra("ITEM.INDEX",i);
                String clicked = Item_cate[i];
                showDetailActivity.putExtra("ITEM.CATE",Item_cate[i]);
                ass_transActivity.putExtra("type",clicked);
                showDetailActivity.putExtra("type",clicked);
                excavateActivity.putExtra("type",clicked);
                otherActivity.putExtra("type",clicked);
                if(clicked.equals("switch")) {
                    startActivity(showDetailActivity);
                }
                if(clicked.equals("assistTransport")) {
                    startActivity(ass_transActivity);
                }
                if(clicked.equals("excavate")){
                    startActivity(excavateActivity);
                }
                if(clicked.equals("others")){
                    startActivity(otherActivity);
                }
                if(clicked.equals("about")){
                    startActivity(aboutActivity);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.startpage, menu);
//        return true;
//    }

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

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
