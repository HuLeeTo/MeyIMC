package com.nexseen.huleeto.meyimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables Globales
    EditText valorPeso, valorAltura;
    TextView valorResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociamos las variables a los elementos
        valorPeso = (EditText)findViewById(R.id.valorPeso);
        valorAltura = (EditText)findViewById(R.id.valorAltura);
        valorResultado = (TextView) findViewById(R.id.valorResultado);

        Button botCalcIMC = (Button)findViewById(R.id.botCalcula);

        botCalcIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Declaramos las variables locales
                double peso, altura, resIMC;

                //Transformamos los valores recibidos
                peso = Double.parseDouble(valorPeso.getText().toString());
                altura = Double.parseDouble(valorAltura.getText().toString());

                //Calculamos el IMC
                resIMC = peso/Math.pow(altura, 2);

                //Condicional para asignar mediante rango de IMC la clasificación
                if (resIMC<=16.00){
                    valorResultado.setText("Delgadez Severa");
                    int clasificacion = 1;
                }else if (resIMC>=16.00 && resIMC<17.00){
                    valorResultado.setText("Delgadez Moderada");
                    int clasificacion = 2;
                }else if (resIMC>=17.00 && resIMC<18.50){
                    valorResultado.setText("Delgadez Aceptable");
                    int clasificacion = 3;
                }else if (resIMC>=18.50 && resIMC<25.00){
                    valorResultado.setText("Peso Normal");
                    int clasificacion = 4;
                }else if (resIMC>=25.00 && resIMC<30.00){
                    valorResultado.setText("Sobrepeso");
                    int clasificacion = 5;
                }else if (resIMC>=30.00 && resIMC<35.00){
                    valorResultado.setText("Obeso Tipo I");
                    int clasificacion = 6;
                }else if (resIMC>=35.00 && resIMC<40.00){
                    valorResultado.setText("Obeso Tipo II");
                    int clasificacion = 7;
                }else if (resIMC>=40.00){
                    valorResultado.setText("Obeso Tipo III");
                    int clasificacion = 8;
                }else{
                    valorResultado.setText("Error de la Aplicación");
                }

                //Llamada a la ventana de rangos con imagen

            }
        });


    }
}
