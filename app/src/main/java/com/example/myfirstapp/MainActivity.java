package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 *  Main Activity that sends the user input to the DisplayMessageActivty to display.
 *
 *  MORE STUFF
 */

//Michael 
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    // Fires when the system first creates the activity
    // onCreate should handle startup logic that should happen only once during the whole life cycle
    // of the activity.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "onCreate called!");
    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    // Fires right after onCreate finishes
    // Makes the activity visible to the user, as the app prepares for the activity to enter the
    // foreground and become interactive
    @Override
    protected void onStart() {
        super.onStart();

        Log.w(TAG, "onStart called!");
    }

    // Fires when focus is given to the activity, right after onStart or when coming back from
    // another app multitasking
    // The app resides in this state until focus is taken away e.g receiving a phone call, the
    // user navigating to another activity, or the device's screen turning off.
    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume called!");
    }

    // Called when an interrupting event happens e.g receiving a phone call, the user navigating to
    // another activity, or the device's screen turning off.
    // Also when in multi window mode and one is not focused and when a dialogue or something shows
    // up where the app is still visible
    // Called when it is no longer in foreground
    // The first indication that a user is leaving your activity but does not mean the activity is
    // being destroyed
    //
    // The app is expected to be resumed shortly, so handle anything associated with that here
    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause called!");
    }


    // When the activity is no longer visible to the user, for example when a new activity covers
    // the screen or when the activity has finished running and is about to be terminated
    // Can be used for cpu intensive shutdown operations
    // Adjust or release anything not needed when the activity is not visible to the user
    @Override
    protected void onStop() {
        super.onStop();

        Log.v(TAG, "onStop called!");
    }

    // Called when an activity is finishing, or when the system is temporarily destroying the
    // activity due to a configuration change (such as a orientation switch or entering multi window
    // mode).
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v(TAG, "onDestroy called!");
    }

}
