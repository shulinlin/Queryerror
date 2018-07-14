package com.example.a57407.problemapp;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
public class Exca_solActivity extends AppCompatActivity {
    ListView realistview;
    ListView sollistview;
    String[] numbers;
    String[] reasons;
    String[] solutions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exca_sol);
        String exca_fault_idx = getIntent().getExtras().get("switch_fault_index").toString();
        Resources res = getResources();
        switch(exca_fault_idx){
            case "ex_1_1":reasons = res.getStringArray(R.array.ex_1_1reason);solutions = res.getStringArray(R.array.ex_1_1sol);break;
            case "ex_1_2":reasons = res.getStringArray(R.array.ex_1_2reason);solutions = res.getStringArray(R.array.ex_1_2sol);break;
            case "ex_1_3":reasons = res.getStringArray(R.array.ex_1_3reason);solutions = res.getStringArray(R.array.ex_1_3sol);break;
            case "ex_1_4":reasons = res.getStringArray(R.array.ex_1_4reason);solutions = res.getStringArray(R.array.ex_1_4sol);break;
            case "ex_1_5":reasons = res.getStringArray(R.array.ex_1_5reason);solutions = res.getStringArray(R.array.ex_1_5sol);break;
            case "ex_1_6":reasons = res.getStringArray(R.array.ex_1_6reason);solutions = res.getStringArray(R.array.ex_1_6sol);break;
            case "ex_1_7":reasons = res.getStringArray(R.array.ex_1_7reason);solutions = res.getStringArray(R.array.ex_1_7sol);break;
            case "ex_2_1":reasons = res.getStringArray(R.array.ex_2_1reason);solutions = res.getStringArray(R.array.ex_2_1sol);break;
            case "ex_2_2":reasons = res.getStringArray(R.array.ex_2_2reason);solutions = res.getStringArray(R.array.ex_2_2sol);break;
            case "ex_2_3":reasons = res.getStringArray(R.array.ex_2_3reason);solutions = res.getStringArray(R.array.ex_2_3sol);break;
            case "ex_2_4":reasons = res.getStringArray(R.array.ex_2_4reason);solutions = res.getStringArray(R.array.ex_2_4sol);break;
            case "ex_2_5":reasons = res.getStringArray(R.array.ex_2_5reason);solutions = res.getStringArray(R.array.ex_2_5sol);break;
            case "ex_2_6":reasons = res.getStringArray(R.array.ex_2_6reason);solutions = res.getStringArray(R.array.ex_2_6sol);break;
            case "ex_2_7":reasons = res.getStringArray(R.array.ex_2_7reason);solutions = res.getStringArray(R.array.ex_2_7sol);break;
            case "ex_2_8":reasons = res.getStringArray(R.array.ex_2_8reason);solutions = res.getStringArray(R.array.ex_2_8sol);break;
            case "ex_2_9":reasons = res.getStringArray(R.array.ex_2_9reason);solutions = res.getStringArray(R.array.ex_2_9sol);break;
            case "ex_2_10":reasons = res.getStringArray(R.array.ex_2_10reason);solutions = res.getStringArray(R.array.ex_2_10sol);break;
            case "ex_2_11":reasons = res.getStringArray(R.array.ex_2_11reason);solutions = res.getStringArray(R.array.ex_2_11sol);break;
            case "ex_2_12":reasons = res.getStringArray(R.array.ex_2_12reason);solutions = res.getStringArray(R.array.ex_2_12sol);break;
            case "ex_2_13":reasons = res.getStringArray(R.array.ex_2_13reason);solutions = res.getStringArray(R.array.ex_2_13sol);break;
            case "ex_2_14":reasons = res.getStringArray(R.array.ex_2_14reason);solutions = res.getStringArray(R.array.ex_2_14sol);break;
            case "ex_2_15":reasons = res.getStringArray(R.array.ex_2_15reason);solutions = res.getStringArray(R.array.ex_2_15sol);break;
            case "ex_2_16":reasons = res.getStringArray(R.array.ex_2_16reason);solutions = res.getStringArray(R.array.ex_2_16sol);break;
            case "ex_2_17":reasons = res.getStringArray(R.array.ex_2_17reason);solutions = res.getStringArray(R.array.ex_2_17sol);break;
            case "ex_2_18":reasons = res.getStringArray(R.array.ex_2_18reason);solutions = res.getStringArray(R.array.ex_2_18sol);break;
            case "ex_2_19":reasons = res.getStringArray(R.array.ex_2_19reason);solutions = res.getStringArray(R.array.ex_2_19sol);break;
            case "ex_3_1":reasons = res.getStringArray(R.array.ex_3_1reason);solutions = res.getStringArray(R.array.ex_3_1sol);break;
            case "ex_3_2":reasons = res.getStringArray(R.array.ex_3_2reason);solutions = res.getStringArray(R.array.ex_3_2sol);break;
            case "ex_3_3":reasons = res.getStringArray(R.array.ex_3_3reason);solutions = res.getStringArray(R.array.ex_3_3sol);break;
            case "ex_3_4":reasons = res.getStringArray(R.array.ex_3_4reason);solutions = res.getStringArray(R.array.ex_3_4sol);break;
            case "ex_3_5":reasons = res.getStringArray(R.array.ex_3_5reason);solutions = res.getStringArray(R.array.ex_3_5sol);break;
            case "ex_3_6":reasons = res.getStringArray(R.array.ex_3_6reason);solutions = res.getStringArray(R.array.ex_3_6sol);break;
            case "ex_3_7":reasons = res.getStringArray(R.array.ex_3_7reason);solutions = res.getStringArray(R.array.ex_3_7sol);break;
            case "ex_3_8":reasons = res.getStringArray(R.array.ex_3_8reason);solutions = res.getStringArray(R.array.ex_3_8sol);break;
            case "ex_4_1":reasons = res.getStringArray(R.array.ex_4_1reason);solutions = res.getStringArray(R.array.ex_4_1sol);break;
            case "ex_4_2":reasons = res.getStringArray(R.array.ex_4_2reason);solutions = res.getStringArray(R.array.ex_4_2sol);break;
            case "ex_4_3":reasons = res.getStringArray(R.array.ex_4_3reason);solutions = res.getStringArray(R.array.ex_4_3sol);break;
            case "ex_4_4":reasons = res.getStringArray(R.array.ex_4_4reason);solutions = res.getStringArray(R.array.ex_4_4sol);break;
            case "ex_4_5":reasons = res.getStringArray(R.array.ex_4_5reason);solutions = res.getStringArray(R.array.ex_4_5sol);break;
            case "ex_4_6":reasons = res.getStringArray(R.array.ex_4_6reason);solutions = res.getStringArray(R.array.ex_4_6sol);break;
            case "ex_4_7":reasons = res.getStringArray(R.array.ex_4_7reason);solutions = res.getStringArray(R.array.ex_4_7sol);break;
            case "ex_4_8":reasons = res.getStringArray(R.array.ex_4_8reason);solutions = res.getStringArray(R.array.ex_4_8sol);break;
            case "ex_4_9":reasons = res.getStringArray(R.array.ex_4_9reason);solutions = res.getStringArray(R.array.ex_4_9sol);break;
            case "ex_4_10":reasons = res.getStringArray(R.array.ex_4_10reason);solutions = res.getStringArray(R.array.ex_4_10sol);break;
            case "ex_4_11":reasons = res.getStringArray(R.array.ex_4_11reason);solutions = res.getStringArray(R.array.ex_4_11sol);break;
            case "ex_4_12":reasons = res.getStringArray(R.array.ex_4_12reason);solutions = res.getStringArray(R.array.ex_4_12sol);break;
        }
        sollistview = findViewById(R.id.sol_Listview);
        realistview = findViewById(R.id.r_Listview);
        numbers = res.getStringArray(R.array.number2);
        Fault_solAdapter solAdapter = new Fault_solAdapter(this,numbers,solutions);
        sollistview.setAdapter(solAdapter);
        Fault_reasonAdapter reasonAdapter = new Fault_reasonAdapter(this,numbers,reasons);
        realistview.setAdapter(reasonAdapter);
    }
}
