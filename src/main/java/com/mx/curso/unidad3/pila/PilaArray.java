package com.mx.curso.unidad3.pila;

public class PilaArray {
    // Usamos la clase nativa Deque, implementada por ArrayDeque,
    // que es la forma más eficiente de usar una pila en Java.
    // También se podría usar Stack<Integer> o ArrayList<Integer>
    private java.util.ArrayDeque<Integer> pila;

    public PilaArray() {
        this.pila = new java.util.ArrayDeque<>();
    }

    /**
     * PUSH: Agrega un elemento a la cima de la pila (O(1)).
     */
    public void push(int dato) {
        pila.push(dato);
        System.out.println("Push: " + dato);
    }

    /**
     * POP: Remueve y retorna el elemento de la cima (O(1)).
     */
    public int pop() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        int dato = pila.pop();
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
        return pila.peek();
    }

    /**
     * Verifica si la pila está vacía (O(1)).
     */
    public boolean isEmpty() {
        return pila.isEmpty();
    }

    // --- Ejemplo de Uso ---
    public static void main(String[] args) {
        PilaArray miPila = new PilaArray();

        miPila.push(10); // Entra 10
        miPila.push(20); // Entra 20 (Cima)
        miPila.push(30); // Entra 30 (Nueva Cima)

        System.out.println("Cima actual (Peek): " + miPila.peek()); // 30

        miPila.pop(); // Sale 30
        miPila.pop(); // Sale 20

        System.out.println("Cima actual después de 2 pops: " + miPila.peek()); // 10

        miPila.pop(); // Sale 10

        System.out.println("¿La pila está vacía? " + miPila.isEmpty()); // true
    }
}