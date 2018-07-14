package com.example.a57407.problemapp;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
public class Other_Activity extends AppCompatActivity {
        ListView otherListview;
        String[] other_name;
        String[] other_num;
        String[] other_index={"ot_1","ot_2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_);

        Resources res = getResources();
        otherListview = (ListView)findViewById(R.id.otherListview);
        other_name=res.getStringArray(R.array.other_name);
        other_num = res.getStringArray(R.array.number2);
        Switch_chooseAdapter otherAdapter = new Switch_chooseAdapter(this,other_name,other_num);
        otherListview.setAdapter(otherAdapter);
        final String type = getIntent().getExtras().get("type").toString();
        otherListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent otfault_Activity = new Intent(getApplicationContext(),Fault_categoryActivity.class);
                otfault_Activity.putExtra("Index",i);
                String index = Integer.toString(i);
                otfault_Activity.putExtra(index,other_name[i]);
                String other_id = other_index[i];
                switch (other_id){
                    case "ot_1":otfault_Activity.putExtra(other_id,R.array.ot_1fault);break;
                    case "ot_2":otfault_Activity.putExtra(other_id,R.array.ot_2fault);break;
                    default:break;
                }
                otfault_Activity.putExtra("switch_id",other_id);
                otfault_Activity.putExtra("type",type);
                startActivity(otfault_Activity);
            }
        });
    }
}
