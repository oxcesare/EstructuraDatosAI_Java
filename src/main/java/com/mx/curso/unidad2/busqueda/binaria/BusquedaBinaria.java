package com.mx.curso.unidad2.busqueda.binaria;

public class BusquedaBinaria {

    public static int busquedaBinaria(int[] arr, int x) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Si el elemento es el del medio, se retorna el índice
            if (arr[medio] == x) {
                return medio;
            }

            // Si el elemento es mayor que el del medio, se descarta la mitad izquierda
            if (arr[medio] < x) {
                inicio = medio + 1;
            }
            // Si el elemento es menor que el del medio, se descarta la mitad derecha
            else {
                fin = medio - 1;
            }
        }
        // Si el elemento no se encuentra, se retorna -1
        return -1;
    }

    public static void main(String[] args) {
        int[] datos_ordenados = {1, 2, 4, 7, 9, 12, 15, 18};
        int elementoABuscar = 9;

        int indice = busquedaBinaria(datos_ordenados, elementoABuscar);

        if (indice != -1) {
            System.out.println("El elemento " + elementoABuscar + " se encuentra en el índice: " + indice);
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en el arreglo.");
        }

        // Ejemplo de un elemento que no existe
        int otroElemento = 10;
        int otroIndice = busquedaBinaria(datos_ordenados, otroElemento);
        System.out.println("\nBuscando el elemento " + otroElemento + "...");
        if (otroIndice != -1) {
            System.out.println("El elemento " + otroElemento + " se encuentra en el índice: " + otroIndice);
        } else {
            System.out.println("El elemento " + otroElemento + " no se encuentra en el arreglo.");
        }
    }
}
