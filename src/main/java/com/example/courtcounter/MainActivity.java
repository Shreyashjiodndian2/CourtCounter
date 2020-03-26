package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int score_a=0;
    public int score_b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void score_3_teama(View view){
        score_a += 3;
        displayTeamA(score_a);
    }
    public void score_2_teama(View view){
        score_a +=2;
        displayTeamA(score_a);
    }
    public void score_freethrow_teama(View view){
        score_a +=1;
        displayTeamA(score_a);
    }
    public void displayTeamA(int number){
        TextView a = (TextView) findViewById(R.id.score_a);
        a.setText(String.valueOf(number));
    }
    public void score_3_teamb(View view){
        score_b += 3;
        displayTeamB(score_b);
    }
    public void score_2_teamb(View view){
        score_b += 2;
        displayTeamB(score_b);
    }
    public void score_freethrow_teamb(View view){
        score_b += 1;
        displayTeamB(score_b);
    }
    public void displayTeamB(int number){
        TextView b = (TextView) findViewById(R.id.score_b);
        b.setText(String.valueOf(number));
    }
    public void score_reset(View view){
        score_b = 0;
        score_a = 0;
        displayTeamA(score_a);
        displayTeamB(score_b);
    }
}
