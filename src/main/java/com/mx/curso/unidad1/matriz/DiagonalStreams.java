package com.mx.curso.unidad1.matriz;

import java.util.List;
import java.util.stream.IntStream;
import java.lang.Math;


public class DiagonalStreams {


    public static int diagonalDifference(List<List<Integer>> arr) {

        // N es el tamaño de la matriz (asumida cuadrada)
        final int n = arr.size();

        // 1. Suma de la Diagonal Principal (D1): Indices donde i == j
        // Relación: arr[i][i]
        int sumaD1 = IntStream.range(0, n)
                .map(i -> arr.get(i).get(i))
                .sum();

        // 2. Suma de la Diagonal Secundaria (D2): Indices donde j = n - 1 - i
        // Relación: arr[i][n - 1 - i]
        int sumaD2 = IntStream.range(0, n)
                .map(i -> arr.get(i).get(n - 1 - i))
                .sum();

        // 3. Diferencia Absoluta
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
