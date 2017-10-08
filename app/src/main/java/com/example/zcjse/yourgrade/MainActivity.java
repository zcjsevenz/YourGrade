package com.example.zcjse.yourgrade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText neditname;
    private EditText neditscore;
    private Button nfindgrade;
    private Button nexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //nHeightEditText = (EditText) findViewById(R.id.height_edit_text);
        neditname = (EditText) findViewById(R.id.edit_Name);
        neditscore = (EditText) findViewById(R.id.edit_Score);
        nfindgrade = (Button) findViewById(R.id.Find_Grade_Button);
        nexit = (Button) findViewById(R.id.Exit_Button);
        neditname.setError("put your name");
        neditscore.setError("put your score");
        nfindgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = String.valueOf(neditname.getText().toString());
                Double score = Double.valueOf(neditscore.getText().toString());
                String scoreText = getscoreText(score);

                Intent intent = new Intent(MainActivity.this, Find_grade_activity.class);


                intent.putExtra("student_name", name);

                intent.putExtra("score_text", scoreText);

                startActivity(intent);
            }


        });
        Button nexit = (Button) findViewById(R.id.Exit_Button);
        nexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private String getscoreText(Double score) {

        String scoreText = "";
        if (score < 50) {
            scoreText = "F";
        } else if (score >= 50 && score < 60) {
            scoreText = "D";
        } else if (score >= 60 && score < 70) {
            scoreText = "C";
        } else if (score >= 70 && score < 80) {
            scoreText = "B";
        } else if (score >= 80) {
            scoreText = "A";
        }
        return scoreText;
    }
}
/*

คะแนน
เกรด
ตั้งแต่ 80 ขึ้นไป
A
70 - 79
B
60 - 69
C
50 - 59
D
ตั้งแต่ 49 ลงไป
F

 */