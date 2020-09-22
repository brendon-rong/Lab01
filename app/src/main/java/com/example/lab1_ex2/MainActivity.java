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
    }

    //
    public void onStart()
    {
        super.onStart();
        Log.d(tag, "In the onStart() event");
        fragment.display("onStart() executed");
    }
    //
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
        fragment.display("onRestart() executed");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "In the onResume() event");
        fragment.display("onResume() executed");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag, "In the onPause() event");
        fragment.display("onPause() executed");
    }
    //
    public void onStop()
    {
        super.onStop();
        Log.d(tag, "In the onStop() event");
        fragment.display("onStop() executed");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
        fragment.display("onDestroy() executed");
    }
}