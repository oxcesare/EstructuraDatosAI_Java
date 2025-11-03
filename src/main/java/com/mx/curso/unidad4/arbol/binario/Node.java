package com.mx.curso.unidad4.arbol.binario;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null; // Nodo hijo izquierdo
        this.right = null; // Nodo hijo derecho
    }
}