package com.mx.curso.unidad3.lista.ejemploAI;

import java.util.LinkedList;

public class RutaAutonoma {

    public static void main(String[] args) {
        // 1. Inicialización de la Ruta (Lista Enlazada)
        // Usamos una LinkedList de Strings para representar los puntos (waypoints) de la ruta.
        LinkedList<String> rutaActual = new LinkedList<>();

        System.out.println("--- Planificación Inicial de la Ruta ---");
        rutaActual.add("Ciudad A (Inicio)");
        rutaActual.add("Ciudad C");
        rutaActual.add("Ciudad D");
        rutaActual.add("Ciudad E (Destino)");

        System.out.println("Ruta Planificada: " + rutaActual);

        // 2. Demostración de Eficiencia: Inserción de un nuevo Waypoint

        // Simulación: El sistema de IA detecta una mejor ruta o un punto de recarga
        // necesario entre la Ciudad A y la Ciudad C, y debe insertar un nuevo waypoint
        // "Ciudad B" de manera eficiente.

        System.out.println("\n--- Recálculo Dinámico de la Ruta ---");

        // En un arreglo, insertar en medio requeriría mover todos los elementos
        // posteriores (costo O(n)).
        // En una lista enlazada, la inserción es O(1) si se conoce el nodo anterior.
        // Aquí usamos el índice (índice 1, después de A y antes de C) para demostrar
        // la rapidez conceptual.

        String nuevoWaypoint = "Ciudad B (Recarga)";
        int indiceInsercion = 1;

        // La operación add(index, element) es rápida en una LinkedList (basada en el concepto O(1)
        // del nodo enlazado) en comparación con un Array.
        rutaActual.add(indiceInsercion, nuevoWaypoint);

        System.out.println("Waypoint insertado en el índice " + indiceInsercion + ": " + nuevoWaypoint);
        System.out.println("Ruta Recalculada: " + rutaActual);

        // 3. Demostración de Eficiencia: Eliminación de un Waypoint

        // Simulación: La Ciudad D está bloqueada (eliminación de un nodo).
        System.out.println("\n--- Eliminación de un Bloqueo ---");

        String waypointBloqueado = "Ciudad D";
        rutaActual.remove(waypointBloqueado);

        System.out.println("Waypoint eliminado: " + waypointBloqueado);
        System.out.println("Ruta Final: " + rutaActual);
    }
}