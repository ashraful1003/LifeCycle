package com.examples.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    /// fires when the system creates an activity for the first time
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        textView.setText("Called onCreate");
        /// making toast to show the result as pop-up
        Toast.makeText(this, "Called onCreate", Toast.LENGTH_SHORT).show();
    }

    /// invoke when an activity entered into Started State by completing onCreate() method
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Called onStart", Toast.LENGTH_SHORT).show();
    }

    /// when in resume state
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Called onResume", Toast.LENGTH_SHORT).show();
    }

    /// when activity is being paused
    @Override
    protected void onPause() {
        super.onPause();Toast.makeText(this, "Called onPause", Toast.LENGTH_SHORT).show();
    }

    /// activity no longer visible to user
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Called onStop", Toast.LENGTH_SHORT).show();
    }

    /// restarting an activity after stop
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Called onRestart", Toast.LENGTH_SHORT).show();
    }

    /// final callback and destroy the activity
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Called onDestroy", Toast.LENGTH_SHORT).show();
    }
}