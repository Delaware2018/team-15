package com.example.test.bpositive;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class leaderActivity extends AppCompatActivity {

    private static ListView leaderList;
    private static String[] names;
    private static String[] dollarDonations;
    private int[] ranks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader);


        Resources res = getResources(); //imports all the item data stored in strings.xml
        leaderList = (ListView) findViewById(R.id.leaderList);

        names = res.getStringArray(R.array.leaderboardNames);
        dollarDonations = res.getStringArray(R.array.donations);

        ranks=new int[names.length];
        for(int i=0; i<names.length; i++){
            ranks[i]=i+1;
        }

        leaderAdapter adapterObj = new leaderAdapter(this, names, dollarDonations, ranks);
        leaderList.setAdapter(adapterObj);


        leaderList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Intent showDetailActivity=new Intent(getApplicationContext(), randomActivity.class);
                showDetailActivity.putExtra("com.example.test.bpositive.RANK", Integer.toString(ranks[i]));
                showDetailActivity.putExtra("com.example.test.bpositive.NAME", names[i]);
                startActivity(showDetailActivity);
            }

        });

    }

}
