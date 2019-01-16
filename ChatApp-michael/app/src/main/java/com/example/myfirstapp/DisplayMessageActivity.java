package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    private static final String TAG = "DisplayMessageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        Log.e(TAG, "onCreate called!");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.w(TAG, "onStart called!");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume called!");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause called!");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.v(TAG, "onStop called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v(TAG, "onDestroy called!");
    }
}
