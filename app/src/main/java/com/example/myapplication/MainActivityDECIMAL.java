package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivityDECIMAL extends AppCompatActivity implements View.OnClickListener {

    Button bconvert,bselect;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bback,bdot;
    ConstraintLayout mCLayout;
    String fromUnit = "Celcius";
    String toUnit = "Farenheit";
    EditText txtFrom, txtTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_decimal);


        mCLayout = findViewById(R.id.constraint);
        bconvert = (Button) findViewById(R.id.bconvert);
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
        b0 = (Button) findViewById(R.id.b0);
        b0.setOnClickListener(this);
        bback=findViewById(R.id.bback);
        bback.setOnClickListener(this);
        bdot=findViewById(R.id.b_dot);
        bdot.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){

        if(v.equals(b1)) txtFrom.append("1");
        else if(v.equals(b2)) txtFrom.append("2");
        else if(v.equals(b3))txtFrom.append("3");
        else if(v.equals(b4))txtFrom.append("4");
        else if(v.equals(b5))txtFrom.append("5");
        else if(v.equals(b6)) txtFrom.append("6");
        else if(v.equals(b7))txtFrom.append("7");
        else if(v.equals(b8))txtFrom.append("8");
        else if(v.equals(b9))txtFrom.append("9");
        else if(v.equals(b0))txtFrom.append("0");
        else if(v.equals(bdot)) txtFrom.append("d");

        else if(v.equals(bback))
        {
            String data=txtFrom.getText().toString();
            if(data.length()>0)
                txtFrom.setText(data.substring(0,data.length()-1));
            else
                txtFrom.setText("");

        }


        if(v.equals(bconvert)){
            try {
                String valueCGPA = txtFrom.getText().toString();
                int percent = Integer.parseInt(valueCGPA);

                txtTo.setText(Integer.toBinaryString(percent));
            }
            catch (NullPointerException e) {
            }
        }
    }
}

