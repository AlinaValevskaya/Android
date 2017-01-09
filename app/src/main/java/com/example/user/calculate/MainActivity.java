package com.example.user.calculate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.user.calculate.MainActivity.MathOperation.DIVIDE;
import static com.example.user.calculate.MainActivity.MathOperation.MINUS;
import static com.example.user.calculate.MainActivity.MathOperation.MULTIPLY;
import static com.example.user.calculate.MainActivity.MathOperation.PLUS;


public class MainActivity extends AppCompatActivity  {
    EditText resultText;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button btnPoint;
    Button btn_C;
    Button btnPlus;
    Button btnMinus;
    Button btnDivide;
    Button btnMultiply;
    Button btnEqual;



    enum MathOperation{PLUS,MINUS,DIVIDE,MULTIPLY}
    MathOperation mathOperation;
    Float valueOne;
    Float valueSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = (EditText) findViewById(R.id.resultText);
        btnOne = (Button)  findViewById(R.id.NumOne);
        btnTwo = (Button)  findViewById(R.id.NumTwo);
        btnThree = (Button) findViewById(R.id.NumThree);
        btnFour = (Button) findViewById(R.id.NumFour);
        btnFive = (Button) findViewById(R.id.NumFive);
        btnSix = (Button) findViewById(R.id.NumSix);
        btnSeven = (Button) findViewById(R.id.NumSeven);
        btnEight = (Button) findViewById(R.id.NumEight);
        btnNine = (Button) findViewById(R.id.NumNine);
        btnZero = (Button) findViewById(R.id.NumZero);
        btn_C = (Button) findViewById(R.id.C);
        btnPoint = (Button) findViewById(R.id.Point);
        btnPlus = (Button) findViewById(R.id.Plus);
        btnMinus = (Button) findViewById(R.id.Minus);
        btnDivide = (Button) findViewById(R.id.div);
        btnMultiply = (Button) findViewById(R.id.Multi);
        btnEqual = (Button) findViewById(R.id.Equal);



        View.OnClickListener globalClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch(v.getId()){
                    case R.id.NumOne:
                        // Кнопка 1
                        resultText.setText(resultText.getText() + "1");
                        break;
                    case R.id.NumTwo:
                        // Кнопка 2
                        resultText.setText(resultText.getText() + "2");
                        break;
                    case R.id.NumThree:
                        // Кнопка 3
                        resultText.setText(resultText.getText() + "3");
                        break;
                    case R.id.NumFour:
                        // Кнопка 4
                        resultText.setText(resultText.getText() + "4");
                        break;
                    case R.id.NumFive:
                        // Кнопка 5
                        resultText.setText(resultText.getText() + "5");
                        break;
                    case R.id.NumSix:
                        // Кнопка 6
                        resultText.setText(resultText.getText() + "6");
                        break;
                    case R.id.NumSeven:
                        // Кнопка 7
                        resultText.setText(resultText.getText() + "7");
                        break;
                    case R.id.NumEight:
                        // Кнопка 8
                        resultText.setText(resultText.getText() + "8");
                        break;
                    case R.id.NumNine:
                        // Кнопка 9
                        resultText.setText(resultText.getText() + "9");
                        break;
                    case R.id.NumZero:
                        // Кнопка 0
                        resultText.setText(resultText.getText() + "0");
                        break;
                    case R.id.Point:
                        // Кнопка "." должна нажиматься только 1 раз
                        String s = resultText.getText().toString();
                        boolean isPoint = s.contains(".");
                        if(isPoint == false)
                        resultText.setText(resultText.getText() + ".");
                        else {
                            Toast toast = Toast.makeText(getApplicationContext(), "Точка уже была нажата", Toast.LENGTH_SHORT);
                            toast.show();}
                        break;
                    case R.id.C:
                        // Кнопка "C"
                        resultText.setText(null);
                        break;
                    case R.id.Plus:
                        // Кнопка "+"
                        valueOne = Float.parseFloat(resultText.getText().toString());
                        resultText.setText(null);
                        mathOperation = PLUS;
                        break;
                    case R.id.Minus:
                        // Кнопка "-"
                        valueOne = Float.parseFloat(resultText.getText().toString());
                        resultText.setText(null);
                        mathOperation = MINUS;
                        break;
                    case R.id.div:
                        // Кнопка "/"
                        valueOne = Float.parseFloat(resultText.getText().toString());
                        resultText.setText(null);
                        mathOperation = DIVIDE;
                        break;
                    case R.id.Multi:
                        // Кнопка "*"
                        valueOne = Float.parseFloat(resultText.getText().toString());
                        resultText.setText(null);
                        mathOperation = MULTIPLY;
                        break;
                    case R.id.Equal:
                        valueSecond = Float.parseFloat(resultText.getText().toString());
                        switch (mathOperation){
                            case PLUS:
                                resultText.setText(valueOne + valueSecond + "");
                                break;
                            case MINUS:
                                resultText.setText(valueOne - valueSecond + "");
                                break;
                            case DIVIDE:
                                if (valueSecond!= 0)
                                resultText.setText(valueOne / valueSecond + "");
                                else
                                    resultText.setText("Деление на ноль невозможно");
                                break;
                            case MULTIPLY:
                                resultText.setText(valueOne * valueSecond + "");
                                break;
                        }
                        mathOperation = null;

                        break;

                }

            }
        };
        btnOne.setOnClickListener(globalClickListener);
        btnTwo.setOnClickListener(globalClickListener);
        btnThree.setOnClickListener(globalClickListener);
        btnFour.setOnClickListener(globalClickListener);
        btnFive.setOnClickListener(globalClickListener);
        btnSix.setOnClickListener(globalClickListener);
        btnSeven.setOnClickListener(globalClickListener);
        btnEight.setOnClickListener(globalClickListener);
        btnNine.setOnClickListener(globalClickListener);
        btnZero.setOnClickListener(globalClickListener);
        btn_C.setOnClickListener(globalClickListener);
        btnPoint.setOnClickListener(globalClickListener);
        btnPlus.setOnClickListener(globalClickListener);
        btnMinus.setOnClickListener(globalClickListener);
        btnDivide.setOnClickListener(globalClickListener);
        btnMultiply.setOnClickListener(globalClickListener);
        btnEqual.setOnClickListener(globalClickListener);

    }
}
