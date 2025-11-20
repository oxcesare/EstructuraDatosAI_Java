package com.mx.curso.unidad3.lista.simple;

/**
 * Clase que representa un nodo individual de la lista simplemente enlazada.
 */
class Nodo {
    // Almacena el dato
    int dato;
    // Puntero al siguiente nodo en la secuencia
    Nodo siguiente;

    // Constructor
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null; // Inicialmente no apunta a nada
    }
}