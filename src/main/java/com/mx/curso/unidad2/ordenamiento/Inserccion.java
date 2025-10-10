package com.mx.curso.unidad2.ordenamiento;

import java.util.Arrays;

public class Inserccion {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Mover los elementos de arr[0...i-1], que son mayores que key,
            // una posición a la derecha
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] datos = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(datos));

        insertionSort(datos);

        System.out.println("\nArreglo ordenado:");
        System.out.println(Arrays.toString(datos));
    }
}

