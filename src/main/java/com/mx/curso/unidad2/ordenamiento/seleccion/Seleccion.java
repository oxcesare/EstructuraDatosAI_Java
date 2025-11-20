package com.mx.curso.unidad2.ordenamiento.seleccion;

import java.util.Arrays;

public class Seleccion {

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        // Un bucle para mover el límite de la sublista ordenada
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del elemento más pequeño en la parte no ordenada
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Intercambiar el elemento más pequeño con el primer elemento de la sublista no ordenada
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] datos = {8,2,4,1,3};

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(datos));

        selectionSort(datos);

        System.out.println("\nArreglo ordenado:");
        System.out.println(Arrays.toString(datos));
    }
}

