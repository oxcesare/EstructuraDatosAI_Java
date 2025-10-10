package com.mx.curso.unidad4.arbol.busqueda;

public class Demostracion {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Los datos se insertan en el orden: A, B, C, D, E, F, G
        tree.insert("A");
        tree.insert("B"); // Hijo izquierdo de A
        tree.insert("C"); // Hijo derecho de A
        tree.insert("D"); // Hijo izquierdo de B
        tree.insert("E"); // Hijo derecho de B
        tree.insert("F"); // Hijo izquierdo de C
        tree.insert("G"); // Hijo derecho de C

        System.out.println("Árbol Binario Genérico construido.");

        // El recorrido por niveles mostrará los nodos en el orden de inserción: A B C D E F G
        tree.traverseLevelOrder();
    }

}
