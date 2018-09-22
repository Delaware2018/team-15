package edu.dtcc.janemone.b_positive_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class surveyActivity extends AppCompatActivity {

    Spinner genderSpinner;
    Spinner sponsorSpinner;
    Spinner socialSpinner;
    Spinner ethnicitySpinner;
    Spinner hearSpinner;
    Spinner newsSpinner;
    Button submitBtn;
    TextView errorText;

    ArrayAdapter<CharSequence> genderAdapter;
    ArrayAdapter<CharSequence> sponsorAdapter;
    ArrayAdapter<CharSequence> socialAdapter;
    ArrayAdapter<CharSequence> ethnicityAdapter;
    ArrayAdapter<CharSequence> hearAdapter;
    ArrayAdapter<CharSequence> newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        genderSpinner=(Spinner)findViewById(R.id.genderSpinner);
        genderAdapter=ArrayAdapter.createFromResource(this,R.array.genders,android.R.layout.simple_spinner_item);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);

        ethnicitySpinner=(Spinner)findViewById(R.id.ethnicitySpinner);
        ethnicityAdapter=ArrayAdapter.createFromResource(this,R.array.ethnicity,android.R.layout.simple_spinner_item);
        ethnicityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ethnicitySpinner.setAdapter(ethnicityAdapter);


        sponsorSpinner=(Spinner)findViewById(R.id.sponsorSpinner);
        sponsorAdapter=ArrayAdapter.createFromResource(this,R.array.sponsor_yes_no,android.R.layout.simple_spinner_item);
        sponsorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sponsorSpinner.setAdapter(sponsorAdapter);

        socialSpinner=(Spinner)findViewById(R.id.socialSpinner);
        socialAdapter=ArrayAdapter.createFromResource(this,R.array.social_yes_no,android.R.layout.simple_spinner_item);
        socialAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        socialSpinner.setAdapter(socialAdapter);

        hearSpinner=(Spinner)findViewById(R.id.hearSpinner);
        hearAdapter=ArrayAdapter.createFromResource(this,R.array.hear,android.R.layout.simple_spinner_item);
        hearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hearSpinner.setAdapter(hearAdapter);

        newsSpinner=(Spinner)findViewById(R.id.newsSpinner);
        newsAdapter=ArrayAdapter.createFromResource(this,R.array.news,android.R.layout.simple_spinner_item);
        newsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        newsSpinner.setAdapter(newsAdapter);

        submitBtn=(Button)findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                errorText=(TextView)findViewById(R.id.errorText);
                if(genderSpinner.getSelectedItem().equals("Gender")||ethnicitySpinner.getSelectedItem().equals("Ethnicity")||
                        sponsorSpinner.getSelectedItem().equals("Can you sponsor an event?")||socialSpinner.getSelectedItem().equals("Would you share on social media?")||
                        hearSpinner.getSelectedItem().equals("How did you hear about us?")||newsSpinner.getSelectedItem().equals("Would you like monthly newsletter?")){
                    errorText.setText("Please select appropriate options");
                }

            }
        });
    }
}
