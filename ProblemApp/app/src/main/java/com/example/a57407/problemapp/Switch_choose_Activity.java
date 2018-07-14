package com.example.a57407.problemapp;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
public class Switch_choose_Activity extends AppCompatActivity {
    ListView switch_listview;
    String[] switch_name;
    String[] switch_num;
    String[] switch_index={"s_1","s_2","s_3","s_4","s_5","s_6","s_7","s_8","s_9","s_10","s_11","s_12","s_13","s_14","s_15","s_16","s_17"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swith_choose_);
        Resources res = getResources();
        switch_listview = (ListView) findViewById(R.id.Switch_ListView);
        switch_name = res.getStringArray(R.array.switch_name);
        switch_num = res.getStringArray(R.array.number2);
//        switch_listview.setAdapter(new ArrayAdapter<String>(this,R.layout.activity_swith_choose_,switch_name));
        Switch_chooseAdapter switchAdapter = new Switch_chooseAdapter(this,switch_name,switch_num);
        switch_listview.setAdapter(switchAdapter);
        final String type = getIntent().getExtras().get("type").toString(); // 记录下来选择的是哪一种类型
        switch_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent Fault_categoryActivity = new Intent(getApplicationContext(),Fault_categoryActivity.class);
                Fault_categoryActivity.putExtra("Index",i);
                Fault_categoryActivity.putExtra("Id",switch_index[i]);
                String index = Integer.toString(i);
                Fault_categoryActivity.putExtra(index,switch_name[i]); // 将开关的名称记录入下一个activity中
                String switch_id = switch_index[i];
                switch(switch_id){
                    case "s_1":Fault_categoryActivity.putExtra(switch_id,R.array.s_1fault);break;
                    case "s_2":Fault_categoryActivity.putExtra(switch_id,R.array.s_2fault);break;
                    case "s_3":Fault_categoryActivity.putExtra(switch_id,R.array.s_3fault);break;
                    case "s_4":Fault_categoryActivity.putExtra(switch_id,R.array.s_4fault);break;
                    case "s_5":Fault_categoryActivity.putExtra(switch_id,R.array.s_5fault);break;
                    case "s_6":Fault_categoryActivity.putExtra(switch_id,R.array.s_6fault);break;
                    case "s_7":Fault_categoryActivity.putExtra(switch_id,R.array.s_7fault);break;
                    case "s_8":Fault_categoryActivity.putExtra(switch_id,R.array.s_8fault);break;
                    case "s_9":Fault_categoryActivity.putExtra(switch_id,R.array.s_9fault);break;
                    case "s_10":Fault_categoryActivity.putExtra(switch_id,R.array.s_10fault);break;
                    case "s_11":Fault_categoryActivity.putExtra(switch_id,R.array.s_11fault);break;
                    case "s_12":Fault_categoryActivity.putExtra(switch_id,R.array.s_12fault);break;
                    case "s_13":Fault_categoryActivity.putExtra(switch_id,R.array.s_13fault);break;
                    case "s_14":Fault_categoryActivity.putExtra(switch_id,R.array.s_14fault);break;
                    case "s_15":Fault_categoryActivity.putExtra(switch_id,R.array.s_15fault);break;
                    case "s_16":Fault_categoryActivity.putExtra(switch_id,R.array.s_16fault);break;
                    case "s_17":Fault_categoryActivity.putExtra(switch_id,R.array.s_17fault);break;
                    default:break;
                }
                Fault_categoryActivity.putExtra("switch_id",switch_id);
                Fault_categoryActivity.putExtra("type",type);
                startActivity(Fault_categoryActivity);
            }
        });
    }
}
