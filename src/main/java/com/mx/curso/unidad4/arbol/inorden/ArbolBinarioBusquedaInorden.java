package com.mx.curso.unidad4.arbol.inorden;

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


public class ArbolBinarioBusquedaInorden {
    Nodo raiz;

    ArbolBinarioBusquedaInorden() {
        raiz = null;
    }

    // ===========================================
    // MÉTODO DE INSERCIÓN (CONSTRUCCIÓN DEL ÁRBOL)
    // ===========================================

    /**
     * Método público que inicia la inserción desde la raíz.
     */
    void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    /**
     * Función recursiva para insertar un nuevo valor manteniendo la propiedad BST:
     * Menor va a la izquierda, Mayor va a la derecha.
     */
    Nodo insertarRecursivo(Nodo raizActual, int valor) {
        // 1. Si el subárbol está vacío, crea un nuevo nodo y lo devuelve.
        if (raizActual == null) {
            return new Nodo(valor);
        }

        // 2. Si el valor es menor, va al subárbol izquierdo.
        if (valor < raizActual.valor) {
            raizActual.izquierda = insertarRecursivo(raizActual.izquierda, valor);
        }
        // 3. Si el valor es mayor, va al subárbol derecho.
        else if (valor > raizActual.valor) {
            raizActual.derecha = insertarRecursivo(raizActual.derecha, valor);
        }
        // 4. Si el valor es igual, se ignora (no se permiten duplicados en este ejemplo).

        // 5. Devuelve el nodo (sin cambios si no se creó un nuevo nodo).
        return raizActual;
    }

    // ===========================================
    // RECORRIDO INORDEN (EXTRACCIÓN DE DATOS ORDENADOS)
    // ===========================================

    /**
     * Recorrido Inorden: Izquierda -> Raíz (Imprimir) -> Derecha
     */
    void recorrerInorden(Nodo nodo) {
        if (nodo != null) {
            // 1. Izquierda
            recorrerInorden(nodo.izquierda);

            // 2. Raíz (Imprime el valor)
            System.out.print(nodo.valor + " ");

            // 3. Derecha
            recorrerInorden(nodo.derecha);
        }
    }

    // Método público para iniciar el recorrido desde la raíz
    void recorrido() {
        recorrerInorden(raiz);
    }

    public static void main(String[] args) {
        ArbolBinarioBusquedaInorden arbol = new ArbolBinarioBusquedaInorden();

        // 1. Definimos un conjunto de valores completamente DESORDENADO.
        int[] datosDesordenados = {10, 5, 15, 2, 7, 12, 18, 1, 6};

        for (int dato : datosDesordenados) {
            arbol.insertar(dato);
        }

        System.out.println("\nEstructura del arbol construida. Realizando recorrido Inorden...");


        System.out.print("Resultado del recorrido Inorden: ");
        arbol.recorrido();
        System.out.println("\n");
    }
}
