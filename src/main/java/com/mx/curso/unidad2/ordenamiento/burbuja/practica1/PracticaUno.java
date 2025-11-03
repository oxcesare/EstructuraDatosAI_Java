package com.mx.curso.unidad2.ordenamiento.burbuja.practica1;

public class PracticaUno {

    public static void main(String[] args) {

        int[] datos = {90, 3, 1, 2, 6, 7, 9, 1};

        System.out.println("Arreglo original:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }

        Burbuja.bubbleSort(datos);

        System.out.println("\nArreglo ordenado:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }
    }
}
