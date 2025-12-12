package com.mx.curso.unidad4.arbol.postorden;

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


public class ArbolBinarioBusquedaPostorden {
    Nodo raiz;

    ArbolBinarioBusquedaPostorden() {
        raiz = null;
    }

    // ===========================================
    // MÉTODO DE INSERCIÓN (Para construir el árbol)
    // ===========================================

    /**
     * Método público que inicia la inserción desde la raíz.
     */
    void insertar(int valor) {
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
    // RECORRIDO POSTORDEN (El foco de este ejemplo)
    // ===========================================

    /**
     * Recorrido Postorden: Izquierda -> Derecha -> Raíz (Imprimir)
     */
    void recorrerPostorden(Nodo nodo) {
        if (nodo != null) {
            // 1. Recorre el subárbol izquierdo
            recorrerPostorden(nodo.izquierda);

            // 2. Recorre el subárbol derecho
            recorrerPostorden(nodo.derecha);

            // 3. Visita la raíz (imprime el valor al final)
            System.out.print(nodo.valor + " ");
        }
    }

    // Método público para iniciar el recorrido desde la raíz
    void recorrido() {
        recorrerPostorden(raiz);
    }

    public static void main(String[] args) {
        ArbolBinarioBusquedaPostorden arbol = new ArbolBinarioBusquedaPostorden();

        // Valores de entrada desordenados, igual que el ejemplo anterior:
        // {10, 5, 15, 2, 7, 12, 18, 1, 6}
        int[] datosDesordenados = {10, 5, 15, 2, 7, 12, 18, 1, 6};

        System.out.println("Insertando datos desordenados: [10, 5, 15, 2, 7, 12, 18, 1, 6]");

        // El árbol se construye de forma auto-organizada (BST)
        for (int dato : datosDesordenados) {
            arbol.insertar(dato);
        }

        System.out.println("\nEstructura del arbol construida. Realizando recorrido Postorden...");

        // El recorrido Postorden produce una secuencia diferente
        System.out.print("Resultado del recorrido Postorden: ");
        arbol.recorrido();

        // La secuencia esperada es: 1 2 6 7 5 12 18 15 10
        System.out.println("\n");
        System.out.println("Nota: En este recorrido, el nodo raiz (10) se visita al final.");
    }
}