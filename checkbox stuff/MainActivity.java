package edu.dtcc.mpalme22.codeforgood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    CheckBox cb = (CheckBox)findViewById(R.id.surveyBox);
    public void donatePushed(View v) {
        if(((cb) v).isChecked()){
            startActivity(new Intent(Share.this, surveyActivity.class));
        }
        }
    }

