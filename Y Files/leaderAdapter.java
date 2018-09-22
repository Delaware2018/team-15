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
    private static int[] ranks;

    public leaderAdapter(Context context, String[] names, String[] dollarDonations, int[] ranks){
        this.names=names;
        this.dollarDonations=dollarDonations;
        this.ranks=ranks;
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
        TextView nameText=(TextView)v.findViewById(R.id.nameText);
        TextView dollarText=(TextView)v.findViewById(R.id.dollarText);
        TextView rankText=(TextView)v.findViewById(R.id.rankText);

        int ranksTemp=ranks[i];
        String nameTemp=names[i];
        String donationTemp=dollarDonations[i];

        rankText.setText(Integer.toString(ranks[i]));
        nameText.setText(names[i]);
        dollarText.setText(dollarDonations[i]);

        return v;
    }
}


