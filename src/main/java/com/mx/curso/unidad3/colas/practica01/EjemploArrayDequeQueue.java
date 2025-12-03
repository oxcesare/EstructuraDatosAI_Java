package com.mx.curso.unidad3.colas.practica01;


import java.util.ArrayDeque;
import java.util.Queue;

public class EjemploArrayDequeQueue {

    public static void main(String[] args) {
        Queue<Integer> cola = new ArrayDeque<>();

        // Insertar elementos
        cola.offer(10);
        cola.offer(20);
        cola.offer(30);

        System.out.println("Contenido de la cola: " + cola);

        // Remover en orden FIFO
        int primero = cola.poll();
        System.out.println("Elemento removido: " + primero);
        System.out.println("Contenido actual: " + cola);

        // Consultar el siguiente elemento
        System.out.println("Siguiente elemento (peek): " + cola.peek());
    }
}
