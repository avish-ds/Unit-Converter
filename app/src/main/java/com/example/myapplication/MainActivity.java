package com.example.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bconvert,bselect;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bback;
    ConstraintLayout mCLayout;
    String fromUnit = "Celcius";
    String toUnit = "Farenheit";
    EditText txtFrom, txtTo;
    final String[] values = new String[]{
            "Celcius",
            "Fahrenheit",
            "Kelvin",
            "Rankine",
            "Newton", "Delisle"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mCLayout = findViewById(R.id.constraint);
        bconvert = (Button) findViewById(R.id.bconvert);
        bselect = (Button) findViewById(R.id.bselect);
        txtFrom = (EditText) findViewById(R.id.tfrom);
        txtTo = (EditText) findViewById(R.id.tto);
        bconvert.setOnClickListener(this);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(this);
        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(this);
        b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){

        if(v.equals(bconvert)){
            String valueDegree=txtFrom.getText().toString();
            double farenheit=Double.parseDouble(valueDegree);
            farenheit=(farenheit*1.8)+32;
            txtTo.setText(String.valueOf(farenheit));
        }
    }

}