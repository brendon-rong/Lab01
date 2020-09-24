package com.example.lab1_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class vrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr);
        display(getString(R.string.onCreate));
    }

    public void onStart()
    {
        super.onStart();
        display(getString(R.string.onStart));
    }
    public void onRestart()
    {
        super.onRestart();
        display(getString(R.string.onRestart));

    }
    public void onResume()
    {
        super.onResume();
        display(getString(R.string.onResume));
    }
    public void onPause()
    {
        super.onPause();
        display(getString(R.string.onPause));
    }
    //
    public void onStop()
    {
        super.onStop();
        display(getString(R.string.onStop));
    }
    public void onDestroy()
    {
        super.onDestroy();
        display(getString(R.string.onDestroy));
    }

    public void display(String msg){
        TextView tv = findViewById(R.id.textViewVR);
        if(msg.equalsIgnoreCase(getString(R.string.onPause)) || msg.equalsIgnoreCase(getString(R.string.onRestart))){
            tv.setText("VR Activity:");
        }
        tv.setText(tv.getText().toString() + "\n" + msg);
    }

}