package com.mx.curso.unidad1.arreglos;

import java.util.Arrays;

public class Arreglo2D {

    public static void main(String[] args) {
        int[][] arr ={
                {1 ,1 ,1 ,0 ,0, 0},
                {0 ,1 ,0 ,0 ,0, 0},
                {1 ,1 ,1 ,0 ,0, 0},
                {0 ,0 ,0 ,1 ,1, 1},
                {0 ,0 ,0 ,0 ,2, 0},
                {0 ,0 ,0 ,3 ,4, 5}
        };

        for(int i=0; i< arr.length;i++){
            for(int j=0; j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum[] = new int[16];
        int h = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum[h] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2];
                h++;
            }
        }
        Arrays.sort(sum);
        System.out.println(sum[15]);
    }
}
