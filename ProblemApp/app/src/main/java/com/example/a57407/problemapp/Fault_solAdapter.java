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

public class Fault_solAdapter extends BaseAdapter {
    LayoutInflater minflater;
    String[] numbers;
    String[] solutions;
    public Fault_solAdapter(Context c, String[] n, String[] sol){
        numbers = n;
        solutions = sol;
        minflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return solutions.length;
    }
    @Override
    public Object getItem(int i) {
        return solutions[i];
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = minflater.inflate(R.layout.fault_solution_listview_detail,null);
        TextView numTextview = (TextView)v.findViewById(R.id.numberTextview);
        TextView solTextview = (TextView)v.findViewById(R.id.solutionTextview);
        String num = numbers[i];
        String sol = solutions[i];
        numTextview.setText(num);
        solTextview.setText(sol);
        return v;
    }
}
