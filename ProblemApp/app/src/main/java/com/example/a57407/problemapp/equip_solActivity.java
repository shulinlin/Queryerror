package com.example.a57407.problemapp;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
public class equip_solActivity extends AppCompatActivity {
    ListView sol_listview;
    ListView rea_listview;
    String[] numbers;
    String[] reasons;
    String[] solution;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip_sol);
        String switch_fault_idx = getIntent().getExtras().get("switch_fault_index").toString();
        Resources res = getResources();
        switch(switch_fault_idx) {
            case "at_1_1":reasons = res.getStringArray(R.array.at_1_1reason);solution = res.getStringArray(R.array.at_1_1sol);break;
            case "at_1_2":reasons = res.getStringArray(R.array.at_1_2reason);solution = res.getStringArray(R.array.at_1_2sol);break;
            case "at_1_3":reasons = res.getStringArray(R.array.at_1_3reason);solution = res.getStringArray(R.array.at_1_3sol);break;
            case "at_1_4":reasons = res.getStringArray(R.array.at_1_4reason);solution = res.getStringArray(R.array.at_1_4sol);break;
            case "at_1_5":reasons = res.getStringArray(R.array.at_1_5reason);solution = res.getStringArray(R.array.at_1_5sol);break;
            case "at_1_6":reasons = res.getStringArray(R.array.at_1_6reason);solution = res.getStringArray(R.array.at_1_6sol);break;
            case "at_1_7":reasons = res.getStringArray(R.array.at_1_7reason);solution = res.getStringArray(R.array.at_1_7sol);break;
            case "at_1_8":reasons = res.getStringArray(R.array.at_1_8reason);solution = res.getStringArray(R.array.at_1_8sol);break;
            case "at_1_9":reasons = res.getStringArray(R.array.at_1_9reason);solution = res.getStringArray(R.array.at_1_9sol);break;
            case "at_1_10":reasons = res.getStringArray(R.array.at_1_10reason);solution = res.getStringArray(R.array.at_1_10sol);break;
            case "at_1_11":reasons = res.getStringArray(R.array.at_1_11reason);solution = res.getStringArray(R.array.at_1_11sol);break;
            case "at_1_12":reasons = res.getStringArray(R.array.at_1_12reason);solution = res.getStringArray(R.array.at_1_12sol);break;
            case "at_1_13":reasons = res.getStringArray(R.array.at_1_13reason);solution = res.getStringArray(R.array.at_1_13sol);break;
            case "at_1_14":reasons = res.getStringArray(R.array.at_1_14reason);solution = res.getStringArray(R.array.at_1_14sol);break;
            case "at_1_15":reasons = res.getStringArray(R.array.at_1_15reason);solution = res.getStringArray(R.array.at_1_15sol);break;
            case "at_2_1":reasons = res.getStringArray(R.array.at_2_1reason);solution = res.getStringArray(R.array.at_2_1sol);break;
            case "at_2_2":reasons = res.getStringArray(R.array.at_2_2reason);solution = res.getStringArray(R.array.at_2_2sol);break;
            case "at_2_3":reasons = res.getStringArray(R.array.at_2_3reason);solution = res.getStringArray(R.array.at_2_3sol);break;
            case "at_2_4":reasons = res.getStringArray(R.array.at_2_4reason);solution = res.getStringArray(R.array.at_2_4sol);break;
            case "at_2_5":reasons = res.getStringArray(R.array.at_2_5reason);solution = res.getStringArray(R.array.at_2_5sol);break;
            case "at_2_6":reasons = res.getStringArray(R.array.at_2_6reason);solution = res.getStringArray(R.array.at_2_6sol);break;
            case "at_2_7":reasons = res.getStringArray(R.array.at_2_7reason);solution = res.getStringArray(R.array.at_2_7sol);break;
        }
            sol_listview = findViewById(R.id.equip_sol_Listview);
            rea_listview = findViewById(R.id.equip_reason_Listview);
            numbers = res.getStringArray(R.array.number2);
            Fault_solAdapter fault_solAdapter = new Fault_solAdapter(this,numbers,solution);
            sol_listview.setAdapter(fault_solAdapter);
            Fault_reasonAdapter fault_reasonAdapter = new Fault_reasonAdapter(this,numbers,reasons);
            rea_listview.setAdapter(fault_reasonAdapter);
        }
    }

