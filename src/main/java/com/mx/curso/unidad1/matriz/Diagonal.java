package com.mx.curso.unidad1.matriz;

import java.util.List;

public class Diagonal {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int sumaD1 = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j <= i; j++) {
                //System.out.println(arr.get(i).get(j));
                sumaD1 += arr.get(i).get(j);
            }
            System.out.println("");
        }
        int sumaD2 = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            int j = arr.size() - 1 - i;
            System.out.println(arr.get(i).get(j));
            sumaD2 += arr.get(i).get(j);
        }
        return Math.abs(sumaD1 - sumaD2);

    }

    public static void main(String[] args) {

        System.out.println(diagonalDifference(List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(9, 8, 9)
        )));
    }
}
