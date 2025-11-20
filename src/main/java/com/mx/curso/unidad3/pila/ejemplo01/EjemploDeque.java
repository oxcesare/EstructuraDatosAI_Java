package com.mx.curso.unidad3.pila.ejemplo01;

import java.util.Deque;
import java.util.ArrayDeque;

public class EjemploDeque {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        // Agregar elementos al frente y al final
        deque.addFirst("Inicio");
        deque.addLast("Final");
        deque.addFirst("Nuevo Inicio");

        // Mostrar contenido
        System.out.println("Contenido del Deque: " + deque);

        // Remover elementos de ambos extremos
        String primero = deque.removeFirst();
        String ultimo = deque.removeLast();

        System.out.println("Removido primero: " + primero);
        System.out.println("Removido ultimo: " + ultimo);
        System.out.println("Contenido actual: " + deque);
    }
}
