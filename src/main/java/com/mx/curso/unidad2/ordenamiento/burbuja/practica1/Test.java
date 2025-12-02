package com.mx.curso.unidad2.ordenamiento.burbuja.practica1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> arr = List.of(6, 4, 1);
        countSwaps(arr);


    }

    public static void countSwaps(List<Integer> a) {
        // Write your code here
        List<Integer> elementos = new ArrayList<>();
        int swaps = 0;

        //Convertir la lista a un arreglo para facilitar el manejo
        int[] arr = a.stream().mapToInt(Integer::intValue).toArray();

        int n = arr.length;
        // Bucle externo para las pasadas completas
        for (int i = 0; i < n - 1; i++) {
            // Bucle interno para comparar y mover los elementos más grandes al final
            for (int j = 0; j < n - i - 1; j++) {
                // Si el elemento actual es mayor que el siguiente, se intercambian
                if (arr[j] > arr[j + 1]) {
                    // Intercambio de elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }

        int first = arr[0];
        int last = arr[arr.length - 1];

        elementos.add(swaps);
        elementos.add(first);
        elementos.add(last);

        System.out.println("Array is sorted in" + "" + elementos.get(0) + " swaps");
        System.out.println("First Element: " + elementos.get(1));
        System.out.println("Last Element: " + elementos.get(2));

    }
}
