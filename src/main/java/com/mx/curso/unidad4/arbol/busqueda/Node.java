package com.mx.curso.unidad4.arbol.busqueda;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    String data;
    Node left;
    Node right;

    public Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

