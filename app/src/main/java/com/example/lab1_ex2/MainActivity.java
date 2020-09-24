package com.example.lab1_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BottomFragment fragment;
    public String tag = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.fragment3);
        fragment.display(getString(R.string.onCreate));
    }

    //
    public void onStart()
    {
        super.onStart();
        Log.d(tag, "In the onStart() event");
        fragment.display(getString(R.string.onStart));
    }
    //
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
        fragment.display(getString(R.string.onRestart));

    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "In the onResume() event");
        fragment.display(getString(R.string.onResume));
    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag, "In the onPause() event");
        fragment.display(getString(R.string.onPause));
    }
    //
    public void onStop()
    {
        super.onStop();
        Log.d(tag, "In the onStop() event");
        fragment.display(getString(R.string.onStop));
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
        fragment.display(getString(R.string.onDestroy));
    }
}