package com.example.gnt.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindWorkout(View v){
        TextView workout = (TextView)findViewById(R.id.txtWorkout);
        Spinner workoutType = (Spinner)findViewById(R.id.spinWoroutType);

        String workouts = String.valueOf(workoutType.getSelectedItem());
        workout.setText(workouts);
    }
}
