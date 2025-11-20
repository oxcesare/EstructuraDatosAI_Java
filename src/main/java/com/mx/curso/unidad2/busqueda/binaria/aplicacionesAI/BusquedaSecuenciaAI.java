package com.mx.curso.unidad2.busqueda.binaria.aplicacionesAI;

import com.mx.curso.unidad2.busqueda.binaria.BusquedaSecuencial;

import static com.mx.curso.unidad2.busqueda.binaria.BusquedaSecuencial.busquedaSecuencial;

public class BusquedaSecuenciaAI {

    public static void main(String[] args) {

        int[] datos = {
                1, 2, 3, 4, 5, 6, 6, 7, 1, 2,
                4, 7, 1, 2, 4, 7, 9, 12, 15,
                18, 1, 2, 4, 7, 9, 12, 15, 18, 1,
                1, 2, 4, 7, 9, 12, 15, 18, 1, 2,
                4, 7, 9, 12, 15, 18, 1, 1, 2, 4, 7,
                9, 999, 15, 18, 1, 2, 4, 7, 9, 12, 15, 1,
                18, 1, 2, 4, 7, 9, 12, 15, 7, 1, 5, 5, 8, 77, 1, 12, 3, 4, 5, 7,
                1, 2, 4, 7, 9, 12, 15, 18, 1, 2, 4, 7, 9, 12, 15, 18, 8,
                1, 2, 4, 7, 9, 12, 15, 18, 71, 100, 1029, 123, 1981, 197, 199};

        int elementoABuscar=999;

        long startTime = System.nanoTime();

        int indice = BusquedaSecuencial.busquedaSecuencial(datos, elementoABuscar);

        if (indice != -1) {
            System.out.println("El elemento " + elementoABuscar + " se encuentra en el indice: " + indice);
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en el arreglo.");
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime; // Duración en nanosegundos
        System.out.println("Tiempo de ejecucion: " + duration + " nanosegundos");




    }
}
