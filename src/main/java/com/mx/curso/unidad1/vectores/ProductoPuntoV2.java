package com.mx.curso.unidad1.vectores;

public class ProductoPuntoV2 {

    public static void main(String[] args) {


        //red neuronal de 3 datos
        double[] entrada = {1.0, 0.5, -1.5};

        //matriz de pesos
        double[][] pesos = {
                {0.2, 0.8, -0.5},
                {0.5, -0.91, 0.1}
        };


        double[] salida = new double[2];

        for (int j = 0; j < 2; j++) { //recorre las neuronas de salida
            for (int i = 0; i < 3; i++) { //recorre las neuronas de entrada
                salida[j] += entrada[i] * pesos[j][i];
            }
        }

        // Impresión de resultados
        System.out.print("Vector de entrada: ");
        for (double val : entrada) {
            System.out.print(val + " ");
        }


        System.out.print("Vector de salida: ");
        for (double val : salida) {
            System.out.print(val + " ");
        }


    }
}
