package com.example.a57407.problemapp;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
public class Exca_Activity extends AppCompatActivity {
    ListView excavate_Listview;
    String[] e_name;
    String[] e_num;
    String[] e_index={"ex_1","ex_2","ex_3","ex_4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exca_);
        Resources res = getResources();
        excavate_Listview = (ListView)findViewById(R.id.shebei_Listview);
        e_name = res.getStringArray(R.array.e_name);
        e_num = res.getStringArray(R.array.number2);
        Switch_chooseAdapter exvaAdapter = new Switch_chooseAdapter(this,e_name,e_num);
        excavate_Listview.setAdapter(exvaAdapter);
        final String type = getIntent().getExtras().get("type").toString();
        excavate_Listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent faults_Activity = new Intent(getApplicationContext(),Fault_categoryActivity.class);
                faults_Activity.putExtra("Index",i);
                String index = Integer.toString(i);
                faults_Activity.putExtra(index,e_name[i]);
                String e_id = e_index[i];
                switch(e_id){
                    case "ex_1":faults_Activity.putExtra(e_id,R.array.ex_1);break;
                    case "ex_2":faults_Activity.putExtra(e_id,R.array.ex_2);break;
                    case "ex_3":faults_Activity.putExtra(e_id,R.array.ex_3);break;
                    case "ex_4":faults_Activity.putExtra(e_id,R.array.ex_4);break;
                    default:break;
                }
                faults_Activity.putExtra("switch_id",e_id);
                faults_Activity.putExtra("type",type);
                startActivity(faults_Activity);
            }
        });
    }
}
