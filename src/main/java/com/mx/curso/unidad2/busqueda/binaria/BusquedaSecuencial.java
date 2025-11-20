package com.mx.curso.unidad2.busqueda.binaria;

public class BusquedaSecuencial {

    public static int busquedaSecuencial(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] datos = {4, 2, 7, 1, 9, 3, 5};
        int elementoABuscar = 9;

        int indice = busquedaSecuencial(datos, elementoABuscar);

        if (indice != -1) {
            System.out.println("El elemento " + elementoABuscar + " se encuentra en el indice: " + indice);
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en el arreglo.");
        }

        // Ejemplo de un elemento que no existe
        int otroElemento = 10;
        int otroIndice = busquedaSecuencial(datos, otroElemento);
        System.out.println("\nBuscando el elemento " + otroElemento + "...");
        if (otroIndice != -1) {
            System.out.println("El elemento " + otroElemento + " se encuentra en el indice: " + otroIndice);
        } else {
            System.out.println("El elemento " + otroElemento + " no se encuentra en el arreglo.");
        }
    }
}