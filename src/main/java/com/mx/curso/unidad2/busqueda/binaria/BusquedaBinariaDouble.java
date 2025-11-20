package com.mx.curso.unidad2.busqueda.binaria;

public class BusquedaBinariaDouble {

    // Se recomienda usar una constante pequeña para la comparación de precisión
    private static final double EPSILON = 1e-9; // 0.000000001

    public static int busquedaBinaria(double[] arr, double x) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            double valorMedio = arr[medio];

            // 1. COMPARACIÓN CON PRECISIÓN (usando épsilon)
            if (Math.abs(valorMedio - x) < EPSILON) {
                return medio; // El elemento es encontrado
            }

            // 2. Si el elemento es mayor (comparación normal), se descarta la mitad izquierda
            if (valorMedio < x) {
                inicio = medio + 1;
            }
            // 3. Si el elemento es menor (comparación normal), se descarta la mitad derecha
            else {
                fin = medio - 1;
            }
        }
        // Si el elemento no se encuentra
        return -1;
    }
}
