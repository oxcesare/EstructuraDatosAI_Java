package com.mx.curso.unidad4.arbol.preorden;

/**
 * Clase que representa un nodo individual en el Árbol Binario.
 */
class Nodo {
    int valor;
    Nodo izquierda; // Puntero al subárbol izquierdo
    Nodo derecha;   // Puntero al subárbol derecho

    public Nodo(int item) {
        valor = item;
        izquierda = derecha = null;
    }
}

/**
 * Clase principal que gestiona la estructura del Árbol Binario
 * y contiene el método de recorrido Preorden.
 */
public class ArbolBinarioPreorden {
    Nodo raiz;

    // Constructor para inicializar un árbol vacío
    ArbolBinarioPreorden() {
        raiz = null;
    }

    /**
     * Función recursiva para el Recorrido Preorden: Raíz -> Izquierda -> Derecha.
     * Este recorrido es útil para copiar o serializar la estructura del árbol.
     *
     * @param nodo El nodo actual en el recorrido.
     */
    void recorrerPreorden(Nodo nodo) {
        // La condición de parada (caso base) es cuando el nodo es nulo
        if (nodo != null) {
            // 1. Visitar el nodo actual (IMPRIMIR LA RAÍZ)
            System.out.print(nodo.valor + " ");

            // 2. Recorrer el subárbol izquierdo (RECURSIVIDAD)
            recorrerPreorden(nodo.izquierda);

            // 3. Recorrer el subárbol derecho (RECURSIVIDAD)
            recorrerPreorden(nodo.derecha);
        }
    }

    // Método auxiliar para llamar al recorrido desde la raíz
    void recorrido() {
        recorrerPreorden(raiz);
    }

    /**
     * Método principal para construir el árbol y ejecutar el recorrido.
     */
    public static void main(String[] args) {
        ArbolBinarioPreorden arbol = new ArbolBinarioPreorden();

        // Construcción manual del árbol (la misma estructura que en el ejemplo Inorden):
        //        10
        //       /  \
        //      5    15
        //     / \   / \
        //    2   7 12  18

        arbol.raiz = new Nodo(10);
        arbol.raiz.izquierda = new Nodo(5);
        arbol.raiz.derecha = new Nodo(15);
        arbol.raiz.izquierda.izquierda = new Nodo(2);
        arbol.raiz.izquierda.derecha = new Nodo(7);
        arbol.raiz.derecha.izquierda = new Nodo(12);
        arbol.raiz.derecha.derecha = new Nodo(18);

        System.out.println("Arbol construido. El recorrido Preorden es (Raiz -> Izq -> Der):");
        arbol.recorrido();
        System.out.println("\n");
        // Salida esperada: 10 5 2 7 15 12 18
    }
}