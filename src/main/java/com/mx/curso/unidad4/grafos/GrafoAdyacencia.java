package com.mx.curso.unidad4.grafos;

import java.util.*;

public class GrafoAdyacencia<T> {

    // El corazón del grafo: Mapea un vértice (T) a una lista de sus vecinos (T).
    private final Map<T, List<T>> adyacencia;

    public GrafoAdyacencia() {
        // Inicialización del Map
        this.adyacencia = new HashMap<>();
    }

    /**
     * Agrega un nuevo vértice al grafo.
     * Si el vértice ya existe, no hace nada.
     */
    public void agregarVertice(T vertice) {
        // Usa computeIfAbsent para asegurar que el vértice exista con una lista vacía.
        adyacencia.putIfAbsent(vertice, new LinkedList<>());
    }

    /**
     * Agrega una arista (conexión) entre dos vértices.
     * Si el grafo es no dirigido, se agrega la arista en ambas direcciones.
     */
    public void agregarArista(T origen, T destino) {
        // 1. Asegurar que ambos vértices existan antes de conectar
        agregarVertice(origen);
        agregarVertice(destino);

        // 2. Agregar la arista de Origen a Destino
        // Utilizamos putIfAbsent para prevenir aristas duplicadas
        if (!adyacencia.get(origen).contains(destino)) {
            adyacencia.get(origen).add(destino);
        }

        // 3. Agregar la arista de Destino a Origen (porque es un grafo NO DIRIGIDO)
        if (!adyacencia.get(destino).contains(origen)) {
            adyacencia.get(destino).add(origen);
        }
    }

    /**
     * Muestra la estructura de la lista de adyacencia.
     */
    public void imprimirGrafo() {
        System.out.println("--- Estructura del Grafo (Lista de Adyacencia) ---");
        for (T vertice : adyacencia.keySet()) {
            System.out.print("Vértice " + vertice + " es vecino de: ");
            System.out.println(adyacencia.get(vertice));
        }
    }
}