package com.mx.curso.unidad1.matriz;

import java.util.List;

public class Diagonal2 {

    public static int diagonalDifference(List<List<Integer>> arr) {

        // Write your code here
        int dif = 0;
        int a = arr.get(0).size() - 1;
        int b = 0;
        int auxSumA = 0;
        int auxSumB = 0;

        for (int i = 0; i < arr.get(0).size(); i++, b++, a--) {
            if (i >= arr.get(i).size()) {
                break;
            }
            for (int j = 0; j < 1; j++) {
                auxSumA += arr.get(i).get(a);
                auxSumB += arr.get(i).get(b);
            }
        }

        dif = auxSumB - auxSumA;

        return Math.abs(dif);
    }
    public static void main(String[] args) {

        System.out.println(diagonalDifference(List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(9, 8, 9)
        )));


    }


}
