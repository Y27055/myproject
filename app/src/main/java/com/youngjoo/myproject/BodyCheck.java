package com.youngjoo.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BodyCheck extends AppCompatActivity {
        private static final String TAG = "BodyCheck";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_bodycheck);

                Intent incomingIntent = getIntent();

        }
}
