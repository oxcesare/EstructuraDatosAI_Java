package com.mx.curso.unidad3.listas.implementaciones;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Clase que simula un Historial de Transacciones (Undo/Redo) utilizando
 * la clase LinkedList, que internamente es una Lista Doblemente Enlazada.
 * * En la IA (ej. Algoritmos de Búsqueda con Backtracking o sistemas de simulación),
 * es crucial poder volver a estados anteriores (UNDO) o avanzar a estados ya
 * explorados (REDO) de forma eficiente.
 */
public class HistorialTransacciones {

    public static void main(String[] args) {
        // Usamos LinkedList para el historial. Esta clase implementa internamente
        // una lista doblemente enlazada, ideal para el movimiento bidireccional.
        LinkedList<String> historial = new LinkedList<>();

        System.out.println("--- Inicio del Historial de Acciones ---");

        // El ListIterator nos permitirá "estar" en una posición y movernos hacia
        // adelante (next) o hacia atrás (previous).
        ListIterator<String> iterador = historial.listIterator();

        // 1. Ejecutar y registrar acciones (ADD)
        iterador.add("Accion 1: Crear Documento");
        iterador.add("Accion 2: Escribir Titulo");
        iterador.add("Accion 3: Insertar Imagen");

        System.out.println("Historial completo: " + historial);
        System.out.println("Estado actual (Accion mas reciente): " + historial.getLast());

        // 2. Simulación de la función UNDO (Mover hacia atrás)
        System.out.println("\n--- Simulacion UNDO ---");

        // Movemos el iterador hacia atrás (previous()).
        // Esto representa el movimiento del puntero "prev" al nodo anterior.
        if (iterador.hasPrevious()) {
            String accionDeshecha = iterador.previous();
            System.out.println("UNDO: Deshecho -> " + accionDeshecha);
        }
        if (iterador.hasPrevious()) {
            String accionDeshecha = iterador.previous();
            System.out.println("UNDO: Deshecho -> " + accionDeshecha);
        }

        System.out.println("Estado actual despues de 2 UNDOs: " + iterador.next()); // Muestra la acción donde estamos parados (Acción 1)

        // 3. Simulación de la función REDO (Mover hacia adelante)
        System.out.println("\n--- Simulacion REDO ---");

        // Movemos el iterador hacia adelante (next()).
        // Esto representa el movimiento del puntero "next" al nodo siguiente.
        if (iterador.hasNext()) {
            String accionRehecha = iterador.next();
            System.out.println("REDO: Rehecho -> " + accionRehecha);
        }

        System.out.println("Estado actual despues de 1 REDO: " + historial.get(iterador.previousIndex()));

        // Observación clave: La doblemente enlazada permite saber rápidamente
        // cuál es la acción siguiente (REDO) y cuál es la acción anterior (UNDO).
    }
}