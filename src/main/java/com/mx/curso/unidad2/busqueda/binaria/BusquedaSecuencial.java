package com.mx.curso.unidad2.busqueda.binaria;

public class BusquedaSecuencial {

    /**
     * Implementa el algoritmo de búsqueda secuencial.
     *
     * @param arr El arreglo en el que se buscará el elemento.
     * @param x El elemento que se desea encontrar.
     * @return El índice del elemento si se encuentra, de lo contrario, -1.
     */
    public static int busquedaSecuencial(int[] arr, int x) {
        int n = arr.length;
        // Recorre el arreglo elemento por elemento
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                // Si el elemento es encontrado, retorna su índice
                return i;
            }
        }
        // Si el bucle termina sin encontrar el elemento, retorna -1
        return -1;
    }

    public static void main(String[] args) {
        int[] datos = {4, 2, 7, 1, 9, 3, 5};
        int elementoABuscar = 9;

        int indice = busquedaSecuencial(datos, elementoABuscar);

        if (indice != -1) {
            System.out.println("El elemento " + elementoABuscar + " se encuentra en el índice: " + indice);
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en el arreglo.");
        }

        // Ejemplo de un elemento que no existe
        int otroElemento = 10;
        int otroIndice = busquedaSecuencial(datos, otroElemento);
        System.out.println("\nBuscando el elemento " + otroElemento + "...");
        if (otroIndice != -1) {
            System.out.println("El elemento " + otroElemento + " se encuentra en el índice: " + otroIndice);
        } else {
            System.out.println("El elemento " + otroElemento + " no se encuentra en el arreglo.");
        }
    }
}