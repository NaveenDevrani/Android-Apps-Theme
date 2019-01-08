package com.example.admin.themedemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView1;
    Button button1, button2, button3;
    MainActivity activity = MainActivity.this;
    Utils utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         activity.setTheme(R.style.AppTheme);
         Utils.onActivityCreateTheme(activity);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button1.setOnClickListener(this);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);


      //  utils.onActivityCreateSetTheme(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Utils.changeToTheme(this, Utils.THEME_DEFAULT);
                break;

            case R.id.button2:
               Utils.changeToTheme(this, Utils.THEME_DEFAULT1);
               break;

                 case R.id.button3:
                Utils.changeToTheme(this, Utils.THEME_DEFAULT2);
                break;

        }
    }}
