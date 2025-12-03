package com.mx.curso.unidad3.colas;

import java.util.LinkedList;
import java.util.Queue;

public class ServidorWeb {


    public static void main(String[] args) {
        Queue<String> colaUsuarios = new LinkedList<>();

        //Encolar Enqueue
        colaUsuarios.offer("Alice");
        colaUsuarios.offer("Bob");
        colaUsuarios.offer("Charlie");
        colaUsuarios.offer("David");
        colaUsuarios.offer("Eve");

        System.out.println("Cola despues de agregar usuarios: " + colaUsuarios);

        //Servidor atiende solicitudes
        while (!colaUsuarios.isEmpty()) {
            String usuarioAtendido = colaUsuarios.poll();
            System.out.println("Atendiendo a: " + usuarioAtendido);
        }
        //Imprimir estado de la cola despues de atender a todos
        System.out.println("Cola despues de atender a todos los usuarios: " + colaUsuarios);
    }
}
