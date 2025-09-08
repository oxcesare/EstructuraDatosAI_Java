package com.mx.curso.unidad1.listas;

import java.util.List;
import java.util.Queue;

public class EjemploLista {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for(Integer numero : numeros){
            System.out.println("Numero: " + numero);
        }

        //Convertir la lista en una cola (FIFO)
        List<Integer> cola = List.copyOf(numeros);
        System.out.println("Cola: " + cola);

        //Cola FIFO (First In First Out)
        Queue<Integer> queue = new java.util.LinkedList<>(cola);
        System.out.println("Elemento: " + queue.poll());
        //Elimina el primer elemento de la cola
        System.out.println("Cola despues de poll: " + queue);
    }
}
