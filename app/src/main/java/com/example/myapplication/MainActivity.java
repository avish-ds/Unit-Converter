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