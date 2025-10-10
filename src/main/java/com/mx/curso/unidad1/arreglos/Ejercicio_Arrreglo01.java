package com.mx.curso.unidad1.arreglos;

import java.util.Arrays;

public class Ejercicio_Arrreglo01 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[1]);

        arr[3] = 7;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
