package com.example.ankur.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int Score() {
        int score = 0;

        //Question 1
        RadioGroup question1 = findViewById(R.id.ques1);
        int answer1 = question1.getCheckedRadioButtonId();
        if (answer1 == R.id.Q1O2) {
            score += 1;
        }
        //Question 2
        RadioGroup question2 = findViewById(R.id.ques2);
        int answer2 = question2.getCheckedRadioButtonId();
        if (answer2 == R.id.Q2O3) {
            score += 1;
        }
        //Question 3
        RadioGroup question3 = findViewById(R.id.ques3);
        int answer3 = question3.getCheckedRadioButtonId();
        if (answer3 == R.id.Q3O1) {
            score += 1;
        }
        //Question 4
        RadioGroup question4 = findViewById(R.id.ques4);
        int answer4 = question4.getCheckedRadioButtonId();
        if (answer4 == R.id.Q4O2) {
            score += 1;
        }
        //Question 5
        RadioGroup question5 = findViewById(R.id.ques5);
        int answer5 = question5.getCheckedRadioButtonId();
        if (answer5 == R.id.Q5O3) {
            score += 1;
        }
        //Question 6 (CheckBox)
        CheckBox checkBox = findViewById(R.id.checkBox);
        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);

        if (checkBox.isChecked() && checkBox2.isChecked() && !checkBox1.isChecked() && !checkBox3.isChecked()) {
            score += 1;
        }
        //Question 7 (EditText)
        EditText editText = findViewById(R.id.answer7);
        String answer7 = editText.getText().toString();
        String today = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        if (answer7.equals(today)) {
            score += 1;
        }
        return score;
    }

    public void Result(View view){
        int Totalscore = Score();
        if(Totalscore == 7) {
           Toast.makeText(this,"Congratulations, You got all answers correct with a score of " + Totalscore,Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this,"Your Score is " + Totalscore, Toast.LENGTH_LONG).show();
        }
    }
}
