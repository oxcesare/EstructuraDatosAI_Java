package com.mx.curso.unidad1.matriz;

public class Temperaturas {

    public static void main(String[] args) {

        //Definir una matriz de 3x3
        Double[][] temperaturas = {
                {121.00, 99.00, 11.87},
                {111.00, 10.00, 12.87},
                {151.00, 29.00, 13.87},
                {131.00, 30.00, 14.87}
        };

        //Imprimir la matriz
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.print(temperaturas[i][j] + " ");
            }
            System.out.println("");
        }

        //Acceder a un elemento especifico
        System.out.println("Elemento en la posicion [2][1]: " + temperaturas[2][1]);
        temperaturas[2][1] = 45.90;
        System.out.println("Elemento en la posicion [2][1]: " + temperaturas[2][1]);


    }
}
