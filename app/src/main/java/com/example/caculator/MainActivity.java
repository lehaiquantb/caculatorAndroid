package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewNumber;
    TextView textViewShow;
    Button btnZero;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnCE;
    Button btnC;
    Button btnBS;
    Button btnDiv;
    Button btnMul;
    Button btnMinus;
    Button btnEqual;
    Button btnDot;
    Button btnPlus;
    Button btnPlusMinus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewNumber = findViewById(R.id.textViewNumber);
        textViewShow = findViewById(R.id.textViewShow);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "DS-DIGI.TTF");
        textViewNumber.setTypeface(typeface);
        textViewShow.setTypeface(typeface);

        btnBS = findViewById(R.id.btnBS);
        btnC = findViewById(R.id.btnC);
        btnCE = findViewById(R.id.btnCE);
        btnDiv = findViewById(R.id.btnDiv);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);
        btnMinus = findViewById(R.id.btnMinus);
        btnMul = findViewById(R.id.btnMul);
        btnPlus = findViewById(R.id.btnPlus);
        btnPlusMinus = findViewById(R.id.btnPlusMinus);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btnBS.getId()) {

        } else if (v.getId() == btnC.getId()) {

        } else if (v.getId() == btnCE.getId()) {

        } else if (v.getId() == btnDiv.getId()) {

        } else if (v.getId() == btnDot.getId()) {

        } else if (v.getId() == btnEqual.getId()) {

        } else if (v.getId() == btnMinus.getId()) {

        } else if (v.getId() == btnMul.getId()) {

        } else if (v.getId() == btnPlus.getId()) {

        } else if (v.getId() == btnPlusMinus.getId()) {

        } else if (v.getId() == btnZero.getId()) {

        } else if (v.getId() == btnOne.getId()) {

        } else if (v.getId() == btnTwo.getId()) {

        } else if (v.getId() == btnThree.getId()) {

        } else if (v.getId() == btnFour.getId()) {

        } else if (v.getId() == btnFive.getId()) {

        } else if (v.getId() == btnSix.getId()) {

        } else if (v.getId() == btnSeven.getId()) {

        } else if (v.getId() == btnEight.getId()) {

        } else if (v.getId() == btnNine.getId()) {

        }

    }
}
