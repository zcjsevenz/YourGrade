package com.example.zcjse.yourgrade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Find_grade_activity extends AppCompatActivity {
    private TextView nnametext;
    private TextView nscoretext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_grade_activity);
        //String bmiText = intent.getStringExtra("bmi_text");
        Intent intent = getIntent();
        String name = intent.getStringExtra("student_name");
        String scoreText = intent.getStringExtra("score_text");
        //TextView nBMI = (TextView) findViewById(R.id.ShowBMI);
        TextView nnametext = (TextView) findViewById(R.id.nametext);
        TextView nscoretext = (TextView) findViewById(R.id.scoretext);
        nnametext.setText(name);
        nscoretext.setText(scoreText);
    }
}
