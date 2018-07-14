

package com.example.a57407.problemapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
/*
    不确定是否要用， 暂时先与开关的故障activity混用
    不需要用到本程序！！！！！！！！！！！！！！！
 */
public class AssTrans_Fault_Activity extends AppCompatActivity {
    ListView assfault_namelistview;
    String[] fname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int pos;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ass_trans__fault_);

        TextView name = (TextView)findViewById(R.id.equip_nameTextview);
        String index = getIntent().getExtras().get("Index").toString();
        name.setText(getIntent().getExtras().get(index).toString());

        final String equip_id = getIntent().getExtras().get("equip_id").toString();
        pos = Integer.parseInt(getIntent().getExtras().get(equip_id).toString());

        Resources res = getResources();
        assfault_namelistview = (ListView)findViewById(R.id.asstrans_faultListview);

        fname = res.getStringArray(pos);
        final Fault_nameAdapter fault_nameAdapter = new Fault_nameAdapter(this,fname);
        assfault_namelistview.setAdapter(fault_nameAdapter);

        assfault_namelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent fault_solActivity = new Intent(getApplicationContext(),Fault_solutionActivity.class);
                fault_solActivity.putExtra("Index",i);
                StringBuilder sf = new StringBuilder();
                sf.append(equip_id);
                sf.append("_");
                sf.append(i+1);
                String switch_fault = sf.toString();
                fault_solActivity.putExtra("switch_fault_index",switch_fault);
                startActivity(fault_solActivity);
            }
        });

    }
}
