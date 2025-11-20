package com.mx.curso.unidad3.pila.practica1;

public class EjercicioPilaIA {

    // Asume que la clase PilaListaEnlazada (o PilaArray) existe y maneja Strings
    public static void main(String[] args) {
        // Para simplificar, asumiremos que la Pila maneja Strings
        PilaListaEnlazada<String> pilaExploracion = new PilaListaEnlazada<>();

        System.out.println("--- Simulación de Búsqueda en Profundidad (DFS) ---");

        // 1. Inicio: PUSH A
        pilaExploracion.push("A");

        // 2. POP & Visitar A
        String nodoActual = pilaExploracion.pop();
        System.out.println("Visitando nodo: " + nodoActual);

        // 3. PUSH B
        // ... (Completar con las operaciones restantes 3 al 8) ...

        // 8. PUSH E
        // ...

        System.out.println("\n--- Resumen ---");
        System.out.println("Nodos pendientes de explorar (Backtracking): " + pilaExploracion.toString());
        System.out.println("El último nodo ingresado es: " + pilaExploracion.peek());

        // El resultado final debe ser [E]
    }
}
