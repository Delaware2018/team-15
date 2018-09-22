package com.example.test.bpositive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class randomActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        if(getIntent().hasExtra("com.example.test.bpositive.RANK")){ //if intent is passing extras(string in this case)
            TextView rankNum = (TextView)findViewById(R.id.rankNum);
            String text= getIntent().getExtras().getString("com.example.test.bpositive.RANK");
            //get string from intent
            rankNum.setText("Rank "+text);
        }

        if(getIntent().hasExtra("com.example.test.bpositive.NAME")){ //if intent is passing extras(string in this case)
            TextView donorNameText = (TextView)findViewById(R.id.donorNameText);
            String text= getIntent().getExtras().getString("com.example.test.bpositive.NAME");
            //get string from intent
            donorNameText.setText(text);
        }
    }
}
