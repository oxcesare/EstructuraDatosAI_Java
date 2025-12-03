package com.mx.curso.unidad3.pila.practica01;

import java.util.ArrayDeque;

public class EjemploStack {

    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Push (agregar elementos)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Contenido de la pila: " + stack);

        // Pop (remover elementos)
        int elemento = stack.pop();
        System.out.println("Elemento removido: " + elemento);
        System.out.println("Contenido actual: " + stack);

        // Peek (ver el tope)
        System.out.println("Elemento en el tope: " + stack.peek());
    }
}
