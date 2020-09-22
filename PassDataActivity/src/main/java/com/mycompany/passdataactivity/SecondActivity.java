package com.mycompany.passdataactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView);
        ArrayList<String> numbersList = (ArrayList<String>) getIntent().getSerializableExtra("key");
        textView.setText(String.valueOf(numbersList));
    }
}