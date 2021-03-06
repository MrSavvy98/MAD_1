package com.example.using_strings1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Lifecycle", "OnCreate() invoked");

        TextView txtVMsg2 = findViewById(R.id.TvMsg2);
        txtVMsg2.setText("Here, I am the text message 2");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle", "OnStart() invoked");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Lifecycle", "OnResume() invoked");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Lifecycle", "OnPause() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Lifecycle", "OnStop() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Lifecycle", "OnDestroy() invoked");
    }
}