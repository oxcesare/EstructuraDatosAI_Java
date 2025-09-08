package com.mx.curso.unidad1;

public class Bidimensional {

    public static void main(String[] args) {

        //arreglo bidimensional
        int[][] edades = new int[3][2];

        edades[0][0] = 10;
        edades[0][1] = 20;
        edades[1][0] = 30;
        edades[1][1] = 40;
        edades[2][0] = 50;
        edades[2][1] = 60;
        System.out.println("edades[0][0] = " + edades[2][0]);

        System.out.println("Longitud del arreglo: "+edades.length);

        //intercambiar filas por columnas
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.print(edades[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
