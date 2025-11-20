package com.mx.curso.unidad3.pila.practica1;

class Nodo<T> {
    T dato; // Usa el tipo genérico T
    Nodo<T> siguiente; // El puntero también debe ser del tipo genérico

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}