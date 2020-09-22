package com.mycompany.passdataactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    Button button;
    ArrayList<String> numbers = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.add("ONE");
                numbers.add("TWO");
                numbers.add("THREE");
                numbers.add("FOUR");
                numbers.add("FIVE");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key", numbers);
                startActivity(intent);
            }
        });
    }
}