package com.mx.curso.unidad1;

public class Matriz01 {

    public static void main(String[] args) {


        //matriz de 3 x 3
        int[][] matriz = new int[3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        System.out.println(matriz[0][1]);

        System.out.println("Modifcar el valor");
        matriz[2][1] = 100;

        System.out.println(matriz[2][1]);


    }
}
