package com.example.activitylifecyclemonitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    private static final String TAG = "States";
    Button btnactthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Button btnactthree = (Button) findViewById(R.id.btnactthree);

        btnactthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (getApplicationContext(),ActivityThree.class);
                startActivity(intent);
            }
        });
        Log.d(TAG, "ActivityTwo:onCreate()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"ActivityTwo:onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"ActivityTwo:onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"ActivityTwo:onDestroy()");
    }
}
