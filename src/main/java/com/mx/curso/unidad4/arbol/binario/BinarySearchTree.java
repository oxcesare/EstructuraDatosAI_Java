package com.mx.curso.unidad4.arbol.binario;

public class BinarySearchTree {

    // La raíz es el punto de entrada al árbol
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    /**
     * Llama al método recursivo para insertar un nuevo valor.
     */
    public void insert(int data) {
        this.root = insertRecursive(root, data);
    }

    /**
     * Método recursivo para insertar un nodo
     */
    private Node insertRecursive(Node current, int data) {
        // Caso Base 1: Si el nodo actual es null, hemos encontrado la posición.
        if (current == null) {
            return new Node(data);
        }

        // Caso Recursivo: Comparamos el valor para decidir si vamos a la izquierda o derecha.
        if (data < current.data) {
            // Ir a la izquierda
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            // Ir a la derecha
            current.right = insertRecursive(current.right, data);
        }

        // Si el valor es igual, simplemente lo ignoramos (opción común en BST)
        return current;
    }

    // ----------------------------------------------------------------
    // Recorridos del Árbol (Demostrando Recursividad)
    // ----------------------------------------------------------------

    /**
     * Llama al método recursivo para el recorrido In-Order (Ordenado).
     */
    public void traverseInOrder() {
        System.out.print("In-Order (Ordenado): ");
        traverseInOrderRecursive(root);
        System.out.println();
    }

    /**
     * Recorrido In-Order: Izquierda -> Raíz -> Derecha.
     * El resultado es la impresión de los nodos en orden ascendente.
     */
    private void traverseInOrderRecursive(Node node) {
        if (node != null) {
            traverseInOrderRecursive(node.left);  // 1. Ir a la izquierda
            System.out.print(node.data + " ");   // 2. Procesar la raíz
            traverseInOrderRecursive(node.right); // 3. Ir a la derecha
        }
    }
}