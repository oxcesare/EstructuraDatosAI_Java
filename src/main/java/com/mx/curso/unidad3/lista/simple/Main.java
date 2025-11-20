package com.mx.curso.unidad3.lista.simple;

public class Main {

    public static void main(String[] args) {
        ListaEnlazada miLista = new ListaEnlazada();

        System.out.println("--- 1. Insercion ---");
        // Insertar al inicio (O(1))
        miLista.insertarAlInicio(10); // [10]
        miLista.insertarAlInicio(5);  // [5] -> [10]

        // Insertar al final (O(n))
        miLista.insertarAlFinal(20);  // [5] -> [10] -> [20]
        miLista.insertarAlFinal(30);  // [5] -> [10] -> [20] -> [30]

        // Insertar otro al inicio
        miLista.insertarAlInicio(1);  // [1] -> [5] -> [10] -> [20] -> [30]

        System.out.println("\n--- 2. Resultado Final ---");
        miLista.imprimirLista();

        /* * Salida esperada:
         * Lista Enlazada: 1 -> 5 -> 10 -> 20 -> 30 -> NULL
         */
    }
}
