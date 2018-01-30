package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA, scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3A(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }

    public void add2A(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    public void add1A(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    public void add3B(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    public void add2B(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    public void add1B(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }
    /**

     * Displays the given score for Team A.

     */

    public void displayA(int score) {

        TextView scoreView = findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
