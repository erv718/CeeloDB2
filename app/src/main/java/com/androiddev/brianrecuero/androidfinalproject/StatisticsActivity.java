package com.androiddev.brianrecuero.androidfinalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class StatisticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DatabaseManager DBM = new DatabaseManager(this);
        RelativeLayout RL = new RelativeLayout(this);
        TextView ViewPlayerStat= new TextView(this);
        ViewPlayerStat.setTextSize(40f);
        Statistics CurrentStat;
        CurrentStat=DBM.searchForStat(0);
        if(CurrentStat==null)
        {
            ViewPlayerStat.setText("No Stats on file");
        }
        else
        {
            ViewPlayerStat.setText(CurrentStat.toString());//add statistics, by creating fake data
                                                            // or post game dummy data
        }
        RL.addView(ViewPlayerStat);
        setContentView(RL);

    }
}
