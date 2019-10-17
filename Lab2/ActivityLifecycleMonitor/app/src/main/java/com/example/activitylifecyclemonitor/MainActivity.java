package com.example.activitylifecyclemonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "States";
    Button btnActTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnActTwo = (Button) findViewById(R.id.btnActTwo);

        btnActTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (getApplicationContext(),ActivityTwo.class);
                startActivity(intent);
            }
        });
        Log.d(TAG,"MainActivity:onCreate()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"MainActivity:onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"MainActivity:onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"MainActivity:onDestroy()");
    }
}