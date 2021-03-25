package com.vallabhjoshi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.vallabhjoshi.calculator.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    Button bu0,bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8,bu9,buAC,buPlusMinus,buDiv,buMul,buModulo,buPlus,buMinus,buDot,buEqual;
    TextView txt;

    int firstNumber, secondNumber;
    String ActionType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        txt = (TextView) findViewById(R.id.editText);
        setContentView(activity_main);

        bu0 = findViewById(R.id.bu0);
        bu1 = findViewById(R.id.bu1);
        bu2 = findViewById(R.id.bu2);
        bu3 = findViewById(R.id.bu3);
        bu4 = findViewById(R.id.bu4);
        bu5 = findViewById(R.id.bu5);
        bu6 = findViewById(R.id.bu6);
        bu7 = findViewById(R.id.bu7);
        bu8 = findViewById(R.id.bu8);
        bu9 = findViewById(R.id.bu9);
        buAC = findViewById(R.id.buAC);
        buPlusMinus = findViewById(R.id.buPlusMinus);
        buDiv = findViewById(R.id.buDiv);
        buMul = findViewById(R.id.buMul);
        buModulo = findViewById(R.id.buModulo);
        buPlus = findViewById(R.id.buPlus);
        buMinus = findViewById(R.id.buMinus);
        buDot = findViewById(R.id.buDot);
        buEqual = findViewById(R.id.buEqual);
        txt = findViewById(R.id.editText);

        bu0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              txt.setText(txt.getText().toString() + "0");
            }
        });

        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "1");
            }
        });

        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "2");
            }
        });

        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "3");
            }
        });

        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "4");
            }
        });

        bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "5");
            }
        });

        bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "6");
            }
        });

        bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "7");
            }
        });

        bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "8");
            }
        });

        bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "9");
            }
        });

        buAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(" ");
            }
        });

        buPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = txt.getText().toString();
                if(number.contains("/")) {
                    String[] splitNumber = number.split("/");
                    System.out.println();
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txt.setText(String.valueOf(divide(firstNumber, secondNumber)));
                }
                else if(number.contains("x")) {
                    String[] splitNumber = number.split("x");
                    System.out.println();
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txt.setText(String.valueOf(mutiply(firstNumber, secondNumber)));
                }
                else if(number.contains("+")) {
                    String[] splitNumber = number.split("\\+");
                    System.out.println();
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txt.setText(String.valueOf(add(firstNumber, secondNumber)));
                }
                else if(number.contains("-")) {
                    String[] splitNumber = number.split("-");
                    System.out.println();
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txt.setText(String.valueOf(substract(firstNumber, secondNumber)));
                }
                else if(number.contains("%")) {
                    String[] splitNumber = number.split("%");
                    System.out.println();
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txt.setText(String.valueOf(modulo(firstNumber, secondNumber)));
                }

            }
        });

        buDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + ".");
            }
        });

        buMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "-");
            }
        });

        buPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "+");
            }
        });

        buMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "x");
            }
        });

        buDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "/");
            }
        });

        buModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "%");
            }
        });
    }
    double add(double a ,double b){
            return a + b;
        }
    double substract(double a ,double b){
            return a - b;
        }
    double divide(double a ,double b){
            return a / b;
        }
    double mutiply(double a ,double b){
            return a * b;
        }
    double modulo(double a, double b){
            return a % b;
        }
}