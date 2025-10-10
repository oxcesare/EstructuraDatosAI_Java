package com.mx.curso.unidad3.listas;

import com.mx.curso.unidad3.enlazada.ListaDoblementeEnlazada;

public class TestListaDoble {
    public static void main(String[] args) {

        ListaDoblementeEnlazada miLista = new ListaDoblementeEnlazada();

        // Imprimir la lista en ambas direcciones
        System.out.println("Recorrido hacia adela\n" +
                "        // Agregar elementos\n" +
                "        miLista.agregar(10);\n" +
                "        miLista.agregar(20);\n" +
                "        miLista.agregar(30);\nnte:");
        miLista.imprimirHaciaAdelante(); // Salida: 10 <-> 20 <-> 30 <-> null

        System.out.println("\nRecorrido hacia atrás:");
        miLista.imprimirHaciaAtras(); // Salida: 30 <-> 20 <-> 10 <-> null

    }
}
