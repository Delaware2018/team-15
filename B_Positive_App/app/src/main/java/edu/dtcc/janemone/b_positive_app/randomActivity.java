package edu.dtcc.janemone.b_positive_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class randomActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        if(getIntent().hasExtra("edu.dtcc.janemone.b_positive_app.RANK")){ //if intent is passing extras(string in this case)
            TextView rankNum = (TextView)findViewById(R.id.rankNum);
            String text= getIntent().getExtras().getString("edu.dtcc.janemone.b_positive_app.RANK");
            //get string from intent
            rankNum.setText("Rank "+text);
        }

        if(getIntent().hasExtra("edu.dtcc.janemone.b_positive_app.NAME")){ //if intent is passing extras(string in this case)
            TextView donorNameText = (TextView)findViewById(R.id.donorNameText);
            String text= getIntent().getExtras().getString("edu.dtcc.janemone.b_positive_app.NAME");
            //get string from intent
            donorNameText.setText(text);
        }
    }
}
