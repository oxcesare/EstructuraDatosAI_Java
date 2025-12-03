package com.mx.curso.unidad3.listas.implementaciones;

import java.util.LinkedList;

/**
 * Clase principal que demuestra el uso de una Lista Enlazada para
 * almacenar eficientemente una ruta.
 * * En el contexto de la IA (Pathfinding/A*), una lista enlazada es ideal
 * para construir el camino final, ya que permite añadir o quitar puntos
 * de la ruta rápidamente (O(1)) durante la planificación dinámica.
 */
public class RutaAutonoma {

    public static void main(String[] args) {
        // 1. Inicializacion de la Ruta (Lista Enlazada)
        // Usamos una LinkedList de Strings para representar los puntos (waypoints) de la ruta.
        LinkedList<String> rutaActual = new LinkedList<>();

        System.out.println("--- Planificacion Inicial de la Ruta ---");
        rutaActual.add("Ciudad A (Inicio)");
        rutaActual.add("Ciudad C");
        rutaActual.add("Ciudad D");
        rutaActual.add("Ciudad E (Destino)");

        System.out.println("Ruta Planificada: " + rutaActual);

        // 2. Demostración de Eficiencia: Insercion de un nuevo Waypoint

        // Simulación: El sistema de IA detecta una mejor ruta o un punto de recarga
        // necesario entre la Ciudad A y la Ciudad C, y debe insertar un nuevo waypoint
        // "Ciudad B" de manera eficiente.

        System.out.println("\n--- Recalculo Dinamico de la Ruta ---");

        // En un arreglo, insertar en medio requeriría mover todos los elementos
        // posteriores (costo O(n)).

        // En una lista enlazada (implementada en LinkedList), la inserción es O(1) si
        // se conoce el nodo adyacente, ya que la CLASE INTERNA maneja la reconfiguración
        // de los punteros (prev y next) de forma automática y eficiente.
        // Aquí usamos el índice (índice 1, después de A y antes de C) para demostrar
        // la rapidez conceptual.

        String nuevoWaypoint = "Ciudad B (Recarga)";
        int indiceInsercion = 1;

        // La operación add(index, element) es rápida en una LinkedList (basada en el concepto O(1)
        // del nodo enlazado) en comparación con un Array.
        rutaActual.add(indiceInsercion, nuevoWaypoint);

        System.out.println("Waypoint insertado en el indice " + indiceInsercion + ": " + nuevoWaypoint);
        System.out.println("Ruta Recalculada: " + rutaActual);

        // 3. Demostración de Eficiencia: Eliminación de un Waypoint

        // Simulación: La Ciudad D está bloqueada (eliminacion de un nodo).
        System.out.println("\n--- Eliminacion de un Bloqueo ---");

        String waypointBloqueado = "Ciudad D";
        rutaActual.remove(waypointBloqueado);

        System.out.println("Waypoint eliminado: " + waypointBloqueado);
        System.out.println("Ruta Final: " + rutaActual);
    }
}