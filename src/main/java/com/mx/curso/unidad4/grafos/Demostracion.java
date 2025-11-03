package com.mx.curso.unidad4.grafos;

class Demostracion {

    public static void main(String[] args) {
        GrafoAdyacencia<String> redCiudades = new GrafoAdyacencia<>();

        // 1. Agregar Vértices (Ciudades)
        redCiudades.agregarVertice("Ciudad A");
        redCiudades.agregarVertice("Ciudad B");
        redCiudades.agregarVertice("Ciudad C");
        redCiudades.agregarVertice("Ciudad D");
        redCiudades.agregarVertice("Ciudad E");

        // 2. Agregar Aristas (Rutas)
        redCiudades.agregarArista("Ciudad A", "Ciudad B");
        redCiudades.agregarArista("Ciudad A", "Ciudad C");
        redCiudades.agregarArista("Ciudad B", "Ciudad D");
        redCiudades.agregarArista("Ciudad C", "Ciudad E");
        redCiudades.agregarArista("Ciudad D", "Ciudad E");

        // 3. Imprimir el Grafo
        redCiudades.imprimirGrafo();

        /**
         *
         * Conceptos Clave de POO y Estructuras de Datos
         * Abstracción
         * Encapsulamiento
         * Genericos
         * Lista de Adyacencia
         *
         */
    }
}