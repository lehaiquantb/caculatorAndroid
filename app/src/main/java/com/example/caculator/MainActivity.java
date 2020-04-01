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

    int numA;
    int numB;
    char operator;
    String textNumber = "";
    String textShow = "";

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

        btnBS.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnCE.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnPlusMinus.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btnBS.getId()) {
            if (textNumber.length() != 0) {
                textNumber = textNumber.substring(0,textNumber.length()-1);
                textViewNumber.setText(textNumber);
            }
        } else if (v.getId() == btnC.getId()) {
                textShow = "";
                textNumber = "";
                textViewNumber.setText(textNumber);
                textViewShow.setText(textShow);
        } else if (v.getId() == btnCE.getId()) {
                textNumber = "";
                textViewNumber.setText(textNumber);
        } else if (v.getId() == btnDiv.getId()) {
            if (textNumber.length() != 0) {
                operator = '/';
                numA = Integer.parseInt(textNumber);
                textShow = "";
                textShow += textNumber + " / ";
                textViewShow.setText(textShow);
                textNumber = "";
            }

        } else if (v.getId() == btnDot.getId()) {

        } else if (v.getId() == btnEqual.getId()) {
            numB = Integer.parseInt(textViewNumber.getText().toString());
            textShow += textViewNumber.getText() + " =";
            textViewShow.setText(textShow);
            textNumber = Integer.toString(calculate(numA, operator, numB));
            textViewNumber.setText(textNumber);
        } else if (v.getId() == btnMinus.getId()) {
            if (textNumber.length() != 0) {
                operator = '-';
                numA = Integer.parseInt(textNumber);
                textShow = "";
                textShow += textNumber + " - ";
                textViewShow.setText(textShow);
                textNumber = "";
            }
        } else if (v.getId() == btnMul.getId()) {
            if (textNumber.length() != 0) {
                operator = 'x';
                numA = Integer.parseInt(textNumber);
                textShow = "";
                textShow += textNumber + " x ";
                textViewShow.setText(textShow);
                textNumber = "";
            }

        } else if (v.getId() == btnPlus.getId()) {
            if (textNumber.length() != 0) {
                operator = '+';
                numA = Integer.parseInt(textNumber);
                textShow = "";
                textShow += textNumber + " + ";
                textViewShow.setText(textShow);
                textNumber = "";
            }
        } else if (v.getId() == btnPlusMinus.getId()) {

        } else if (v.getId() == btnZero.getId()) {
            if (textNumber.length() != 0) {
                textNumber = textNumber + "0";
                textViewNumber.setText(textNumber);
            }
        } else if (v.getId() == btnOne.getId()) {
            textNumber = textNumber + "1";
            textViewNumber.setText(textNumber);
        } else if (v.getId() == btnTwo.getId()) {
            textNumber = textNumber + "2";
            textViewNumber.setText(textNumber);
        } else if (v.getId() == btnThree.getId()) {
            textNumber = textNumber + "3";
            textViewNumber.setText(textNumber);
        } else if (v.getId() == btnFour.getId()) {
            textNumber = textNumber + "4";
            textViewNumber.setText(textNumber);
        } else if (v.getId() == btnFive.getId()) {
            textNumber = textNumber + "5";
            textViewNumber.setText(textNumber);
        } else if (v.getId() == btnSix.getId()) {
            textNumber = textNumber + "6";
            textViewNumber.setText(textNumber);
        } else if (v.getId() == btnSeven.getId()) {
            textNumber = textNumber + "7";
            textViewNumber.setText(textNumber);
        } else if (v.getId() == btnEight.getId()) {
            textNumber = textNumber + "8";
            textViewNumber.setText(textNumber);
        } else if (v.getId() == btnNine.getId()) {
            textNumber = textNumber + "9";
            textViewNumber.setText(textNumber);
        }

    }

    public int calculate(int numA, char operator, int numB) {
        if (operator == 'x')
            return numA * numB;
        else if (operator == '/') {
            if (numB != 0)
                return numA / numB;
            else return 0;
        } else if (operator == '-') {
            return numA - numB;
        } else if (operator == '+') {
            return numA + numB;
        } else return 0;
    }
}
