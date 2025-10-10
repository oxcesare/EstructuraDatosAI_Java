package com.mx.curso.unidad2.ordenamiento.aplicacionesAI;

import com.mx.curso.unidad2.ordenamiento.Burbuja;

public class AplicacionAIBurbuja {

    public static void main(String[] args) {
        // Puntuaciones de confianza de los correos electrónicos (1 al 10)
        int[] puntuaciones = {7, 3, 9, 1, 6, 8, 4, 5, 2, 10};

        System.out.println("Puntuaciones de confianza originales:");
        for (int puntuacion : puntuaciones) {
            System.out.print(puntuacion + " ");
        }

        Burbuja.bubbleSort(puntuaciones);

        System.out.println("\n\nPuntuaciones ordenadas de menor a mayor confianza:");
        for (int puntuacion : puntuaciones) {
            System.out.print(puntuacion + " ");
        }
    }
}
