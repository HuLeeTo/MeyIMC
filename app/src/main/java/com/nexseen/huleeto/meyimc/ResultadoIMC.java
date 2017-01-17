package com.nexseen.huleeto.meyimc;


import android.os.Bundle;

public class ResultadoIMC extends MainActivity{

    //Importamos la variable clasificacion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ejecutamos el switch para determinar la clasificación con imagen incluida
        /*switch (clasificacion){

            case 1:
                valorResultado.setText("Delgadez Severa");
                imagenResultado.setImage(R.drawable.id.DS);
                break;

            case 2:
                valorResultado.setText("Delgadez Moderada");
                imagenResultado.setImage(R.drawable.id.DM);
                break;

            case 3:
                valorResultado.setText("Delgadez Aceptable");
                imagenResultado.setImage(R.drawable.id.DA);
                break;

            case 4:
                valorResultado.setText("Peso Normal");
                imagenResultado.setImage(R.drawable.id.PN);
                break;

            case 5:
                valorResultado.setText("Sobrepeso");
                imagenResultado.setImage(R.drawable.id.SP);
                break;

            case 6:
                valorResultado.setText("Obeso Tipo I");
                imagenResultado.setImage(R.drawable.id.OU);
                break;

            case 7:
                valorResultado.setText("Obeso Tipo II");
                imagenResultado.setImage(R.drawable.id.OD);
                break;

            case 8:
                valorResultado.setText("Obeso Tipo III");
                imagenResultado.setImage(R.drawable.id.OT);
                break;

            default:
                valorResultado.setText("No asignado");
                break;

        }*/

    }

}
