package com.example.a57407.problemapp;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
public class othersol_Activity extends AppCompatActivity {
        ListView otreasonListview;
        ListView otsolListview;
        String[] numbers;
        String[] reasons;
        String[] solutions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_othersol_);
        String otherfault_index = getIntent().getExtras().get("switch_fault_index").toString();
        Resources res = getResources();
        switch(otherfault_index){
            case "ot_1_1":reasons = res.getStringArray(R.array.ot_1_1reason);solutions = res.getStringArray(R.array.ot_1_1sol);break;
            case "ot_1_2":reasons = res.getStringArray(R.array.ot_1_2reason);solutions = res.getStringArray(R.array.ot_1_2sol);break;
            case "ot_1_3":reasons = res.getStringArray(R.array.ot_1_3reason);solutions = res.getStringArray(R.array.ot_1_3sol);break;
            case "ot_1_4":reasons = res.getStringArray(R.array.ot_1_4reason);solutions = res.getStringArray(R.array.ot_1_4sol);break;
            case "ot_1_5":reasons = res.getStringArray(R.array.ot_1_5reason);solutions = res.getStringArray(R.array.ot_1_5sol);break;
            case "ot_1_6":reasons = res.getStringArray(R.array.ot_1_6reason);solutions = res.getStringArray(R.array.ot_1_6sol);break;
            case "ot_1_7":reasons = res.getStringArray(R.array.ot_1_7reason);solutions = res.getStringArray(R.array.ot_1_7sol);break;
            case "ot_1_8":reasons = res.getStringArray(R.array.ot_1_8reason);solutions = res.getStringArray(R.array.ot_1_8sol);break;
            case "ot_1_9":reasons = res.getStringArray(R.array.ot_1_9reason);solutions = res.getStringArray(R.array.ot_1_9sol);break;
            case "ot_1_10":reasons = res.getStringArray(R.array.ot_1_10reason);solutions = res.getStringArray(R.array.ot_1_10sol);break;
            case "ot_1_11":reasons = res.getStringArray(R.array.ot_1_11reason);solutions = res.getStringArray(R.array.ot_1_11sol);break;
            case "ot_1_12":reasons = res.getStringArray(R.array.ot_1_12reason);solutions = res.getStringArray(R.array.ot_1_12sol);break;
            case "ot_1_13":reasons = res.getStringArray(R.array.ot_1_13reason);solutions = res.getStringArray(R.array.ot_1_13sol);break;
            case "ot_1_14":reasons = res.getStringArray(R.array.ot_1_14reason);solutions = res.getStringArray(R.array.ot_1_14sol);break;
            case "ot_1_15":reasons = res.getStringArray(R.array.ot_1_15reason);solutions = res.getStringArray(R.array.ot_1_15sol);break;
            case "ot_1_16":reasons = res.getStringArray(R.array.ot_1_16reason);solutions = res.getStringArray(R.array.ot_1_16sol);break;
            case "ot_1_17":reasons = res.getStringArray(R.array.ot_1_17reason);solutions = res.getStringArray(R.array.ot_1_17sol);break;
            case "ot_1_18":reasons = res.getStringArray(R.array.ot_1_18reason);solutions = res.getStringArray(R.array.ot_1_18sol);break;
            case "ot_1_19":reasons = res.getStringArray(R.array.ot_1_19reason);solutions = res.getStringArray(R.array.ot_1_19sol);break;
            case "ot_1_20":reasons = res.getStringArray(R.array.ot_1_20reason);solutions = res.getStringArray(R.array.ot_1_20sol);break;
            case "ot_1_21":reasons = res.getStringArray(R.array.ot_1_21reason);solutions = res.getStringArray(R.array.ot_1_21sol);break;
            case "ot_1_22":reasons = res.getStringArray(R.array.ot_1_22reason);solutions = res.getStringArray(R.array.ot_1_22sol);break;
            case "ot_2_1":reasons = res.getStringArray(R.array.ot_2_1reason);solutions = res.getStringArray(R.array.ot_2_1sol);break;
            case "ot_2_2":reasons = res.getStringArray(R.array.ot_2_2reason);solutions = res.getStringArray(R.array.ot_2_2sol);break;
            case "ot_2_3":reasons = res.getStringArray(R.array.ot_2_3reason);solutions = res.getStringArray(R.array.ot_2_3sol);break;
            case "ot_2_4":reasons = res.getStringArray(R.array.ot_2_4reason);solutions = res.getStringArray(R.array.ot_2_4sol);break;
            case "ot_2_5":reasons = res.getStringArray(R.array.ot_2_5reason);solutions = res.getStringArray(R.array.ot_2_5sol);break;
            case "ot_2_6":reasons = res.getStringArray(R.array.ot_2_6reason);solutions = res.getStringArray(R.array.ot_2_6sol);break;
            case "ot_2_7":reasons = res.getStringArray(R.array.ot_2_7reason);solutions = res.getStringArray(R.array.ot_2_7sol);break;
            case "ot_2_8":reasons = res.getStringArray(R.array.ot_2_8reason);solutions = res.getStringArray(R.array.ot_2_8sol);break;
            case "ot_2_9":reasons = res.getStringArray(R.array.ot_2_9reason);solutions = res.getStringArray(R.array.ot_2_9sol);break;
            case "ot_2_10":reasons = res.getStringArray(R.array.ot_2_10reason);solutions = res.getStringArray(R.array.ot_2_10sol);break;
            case "ot_2_11":reasons = res.getStringArray(R.array.ot_2_11reason);solutions = res.getStringArray(R.array.ot_2_11sol);break;
        }
        otsolListview = findViewById(R.id.otsolListview);
        otreasonListview = findViewById(R.id.otreasonListview);
        numbers = res.getStringArray(R.array.number2);
        Fault_solAdapter solAdapter = new Fault_solAdapter(this,numbers,solutions);
        otsolListview.setAdapter(solAdapter);
        Fault_solAdapter reasonAdapter = new Fault_solAdapter(this,numbers,reasons);
        otreasonListview.setAdapter(reasonAdapter);
    }
}
