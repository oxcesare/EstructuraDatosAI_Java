package com.mx.curso.unidad3.lista.simple;
/**
 * Clase que gestiona la lista simplemente enlazada.
 */
class ListaEnlazada {

    // Puntero a la cabeza (primer nodo) de la lista
    Nodo cabeza;

    // Constructor
    public ListaEnlazada() {
        this.cabeza = null; // Lista vacía al inicio
    }

    /**
     * Método para insertar un nuevo nodo al inicio de la lista.
     * Complejidad: O(1)
     */
    public void insertarAlInicio(int nuevoDato) {
        // 1. Crear el nuevo nodo
        Nodo nuevoNodo = new Nodo(nuevoDato);

        // 2. Apuntar el 'siguiente' del nuevo nodo a la 'cabeza' actual
        nuevoNodo.siguiente = cabeza;

        // 3. Mover la 'cabeza' para que apunte al nuevo nodo
        cabeza = nuevoNodo;
        System.out.println("Insertado al inicio: " + nuevoDato);
    }

    /**
     * Método para insertar un nuevo nodo al final de la lista.
     * Complejidad: O(n) (debe recorrer toda la lista)
     */
    public void insertarAlFinal(int nuevoDato) {
        // 1. Crear el nuevo nodo
        Nodo nuevoNodo = new Nodo(nuevoDato);

        // Caso 1: Si la lista está vacía, el nuevo nodo es la cabeza
        if (cabeza == null) {
            cabeza = nuevoNodo;
            System.out.println("Insertado al final (lista vacía): " + nuevoDato);
            return;
        }

        // Caso 2: Si la lista NO está vacía, recorrer hasta el último nodo
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        // 3. El último nodo apunta al nuevo nodo
        actual.siguiente = nuevoNodo;
        System.out.println("Insertado al final: " + nuevoDato);
    }

    /**
     * Método para imprimir todos los elementos de la lista.
     */
    public void imprimirLista() {
        Nodo actual = cabeza;
        System.out.print("Lista Enlazada: ");

        // Recorrer hasta que 'actual' sea null (el final de la lista)
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("NULL");
    }
}