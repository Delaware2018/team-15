package com.example.test.bpositive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class leaderAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    private static String[] names;
    private static String[] dollarDonations;

    public leaderAdapter(Context context, String[] names, String[] dollarDonations){
        this.names=names;
        this.dollarDonations=dollarDonations;
        mInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return names[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View v=mInflater.inflate(R.layout.leader_list, null);
        //references the fields in carlist_layout.xml
        TextView nameText=(TextView)v.findViewById(R.id.nameText);
        TextView dollarText=(TextView)v.findViewById(R.id.dollarText);

        String nameTemp=names[i];
        String donationTemp=dollarDonations[i];

        nameText.setText(names[i]);
        dollarText.setText(dollarDonations[i]);

        return v;
    }
}


