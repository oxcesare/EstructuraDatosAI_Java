package com.mx.curso.unidad3.pila.lista;

public class PilaListaEnlazada {

    // La 'cabeza' de la lista enlazada es la 'cima' de la pila
    private Nodo cima;

    public PilaListaEnlazada() {
        this.cima = null;
    }

    /**
     * PUSH: Agrega un nuevo nodo al inicio de la lista (cima de la pila) (O(1)).
     */
    public void push(int dato) {

        Nodo nuevoNodo = new Nodo(dato);

        // 1. El nuevo nodo apunta a la cima actual
        nuevoNodo.siguiente = cima;

        // 2. La cima se mueve al nuevo nodo
        cima = nuevoNodo;
        System.out.println("Push: " + dato);
    }

    /**
     * POP: Remueve y retorna el nodo en la cima (O(1)).
     */
    public int pop() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }

        int dato = cima.dato;
        // 1. La cima se mueve al siguiente nodo
        cima = cima.siguiente;

        System.out.println("Pop: " + dato);
        return dato;
    }

    /**
     * PEEK: Retorna el elemento de la cima sin removerlo (O(1)).
     */
    public int peek() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return cima.dato;
    }

    /**
     * Verifica si la pila esta vacia (O(1)).
     */
    public boolean isEmpty() {
        return cima == null;
    }

    // --- Ejemplo de Uso ---
    public static void main(String[] args) {
        PilaListaEnlazada miPila = new PilaListaEnlazada();

        miPila.push(100); // Entra 100
        miPila.push(200); // Entra 200 (Cima)

        System.out.println("Cima actual (Peek): " + miPila.peek()); // 200

        miPila.pop(); // Sale 200

        System.out.println("Cima actual despues de 1 pop: " + miPila.peek()); // 100

        miPila.pop(); // Sale 100

        System.out.println("¿La pila esta vacia? " + miPila.isEmpty()); // true
    }
}