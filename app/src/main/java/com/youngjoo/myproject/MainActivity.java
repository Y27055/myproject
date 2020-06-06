package com.youngjoo.myproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private CalendarView mCalendarView;
    private Button btnM;
    private Button btnE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCalendarView = findViewById(R.id.calendarView);
        btnM = findViewById(R.id.measure);
        btnM = findViewById(R.id.exercise);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int day) {
                String date = year + "/" + month + "/" + day;
                Log.d(TAG,"onSelectedDayChange : date :" + date);
            }
        });

    }
}
