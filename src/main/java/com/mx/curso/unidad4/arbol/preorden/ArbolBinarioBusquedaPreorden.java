package com.mx.curso.unidad4.arbol.preorden;

// Clase que representa un nodo individual en el árbol
class Nodo {
    int valor;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(int item) {
        valor = item;
        izquierda = derecha = null;
    }
}


public class ArbolBinarioBusquedaPreorden {
    Nodo raiz;

    public ArbolBinarioBusquedaPreorden() {
        raiz = null;
    }

    // ===========================================
    // MÉTODO DE INSERCIÓN (Para construir el árbol)
    // ===========================================

    /**
     * Método público que inicia la inserción desde la raíz.
     */
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    /**
     * Función recursiva para insertar un nuevo valor manteniendo la propiedad BST.
     */
    Nodo insertarRecursivo(Nodo raizActual, int valor) {
        if (raizActual == null) {
            return new Nodo(valor);
        }

        if (valor < raizActual.valor) {
            raizActual.izquierda = insertarRecursivo(raizActual.izquierda, valor);
        } else if (valor > raizActual.valor) {
            raizActual.derecha = insertarRecursivo(raizActual.derecha, valor);
        }

        return raizActual;
    }

    // ===========================================
    // RECORRIDO PREORDEN (El foco de este ejemplo)
    // ===========================================

    /**
     * Recorrido Preorden: Raíz (Imprimir) -> Izquierda -> Derecha
     */
    public void recorrerPreorden(Nodo nodo) {
        if (nodo != null) {
            // 1. Visita la raíz (imprime el valor al inicio)
            System.out.print(nodo.valor + " ");

            // 2. Recorre el subárbol izquierdo
            recorrerPreorden(nodo.izquierda);

            // 3. Recorre el subárbol derecho
            recorrerPreorden(nodo.derecha);
        }
    }

    // Método público para iniciar el recorrido desde la raíz
    public void recorrido() {
        recorrerPreorden(raiz);
    }

    public static void main(String[] args) {
        ArbolBinarioBusquedaPreorden arbol = new ArbolBinarioBusquedaPreorden();

        // Valores de entrada desordenados:
        int[] datosDesordenados = {90, 50, 95, 30, 70, 92, 98, 15, 65, 80};


        // El árbol se construye de forma auto-organizada (BST)
        for (int dato : datosDesordenados) {
            arbol.insertar(dato);
        }

        System.out.println("\nEstructura del arbol construida. Realizando recorrido Preorden...");

        // El recorrido Preorden produce una secuencia que comienza por la raíz
        System.out.print("Resultado del recorrido Preorden: ");
        arbol.recorrido();

        // CORRECCIÓN: La raíz es visitada al inicio en Preorden.
        System.out.println("\n");

    }
}