package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pantalla;
    double num1;
    double num2;
    double result;
    String operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button eliminar = findViewById(R.id.btnlimpiar);
        Button resultado = findViewById(R.id.btnreslt);
        Button sumar = findViewById(R.id.btnsuma);
        Button resta = findViewById(R.id.btnresta);
        Button multiplicacion = findViewById(R.id.btnmult);
        Button dividir = findViewById(R.id.btndiv);
        Button punto = findViewById(R.id.btnpunto);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantalla=(TextView) findViewById(R.id.tv_num2);
                pantalla.setText(pantalla.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantalla=(TextView) findViewById(R.id.tv_num2);
                pantalla.setText(pantalla.getText()+"1");
            }
        });
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=0;
                num2=0;
                result=0;
                pantalla = (TextView) findViewById(R.id.tv_num2);
                pantalla.setText("");
            }
        });


    }



}