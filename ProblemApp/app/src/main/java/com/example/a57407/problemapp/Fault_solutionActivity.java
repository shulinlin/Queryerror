package com.example.a57407.problemapp;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
public class Fault_solutionActivity extends AppCompatActivity {
    ListView sol_listview;
    ListView rea_listview;
    String[] numbers;
    String[] reasons;
    String[] solution;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fault_solution);
        String switch_fault_idx = getIntent().getExtras().get("switch_fault_index").toString();

        Resources res = getResources();

        switch(switch_fault_idx){
            case "s_1_1":reasons = res.getStringArray(R.array.s_1_1_reason);solution = res.getStringArray(R.array.s_1_1_sol);break;
            case "s_1_2":reasons = res.getStringArray(R.array.s_1_2_reason);solution = res.getStringArray(R.array.s_1_2_sol);break;
            case "s_1_3":reasons = res.getStringArray(R.array.s_1_3_reason);solution = res.getStringArray(R.array.s_1_3_sol);break;
            case "s_1_4":reasons = res.getStringArray(R.array.s_1_4_reason);solution = res.getStringArray(R.array.s_1_4_sol);break;
            case "s_2_1":reasons = res.getStringArray(R.array.s_2_1_reason);solution = res.getStringArray(R.array.s_2_1_sol);break;
            case "s_2_2":reasons = res.getStringArray(R.array.s_2_2_reason);solution = res.getStringArray(R.array.s_2_2_sol);break;
            case "s_2_3":reasons = res.getStringArray(R.array.s_2_3_reason);solution = res.getStringArray(R.array.s_2_3_sol);break;
            case "s_3_1":reasons = res.getStringArray(R.array.s_3_1_reason);solution = res.getStringArray(R.array.s_3_1_sol);break;
            case "s_3_2":reasons = res.getStringArray(R.array.s_3_2_reason);solution = res.getStringArray(R.array.s_3_2_sol);break;
            case "s_3_3":reasons = res.getStringArray(R.array.s_3_3_reason);solution = res.getStringArray(R.array.s_3_3_sol);break;
            case "s_3_4":reasons = res.getStringArray(R.array.s_3_4_reason);solution = res.getStringArray(R.array.s_3_4_sol);break;
            case "s_4_1":reasons = res.getStringArray(R.array.s_4_1_reason);solution = res.getStringArray(R.array.s_4_1_sol);break;
            case "s_5_1":reasons = res.getStringArray(R.array.s_5_1_reason);solution = res.getStringArray(R.array.s_5_1_sol);break;
            case "s_5_2":reasons = res.getStringArray(R.array.s_5_2_reason);solution = res.getStringArray(R.array.s_5_2_sol);break;
            case "s_5_3":reasons = res.getStringArray(R.array.s_5_3_reason);solution = res.getStringArray(R.array.s_5_3_sol);break;
            case "s_6_1":reasons = res.getStringArray(R.array.s_6_1_reason);solution = res.getStringArray(R.array.s_6_1_sol);break;
            case "s_6_2":reasons = res.getStringArray(R.array.s_6_2_reason);solution = res.getStringArray(R.array.s_6_2_sol);break;
            case "s_6_3":reasons = res.getStringArray(R.array.s_6_3_reason);solution = res.getStringArray(R.array.s_6_3_sol);break;
            case "s_7_1":reasons = res.getStringArray(R.array.s_7_1_reason);solution = res.getStringArray(R.array.s_7_1_sol);break;
            case "s_7_2":reasons = res.getStringArray(R.array.s_7_2_reason);solution = res.getStringArray(R.array.s_7_2_sol);break;
            case "s_7_3":reasons = res.getStringArray(R.array.s_7_3_reason);solution = res.getStringArray(R.array.s_7_3_sol);break;
            case "s_7_4":reasons = res.getStringArray(R.array.s_7_4_reason);solution = res.getStringArray(R.array.s_7_4_sol);break;
            case "s_7_5":reasons = res.getStringArray(R.array.s_7_5_reason);solution = res.getStringArray(R.array.s_7_5_sol);break;
            case "s_7_6":reasons = res.getStringArray(R.array.s_7_6_reason);solution = res.getStringArray(R.array.s_7_6_sol);break;
            case "s_8_1":reasons = res.getStringArray(R.array.s_8_1_reason);solution = res.getStringArray(R.array.s_8_1_sol);break;
            case "s_8_2":reasons = res.getStringArray(R.array.s_8_2_reason);solution = res.getStringArray(R.array.s_8_2_sol);break;
            case "s_8_3":reasons = res.getStringArray(R.array.s_8_3_reason);solution = res.getStringArray(R.array.s_8_3_sol);break;
            case "s_9_1":reasons = res.getStringArray(R.array.s_9_1_reason);solution = res.getStringArray(R.array.s_9_1_sol);break;
            case "s_10_1":reasons = res.getStringArray(R.array.s_10_1_reason);solution = res.getStringArray(R.array.s_10_1_sol);break;
            case "s_10_2":reasons = res.getStringArray(R.array.s_10_2_reason);solution = res.getStringArray(R.array.s_10_2_sol);break;
            case "s_10_3":reasons = res.getStringArray(R.array.s_10_3_reason);solution = res.getStringArray(R.array.s_10_3_sol);break;
            case "s_10_4":reasons = res.getStringArray(R.array.s_10_4_reason);solution = res.getStringArray(R.array.s_10_4_sol);break;
            case "s_10_5":reasons = res.getStringArray(R.array.s_10_5_reason);solution = res.getStringArray(R.array.s_10_5_sol);break;
            case "s_11_1":reasons = res.getStringArray(R.array.s_11_1_reason);solution = res.getStringArray(R.array.s_11_1_sol);break;
            case "s_11_2":reasons = res.getStringArray(R.array.s_11_2_reason);solution = res.getStringArray(R.array.s_11_2_sol);break;
            case "s_11_3":reasons = res.getStringArray(R.array.s_11_3_reason);solution = res.getStringArray(R.array.s_11_3_sol);break;
            case "s_11_4":reasons = res.getStringArray(R.array.s_11_4_reason);solution = res.getStringArray(R.array.s_11_4_sol);break;
            case "s_11_5":reasons = res.getStringArray(R.array.s_11_5_reason);solution = res.getStringArray(R.array.s_11_5_sol);break;
            case "s_11_6":reasons = res.getStringArray(R.array.s_11_6_reason);solution = res.getStringArray(R.array.s_11_6_sol);break;
            case "s_11_7":reasons = res.getStringArray(R.array.s_11_7_reason);solution = res.getStringArray(R.array.s_11_7_sol);break;
            case "s_12_1":reasons = res.getStringArray(R.array.s_12_1_reason);solution = res.getStringArray(R.array.s_12_1_sol);break;
            case "s_12_2":reasons = res.getStringArray(R.array.s_12_2_reason);solution = res.getStringArray(R.array.s_12_2_sol);break;
            case "s_12_3":reasons = res.getStringArray(R.array.s_12_3_reason);solution = res.getStringArray(R.array.s_12_3_sol);break;
            case "s_12_4":reasons = res.getStringArray(R.array.s_12_4_reason);solution = res.getStringArray(R.array.s_12_4_sol);break;
            case "s_12_5":reasons = res.getStringArray(R.array.s_12_5_reason);solution = res.getStringArray(R.array.s_12_5_sol);break;
            case "s_13_1":reasons = res.getStringArray(R.array.s_13_1_reason);solution = res.getStringArray(R.array.s_13_1_sol);break;
            case "s_13_2":reasons = res.getStringArray(R.array.s_13_2_reason);solution = res.getStringArray(R.array.s_13_2_sol);break;
            case "s_13_3":reasons = res.getStringArray(R.array.s_13_3_reason);solution = res.getStringArray(R.array.s_13_3_sol);break;
            case "s_13_4":reasons = res.getStringArray(R.array.s_13_4_reason);solution = res.getStringArray(R.array.s_13_4_sol);break;
            case "s_13_5":reasons = res.getStringArray(R.array.s_13_5_reason);solution = res.getStringArray(R.array.s_13_5_sol);break;
            case "s_13_6":reasons = res.getStringArray(R.array.s_13_6_reason);solution = res.getStringArray(R.array.s_13_6_sol);break;
            case "s_14_1":reasons = res.getStringArray(R.array.s_14_1_reason);solution = res.getStringArray(R.array.s_14_1_sol);break;
            case "s_14_2":reasons = res.getStringArray(R.array.s_14_2_reason);solution = res.getStringArray(R.array.s_14_2_sol);break;
            case "s_14_3":reasons = res.getStringArray(R.array.s_14_3_reason);solution = res.getStringArray(R.array.s_14_3_sol);break;
            case "s_14_4":reasons = res.getStringArray(R.array.s_14_4_reason);solution = res.getStringArray(R.array.s_14_4_sol);break;
            case "s_14_5":reasons = res.getStringArray(R.array.s_14_5_reason);solution = res.getStringArray(R.array.s_14_5_sol);break;
            case "s_14_6":reasons = res.getStringArray(R.array.s_14_6_reason);solution = res.getStringArray(R.array.s_14_6_sol);break;
            case "s_15_1":reasons = res.getStringArray(R.array.s_15_1_reason);solution = res.getStringArray(R.array.s_15_1_sol);break;
            case "s_15_2":reasons = res.getStringArray(R.array.s_15_2_reason);solution = res.getStringArray(R.array.s_15_2_sol);break;
            case "s_15_3":reasons = res.getStringArray(R.array.s_15_3_reason);solution = res.getStringArray(R.array.s_15_3_sol);break;
            case "s_15_4":reasons = res.getStringArray(R.array.s_15_4_reason);solution = res.getStringArray(R.array.s_15_4_sol);break;
            case "s_15_5":reasons = res.getStringArray(R.array.s_15_5_reason);solution = res.getStringArray(R.array.s_15_5_sol);break;
            case "s_15_6":reasons = res.getStringArray(R.array.s_15_6_reason);solution = res.getStringArray(R.array.s_15_6_sol);break;
            case "s_15_7":reasons = res.getStringArray(R.array.s_15_7_reason);solution = res.getStringArray(R.array.s_15_7_sol);break;
            case "s_16_1":reasons = res.getStringArray(R.array.s_16_1_reason);solution = res.getStringArray(R.array.s_16_1_sol);break;
            case "s_16_2":reasons = res.getStringArray(R.array.s_16_2_reason);solution = res.getStringArray(R.array.s_16_2_sol);break;
            case "s_16_3":reasons = res.getStringArray(R.array.s_16_3_reason);solution = res.getStringArray(R.array.s_16_3_sol);break;
            case "s_16_4":reasons = res.getStringArray(R.array.s_16_4_reason);solution = res.getStringArray(R.array.s_16_4_sol);break;
            case "s_16_5":reasons = res.getStringArray(R.array.s_16_5_reason);solution = res.getStringArray(R.array.s_16_5_sol);break;
            case "s_16_6":reasons = res.getStringArray(R.array.s_16_6_reason);solution = res.getStringArray(R.array.s_16_6_sol);break;
            case "s_17_1":reasons = res.getStringArray(R.array.s_17_1_reason);solution = res.getStringArray(R.array.s_17_1_sol);break;
            case "s_17_2":reasons = res.getStringArray(R.array.s_17_2_reason);solution = res.getStringArray(R.array.s_17_2_sol);break;
            case "s_17_3":reasons = res.getStringArray(R.array.s_17_3_reason);solution = res.getStringArray(R.array.s_17_3_sol);break;
            case "s_17_4":reasons = res.getStringArray(R.array.s_17_4_reason);solution = res.getStringArray(R.array.s_17_4_sol);break;
            case "s_17_5":reasons = res.getStringArray(R.array.s_17_5_reason);solution = res.getStringArray(R.array.s_17_5_sol);break;
            case "s_17_6":reasons = res.getStringArray(R.array.s_17_6_reason);solution = res.getStringArray(R.array.s_17_6_sol);break;
            case "s_17_7":reasons = res.getStringArray(R.array.s_17_7_reason);solution = res.getStringArray(R.array.s_17_7_sol);break;
            case "s_17_8":reasons = res.getStringArray(R.array.s_17_8_reason);solution = res.getStringArray(R.array.s_17_8_sol);break;
            case "s_17_9":reasons = res.getStringArray(R.array.s_17_9_reason);solution = res.getStringArray(R.array.s_17_9_sol);break;
            case "s_17_10":reasons = res.getStringArray(R.array.s_17_10_reason);solution = res.getStringArray(R.array.s_17_10_sol);break;
            case "s_17_11":reasons = res.getStringArray(R.array.s_17_11_reason);solution = res.getStringArray(R.array.s_17_11_sol);break;
            case "s_17_12":reasons = res.getStringArray(R.array.s_17_12_reason);solution = res.getStringArray(R.array.s_17_12_sol);break;
            case "s_17_13":reasons = res.getStringArray(R.array.s_17_13_reason);solution = res.getStringArray(R.array.s_17_13_sol);break;
            case "s_17_14":reasons = res.getStringArray(R.array.s_17_14_reason);solution = res.getStringArray(R.array.s_17_14_sol);break;
            case "s_17_15":reasons = res.getStringArray(R.array.s_17_15_reason);solution = res.getStringArray(R.array.s_17_15_sol);break;
            case "s_17_16":reasons = res.getStringArray(R.array.s_17_16_reason);solution = res.getStringArray(R.array.s_17_16_sol);break;
            case "s_17_17":reasons = res.getStringArray(R.array.s_17_17_reason);solution = res.getStringArray(R.array.s_17_17_sol);break;
            case "s_17_18":reasons = res.getStringArray(R.array.s_17_18_reason);solution = res.getStringArray(R.array.s_17_18_sol);break;
            case "s_17_19":reasons = res.getStringArray(R.array.s_17_19_reason);solution = res.getStringArray(R.array.s_17_19_sol);break;
            case "s_17_20":reasons = res.getStringArray(R.array.s_17_20_reason);solution = res.getStringArray(R.array.s_17_20_sol);break;
            case "s_17_21":reasons = res.getStringArray(R.array.s_17_21_reason);solution = res.getStringArray(R.array.s_17_21_sol);break;
            case "s_17_22":reasons = res.getStringArray(R.array.s_17_22_reason);solution = res.getStringArray(R.array.s_17_22_sol);break;
            case "s_17_23":reasons = res.getStringArray(R.array.s_17_23_reason);solution = res.getStringArray(R.array.s_17_23_sol);break;
            case "s_17_24":reasons = res.getStringArray(R.array.s_17_24_reason);solution = res.getStringArray(R.array.s_17_24_sol);break;
            case "s_17_25":reasons = res.getStringArray(R.array.s_17_25_reason);solution = res.getStringArray(R.array.s_17_25_sol);break;
            case "s_17_26":reasons = res.getStringArray(R.array.s_17_26_reason);solution = res.getStringArray(R.array.s_17_26_sol);break;
            case "s_17_27":reasons = res.getStringArray(R.array.s_17_27_reason);solution = res.getStringArray(R.array.s_17_27_sol);break;
            case "s_17_28":reasons = res.getStringArray(R.array.s_17_28_reason);solution = res.getStringArray(R.array.s_17_28_sol);break;
            case "s_17_29":reasons = res.getStringArray(R.array.s_17_29_reason);solution = res.getStringArray(R.array.s_17_29_sol);break;
            case "s_17_30":reasons = res.getStringArray(R.array.s_17_30_reason);solution = res.getStringArray(R.array.s_17_30_sol);break;
            case "s_17_31":reasons = res.getStringArray(R.array.s_17_31_reason);solution = res.getStringArray(R.array.s_17_31_sol);break;
            case "s_17_32":reasons = res.getStringArray(R.array.s_17_32_reason);solution = res.getStringArray(R.array.s_17_32_sol);break;
            case "s_17_33":reasons = res.getStringArray(R.array.s_17_33_reason);solution = res.getStringArray(R.array.s_17_33_sol);break;
            case "s_17_34":reasons = res.getStringArray(R.array.s_17_34_reason);solution = res.getStringArray(R.array.s_17_34_sol);break;
            case "s_17_35":reasons = res.getStringArray(R.array.s_17_35_reason);solution = res.getStringArray(R.array.s_17_35_sol);break;
            case "s_17_36":reasons = res.getStringArray(R.array.s_17_36_reason);solution = res.getStringArray(R.array.s_17_36_sol);break;
            case "s_17_37":reasons = res.getStringArray(R.array.s_17_37_reason);solution = res.getStringArray(R.array.s_17_37_sol);break;







        }
        sol_listview = findViewById(R.id.fault_solution_listview);
        rea_listview = findViewById(R.id.fault_reason_listview);
        numbers = res.getStringArray(R.array.number2);


        Fault_solAdapter fault_solAdapter = new Fault_solAdapter(this,numbers,solution);
        sol_listview.setAdapter(fault_solAdapter);
        Fault_reasonAdapter fault_reasonAdapter = new Fault_reasonAdapter(this,numbers,reasons);
        rea_listview.setAdapter(fault_reasonAdapter);


    }
}
