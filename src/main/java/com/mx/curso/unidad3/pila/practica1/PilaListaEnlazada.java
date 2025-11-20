package com.mx.curso.unidad3.pila.practica1;

/**
 * Clase PilaListaEnlazada adaptada para ser genérica, manejando tipo T.
 */
public class PilaListaEnlazada<T> {

    // La cima ahora es un Nodo genérico
    private Nodo<T> cima;

    public PilaListaEnlazada() {
        this.cima = null;
    }

    // PUSH: recibe un dato de tipo T
    public void push(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
        // System.out.println("Push: " + dato); // Comentado para el ejercicio final
    }

    // POP: retorna un dato de tipo T
    public T pop() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        T dato = cima.dato;
        cima = cima.siguiente;
        // System.out.println("Pop: " + dato); // Comentado para el ejercicio final
        return dato;
    }

    // PEEK: retorna un dato de tipo T
    public T peek() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return cima.dato;
    }

    public boolean isEmpty() {
        return cima == null;
    }

    @Override
    public String toString() {
        // Implementación simple para ver el estado de la pila
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> actual = cima;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) {
                sb.append(" <- "); // Representa LIFO, el primero es la cima
            }
            actual = actual.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}