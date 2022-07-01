package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1,b2,b3;

    ConstraintLayout mCLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        mCLayout = findViewById(R.id.constraint);

        b1=findViewById(R.id.b1);
        b1.setOnClickListener(this);

        b2=findViewById(R.id.b2);
        b2.setOnClickListener(this);

        b3=findViewById(R.id.b3);
        b3.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        if(v.equals(b1)){
            Intent intent = new Intent(this, MainActivityCelcius.class);
            startActivity(intent);
        }
        else if(v.equals(b2)){
            Intent intent = new Intent(this, MainActivityFeet.class);
            startActivity(intent);
        }
        else if(v.equals(b3)){
            Intent intent = new Intent(this, MainActivityKG.class);
            startActivity(intent);
        }

    }

    }




