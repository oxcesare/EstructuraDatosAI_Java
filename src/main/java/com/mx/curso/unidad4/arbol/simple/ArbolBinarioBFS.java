package com.mx.curso.unidad4.arbol.simple;

import java.util.LinkedList;
import java.util.Queue;

// Clase para representar un nodo del árbol
class Nodo {
    int data;
    Nodo left;
    Nodo right;

    public Nodo(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

/**
 * Clase que implementa un Árbol Binario Simple con inserción por Niveles (BFS).
 * Esto garantiza que el árbol esté perfectamente balanceado y compacto.
 */
public class ArbolBinarioBFS {
    Nodo root;

    public ArbolBinarioBFS() {
        this.root = null;
    }

    /**
     * Inserta un nuevo nodo utilizando el método Por Niveles (BFS).
     * El nodo se coloca en el primer lugar disponible, de izquierda a derecha.
     */
    public void insertarPorNiveles(int data) {
        Nodo nuevoNodo = new Nodo(data);

        // Si el árbol está vacío, el nuevo nodo es la raíz.
        if (root == null) {
            root = nuevoNodo;
            return;
        }

        // Utilizamos una cola para recorrer el árbol por niveles (BFS)
        Queue<Nodo> queue = new LinkedList<>();
        queue.add(root);

        // Bucle para encontrar la primera posición libre
        while (!queue.isEmpty()) {
            Nodo temp = queue.poll();

            // 1. Intentar insertar como hijo izquierdo
            if (temp.left == null) {
                temp.left = nuevoNodo;
                return;
            } else {
                // Si ya tiene hijo izquierdo, lo agregamos a la cola para revisar sus hijos
                queue.add(temp.left);
            }

            // 2. Intentar insertar como hijo derecho
            if (temp.right == null) {
                temp.right = nuevoNodo;
                return;
            } else {
                // Si ya tiene hijo derecho, lo agregamos a la cola para revisar sus hijos
                queue.add(temp.right);
            }
        }
    }

    /**
     * Recorrido por Niveles (BFS) para mostrar la estructura del árbol.
     */
    public void mostrarPorNiveles() {
        if (root == null) {
            System.out.println("El árbol está vacío.");
            return;
        }

        Queue<Nodo> queue = new LinkedList<>();
        queue.add(root);

        System.out.println("--- Estructura del Arbol (Por Niveles) ---");

        while (!queue.isEmpty()) {
            int nivelSize = queue.size();
            for (int i = 0; i < nivelSize; i++) {
                Nodo temp = queue.poll();

                // Imprimir el dato del nodo actual
                System.out.print(temp.data + " ");

                // Agregar hijos a la cola
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            System.out.println(); // Salto de línea para separar niveles
        }
    }

    public static void main(String[] args) {
        ArbolBinarioBFS arbol = new ArbolBinarioBFS();

        int[] datos = {2, 9, 10, 17, 18, 1};
        System.out.print("Numeros a insertar en orden: ");
        for (int dato : datos) {
            System.out.print(dato + " ");
            arbol.insertarPorNiveles(dato);
        }
        System.out.println("\n");

        // Muestra la estructura jerárquica nivel por nivel
        arbol.mostrarPorNiveles();

        System.out.println("\n--- Analisis de la Estructura ---");
        System.out.println("Este arbol NO es un Arbol de Busqueda Binario (BST).");
        System.out.println("La insercion solo busca el primer lugar disponible (izquierda a derecha, nivel por nivel), ignorando el valor del dato (por ejemplo, '5' es hijo izquierdo de '1').");
    }
}