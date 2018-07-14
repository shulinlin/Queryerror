package com.example.a57407.problemapp;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
public class Ass_Trans_Activity extends AppCompatActivity {
    ListView assi_TransListview;
    String[] equip_name;
    String[] equip_num;
    String[] equip_index={"at_1","at_2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ass__trans_);
        Resources res = getResources();
        assi_TransListview = (ListView)findViewById(R.id.ass_translistView);
        equip_name = res.getStringArray(R.array.equip_name);
        equip_num = res.getStringArray(R.array.number2);
        Switch_chooseAdapter equipAdapter = new Switch_chooseAdapter(this,equip_name,equip_num);
        assi_TransListview.setAdapter(equipAdapter);
        final String type = getIntent().getExtras().get("type").toString();
        assi_TransListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent equipfault_Activity = new Intent(getApplicationContext(),Fault_categoryActivity.class);
                equipfault_Activity.putExtra("Index",i);
                String index = Integer.toString(i);
                equipfault_Activity.putExtra(index,equip_name[i]);
                String equip_id = equip_index[i];
                switch (equip_id){
                    case "at_1":equipfault_Activity.putExtra(equip_id,R.array.at_1fault);break;
                    case "at_2":equipfault_Activity.putExtra(equip_id,R.array.at_2fault);break;
                    default:break;
                }
                equipfault_Activity.putExtra("switch_id",equip_id);
                equipfault_Activity.putExtra("type",type);
                startActivity(equipfault_Activity);
            }
        });
    }
}
