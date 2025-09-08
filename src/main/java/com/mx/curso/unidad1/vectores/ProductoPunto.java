package com.mx.curso.unidad1.vectores;

public class ProductoPunto {
    public static void main(String[] args) {
        // Vector de entrada (una sola característica de 3 neuronas)
        double[] entrada = {1, 2, 3};

        // Matriz de pesos (3 neuronas de entrada, 2 de salida)
        double[][] pesos = {
                {0.5, 0.2},
                {0.8, 0.3},
                {0.1, 0.9}
        };

        // Arreglo de salida
        double[] salida = new double[2];

        // Realizar la multiplicación (producto punto)
        // El bucle externo recorre las neuronas de salida
        for (int j = 0; j < 2; j++) {
            // El bucle interno recorre las neuronas de entrada
            for (int i = 0; i < 3; i++) {
                salida[j] += entrada[i] * pesos[i][j];
            }
        }

        // Impresión de resultados
        System.out.print("Vector de entrada: ");
        for (double val : entrada) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("Matriz de pesos:");
        for (double[] fila : pesos) {
            for (double val : fila) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.print("\nSalida de la capa de neuronas (producto punto): ");
        for (double val : salida) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}