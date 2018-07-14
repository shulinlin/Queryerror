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
public class Fault_nameAdapter extends BaseAdapter {
    LayoutInflater minflater;
    String[] fault_name;
    public Fault_nameAdapter(Context c,String[] fault_n){
        fault_name = fault_n;
        minflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return fault_name.length;
    }
    @Override
    public Object getItem(int i) {
        return fault_name[i];
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = minflater.inflate(R.layout.fault_name_listview_detail,null);
        TextView fname = (TextView)v.findViewById(R.id.fault_nameTextview);
        String name = fault_name[i];
        fname.setText(name);
        return v;
    }
}
