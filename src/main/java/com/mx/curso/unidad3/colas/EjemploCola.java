package com.mx.curso.unidad3.colas;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {

    public static void main(String[] args) {
        // Declarar e inicializar una cola (Queue) usando LinkedList
        // La cola almacenará elementos de tipo String (nombres)
        Queue<String> colaDeClientes = new LinkedList<>();

        // --- 1. Añadir elementos a la cola (Enqueue / Offer) ---
        // El método 'offer()' es preferido ya que devuelve 'false' si falla
        // en lugar de lanzar una excepción como 'add()'
        colaDeClientes.offer("Alice");
        colaDeClientes.offer("Bob");
        colaDeClientes.offer("Charlie");
        colaDeClientes.offer("David");

        System.out.println("Cola después de añadir clientes: " + colaDeClientes);
        // Salida: [Alice, Bob, Charlie, David]

        // --- 2. Ver el elemento frontal sin eliminarlo (Peek) ---
        // 'peek()' devuelve 'null' si la cola está vacía
        String primerCliente = colaDeClientes.peek();
        System.out.println("El primer cliente en la cola es: " + primerCliente);
        // Salida: Alice
        System.out.println("Cola después de peek: " + colaDeClientes);
        // Salida: [Alice, Bob, Charlie, David] (La cola no cambia)

        // --- 3. Eliminar elementos de la cola (Dequeue / Poll) ---
        // 'poll()' elimina y devuelve el elemento al frente de la cola
        // y devuelve 'null' si la cola está vacía
        String clienteAtendido1 = colaDeClientes.poll();
        System.out.println("\nAtendiendo a: " + clienteAtendido1);
        // Salida: Alice

        String clienteAtendido2 = colaDeClientes.poll();
        System.out.println("Atendiendo a: " + clienteAtendido2);
        // Salida: Bob

        System.out.println("Cola después de atender a 2 clientes: " + colaDeClientes);
        // Salida: [Charlie, David]

        // --- 4. Comprobar si la cola está vacía ---
        System.out.println("¿La cola está vacía? " + colaDeClientes.isEmpty());
        // Salida: false

        // --- 5. Atender a los clientes restantes ---
        while (!colaDeClientes.isEmpty()) {
            System.out.println("Atendiendo a: " + colaDeClientes.poll());
        }

        System.out.println("Cola al finalizar: " + colaDeClientes);
        // Salida: []
        System.out.println("¿La cola está vacía? " + colaDeClientes.isEmpty());
        // Salida: true

        // Intentar 'poll' en una cola vacía
        String resultadoVacio = colaDeClientes.poll();
        System.out.println("Resultado de poll en cola vacía: " + resultadoVacio);
        // Salida: null
    }
}