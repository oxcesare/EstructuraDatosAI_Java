package com.mx.curso.unidad3.colas.practica01;

import java.util.Queue;
import java.util.LinkedList;

public class EjemploQueue {

    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.add("Elemento 1");
        cola.add("Elemento 2");
        cola.add("Elemento 3");

        System.out.println("Contenido de la cola: " + cola);

        // Consultar el primer elemento sin eliminarlo
        System.out.println("Primer elemento (peek): " + cola.peek());

        // Remover elementos en orden FIFO
        String removido = cola.poll();
        System.out.println("Elemento removido: " + removido);
        System.out.println("Contenido actual: " + cola);
    }
}