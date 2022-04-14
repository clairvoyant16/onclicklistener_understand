package com.example.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView first, second, third, fourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        first= findViewById(R.id.text_first);
        second= findViewById(R.id.text_second);
        third= findViewById(R.id.text_third);
        fourth= findViewById(R.id.text_fourth);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is first", Toast.LENGTH_SHORT).show();
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is second", Toast.LENGTH_SHORT).show();
            }
        });

        third.setOnClickListener(this);
        fourth.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.text_third:
                Toast.makeText(this, "This is third", Toast.LENGTH_SHORT).show();
                break;

            case R.id.text_fourth:
                Toast.makeText(this, "This is fourth", Toast.LENGTH_SHORT).show();
                break;

        }

    }


    public void sixthFunc(View view) {
        Toast.makeText(this, "This is sixth", Toast.LENGTH_SHORT).show();
    }

    public void fifthFunc(View view) {
        Toast.makeText(this, "This is fifth", Toast.LENGTH_SHORT).show();
    }
}