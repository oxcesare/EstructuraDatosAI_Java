package com.mx.curso.unidad4.arbol.recorrido.inorden;

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
 * y contiene el método de recorrido Inorden.
 */
public class ArbolBinarioInorden {
    Nodo raiz;

    // Constructor para inicializar un árbol vacío
    ArbolBinarioInorden() {
        raiz = null;
    }

    /**
     * Función recursiva para el Recorrido Inorden: Izquierda -> Raíz -> Derecha.
     * @param nodo El nodo actual en el recorrido.
     */
    void recorrerInorden(Nodo nodo) {
        // La condición de parada (caso base) es cuando el nodo es nulo
        if (nodo != null) {
            // 1. Recorrer el subárbol izquierdo (RECURSIVIDAD)
            recorrerInorden(nodo.izquierda);

            // 2. Visitar el nodo actual (IMPRIMIR LA RAÍZ)
            System.out.print(nodo.valor + " ");

            // 3. Recorrer el subárbol derecho (RECURSIVIDAD)
            recorrerInorden(nodo.derecha);
        }
    }

    // Método auxiliar para llamar al recorrido desde la raíz
    void recorrido() {
        recorrerInorden(raiz);
    }

    /**
     * Método principal para construir el árbol y ejecutar el recorrido.
     */
    public static void main(String[] args) {
        ArbolBinarioInorden arbol = new ArbolBinarioInorden();

        // Construcción manual del árbol para el ejemplo:
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

        System.out.println("Arbol construido. El recorrido Inorden es (orden ascendente):");
        arbol.recorrido();
        System.out.println("\n");
        // Salida esperada: 2 5 7 10 12 15 18
    }
}