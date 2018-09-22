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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader);


        Resources res = getResources(); //imports all the item data stored in strings.xml
        leaderList = (ListView) findViewById(R.id.leaderList);

        names = res.getStringArray(R.array.leaderboardNames); //stores the car names in a string array
        dollarDonations = res.getStringArray(R.array.donations);

        //CarAdapter object has the proper layout for displaying the data
        leaderAdapter adapterObj = new leaderAdapter(this, names, dollarDonations);
        leaderList.setAdapter(adapterObj);


    }

}
