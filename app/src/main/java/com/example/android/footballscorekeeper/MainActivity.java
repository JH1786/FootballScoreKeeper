package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeam1 = 0;
    int scoreTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This resets points for Football Team 1 and Football Team 2 to 0
     */
    public void resetScore(View v) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
    }

    /**
     * Displays the given score for Football Team 1.
     */
    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This adds 6 points for Football Team 1
     */
    public void addSixForTeam1(View v) {
        scoreTeam1 = scoreTeam1 + 6;
        displayForTeam1(scoreTeam1);
    }

    /**
     * This adds 3 points for Football Team 1
     */
    public void addThreeForTeam1(View v) {
        scoreTeam1 = scoreTeam1 + 3;
        displayForTeam1(scoreTeam1);
    }

    /**
     * This adds 2 points for Football Team 1
     */
    public void addTwoForTeam1(View v) {
        scoreTeam1 = scoreTeam1 + 2;
        displayForTeam1(scoreTeam1);
    }

    /**
     * This adds 1 point for Football Team 1
     */

    public void addOneForTeam1(View v) {
        scoreTeam1 = scoreTeam1 + 1;
        displayForTeam1(scoreTeam1);
    }


    /**
     * Displays the given score for Football Team 2
     */
    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This adds 6 points for Football Team 2
     */
    public void addSixForTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 6;
        displayForTeam2(scoreTeam2);
    }

    /**
     * This adds 3 points for Football Team 2
     */
    public void addThreeForTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 3;
        displayForTeam2(scoreTeam2);
    }

    /**
     * This adds 2 points for Football Team 2
     */
    public void addTwoForTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 2;
        displayForTeam2(scoreTeam2);
    }

    /**
     * This adds 1 point for Football Team 2
     */
    public void addOneForTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 1;
        displayForTeam2(scoreTeam2);
    }

}
