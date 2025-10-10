package com.mx.curso.unidad4.arbol.binario;

class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insertamos valores desordenados: 50, 30, 70, 20, 40, 60, 80
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Árbol Binario de Búsqueda construido.");

        // El recorrido In-Order siempre imprime el árbol en orden ascendente,
        // demostrando que las reglas del BST fueron aplicadas.
        tree.traverseInOrder();
        // Salida esperada: 20 30 40 50 60 70 80


        /*
          Conceptos Clave de POO Aplicados

          Encapsulamiento:
          Recursividad:
          Abstraccion

         */
    }
}