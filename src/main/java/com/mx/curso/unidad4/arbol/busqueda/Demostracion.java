package com.mx.curso.unidad4.arbol.busqueda;

public class Demostracion {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Los datos se insertan en el orden: A, B, C, D, E, F, G
        tree.insert("A");
        tree.insert("B");
        tree.insert("C");
        tree.insert("D");
        tree.insert("E");
        tree.insert("F");
        tree.insert("G");
        tree.insert("H");
        tree.insert("I");

        System.out.println("Arbol Binario Generico construido.");

        // El recorrido por niveles mostrará los nodos en el orden de inserción: A B C D E F G
        tree.traverseLevelOrder();
    }

}
