package com.example.a57407.problemapp;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
public class Fault_categoryActivity extends AppCompatActivity {
        ListView fault_namelistview;
        String[] fname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int pos;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fault_category);
        TextView name = (TextView)findViewById(R.id.switch_name_Textview);
        String index = getIntent().getExtras().get("Index").toString();
        name.setText(getIntent().getExtras().get(index).toString());
        final String switch_id = getIntent().getExtras().get("switch_id").toString();
        pos = Integer.parseInt(getIntent().getExtras().get(switch_id).toString());
        final String type = getIntent().getExtras().get("type").toString();
        Resources res = getResources();
        fault_namelistview = (ListView)findViewById(R.id.fault_catelistview);
        fname = res.getStringArray(pos);
        final Fault_nameAdapter fault_nameAdapter = new Fault_nameAdapter(this,fname);
        fault_namelistview.setAdapter(fault_nameAdapter);
        fault_namelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent fault_solActivity = new Intent(getApplicationContext(),Fault_solutionActivity.class);
                Intent equip_solActivity = new Intent(getApplicationContext(), com.example.a57407.problemapp.equip_solActivity.class);
                Intent exca_solActivity = new Intent(getApplicationContext(),Exca_solActivity.class);
                Intent other_solActivity = new Intent(getApplicationContext(),othersol_Activity.class);
                fault_solActivity.putExtra("Index",i);
                StringBuilder sf = new StringBuilder();
                sf.append(switch_id);
                sf.append("_");
                sf.append(i+1);
                String switch_fault = sf.toString();
                if(type.equals("switch")) {
                    fault_solActivity.putExtra("switch_fault_index", switch_fault);
                    startActivity(fault_solActivity);
                }
                if(type.equals("assistTransport")) {
                    equip_solActivity.putExtra("switch_fault_index", switch_fault);
                    startActivity(equip_solActivity);
                }
                if(type.equals("excavate")) {
                    exca_solActivity.putExtra("switch_fault_index",switch_fault);
                    startActivity(exca_solActivity);
                }
                if(type.equals("others")){
                    other_solActivity.putExtra("switch_fault_index",switch_fault);
                    startActivity(other_solActivity);
                }
            }
        });
        }
    }

