package com.mx.curso.unidad2.ordenamiento.mezcla.implementaciones;

import java.util.Arrays;

public class Ejemplo02 {

    public static void main(String[] args) {
        int[] numeros = {4, 8, 1, 9};

        System.out.println("Antes de ordenar: " + Arrays.toString(numeros));

        // Ordena usando Arrays.sort() (usa Dual-Pivot QuickSort para primitivos)
        Arrays.sort(numeros);

        System.out.println("Después de ordenar: " + Arrays.toString(numeros));
    }

}
