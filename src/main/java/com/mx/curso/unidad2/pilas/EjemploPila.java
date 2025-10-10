package com.mx.curso.unidad2.pilas;

import java.util.ArrayDeque;
import java.util.Deque;

public class EjemploPila {

    public static void main(String[] args) {
        // Declarar e inicializar una pila (Stack) usando Deque e ArrayDeque.
        // ArrayDeque es más rápido que la clase Stack tradicional.
        // Usamos los métodos de Deque que actúan como operaciones de pila (push, peek, pop).
        Deque<String> pilaDeLibros = new ArrayDeque<>();

        // --- 1. Añadir elementos a la pila (Push) ---
        // 'push()' añade un elemento en la cima (tope) de la pila.
        pilaDeLibros.push("El Gran Gatsby");
        pilaDeLibros.push("Cien Años de Soledad");
        pilaDeLibros.push("1984"); // Este es el último elemento en entrar

        System.out.println("Pila después de añadir libros (tope a la izquierda): " + pilaDeLibros);
        // Salida: [1984, Cien Años de Soledad, El Gran Gatsby]

        // --- 2. Ver el elemento superior sin eliminarlo (Peek) ---
        // 'peek()' devuelve el elemento en la cima de la pila (LIFO).
        String libroEnTope = pilaDeLibros.peek();
        System.out.println("El libro en la cima de la pila es: " + libroEnTope);
        // Salida: 1984
        System.out.println("Pila después de peek: " + pilaDeLibros);
        // Salida: [1984, Cien Años de Soledad, El Gran Gatsby] (La pila no cambia)

        // --- 3. Eliminar elementos de la pila (Pop) ---
        // 'pop()' elimina y devuelve el elemento en la cima de la pila (LIFO).
        String libroRetirado1 = pilaDeLibros.pop();
        System.out.println("\nRetirando de la cima: " + libroRetirado1);
        // Salida: 1984

        String libroRetirado2 = pilaDeLibros.pop();
        System.out.println("Retirando de la cima: " + libroRetirado2);
        // Salida: Cien Años de Soledad

        System.out.println("Pila después de retirar 2 libros: " + pilaDeLibros);
        // Salida: [El Gran Gatsby]

        // --- 4. Comprobar si la pila está vacía y vaciarla ---
        System.out.println("¿La pila está vacía? " + pilaDeLibros.isEmpty());
        // Salida: false

        // Retirar el último libro
        pilaDeLibros.pop();

        System.out.println("Pila al finalizar: " + pilaDeLibros);
        // Salida: []
        System.out.println("¿La pila está vacía? " + pilaDeLibros.isEmpty());
        // Salida: true

        // Intentar 'pop' en una pila vacía
        try {
            pilaDeLibros.pop();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("\nError: No se puede hacer pop en una pila vacía. (Se lanza NoSuchElementException)");
        }
    }
}