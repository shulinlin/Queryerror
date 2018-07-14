package com.example.a57407.problemapp;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
public class CategoryActivity extends AppCompatActivity {
    ListView myListView;
    String[] items;
    String[] numbers;
    String[] Item_cate={"switch","assistTransport","excavate","others","about"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);
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
}
