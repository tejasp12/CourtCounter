package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String teamsScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreePointsForA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoPointsForA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOnePointForA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreePointsForB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoPointsForB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOnePointForB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset scores when the button is clicked.
     */
    public void resetToZero(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        fScoreForTeamA(scoreTeamA);
        fScoreForTeamB(scoreTeamB);
    }
    /**
     * Displays the final score for team A.
     */
    public void fScoreForTeamA(int fscoreA){
        TextView scoreView = (TextView) findViewById(R.id.fscoretA_text_view);
        scoreView.setText(String.valueOf(fscoreA));
    }
    /**
     * Displays the final score for team B.
     */
    public void fScoreForTeamB(int fscoreB){
        TextView scoreView = (TextView) findViewById(R.id.fscoretB_text_view);
        scoreView.setText(String.valueOf(fscoreB));
    }
    /**
     * Show final score when clicked.
     */
    public void showScore(View view){
        fScoreForTeamA(scoreTeamA);
        fScoreForTeamB(scoreTeamB);
    }
}
