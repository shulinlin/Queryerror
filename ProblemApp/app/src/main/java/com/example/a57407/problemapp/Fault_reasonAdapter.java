package com.example.a57407.problemapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
/**
 * Created by 57407 on 2018/2/23.
 */
public class Fault_reasonAdapter extends BaseAdapter {
    LayoutInflater minflater;
    String[] numbers;
    String[] reasons;
    public Fault_reasonAdapter(Context c, String[] n, String[] r){
        numbers = n;
        reasons = r;
        minflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return reasons.length;
    }
    @Override
    public Object getItem(int i) {
        return reasons[i];
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = minflater.inflate(R.layout.fault_solution_listview_detail,null);
        TextView numTextview = (TextView)v.findViewById(R.id.numberTextview);
        TextView reasonTextview = (TextView)v.findViewById(R.id.solutionTextview);
        String number = numbers[i];
        String reason = reasons[i];
        numTextview.setText(number);
        reasonTextview.setText(reason);
        return v;
    }
}
