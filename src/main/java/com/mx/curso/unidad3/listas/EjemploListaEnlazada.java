package com.mx.curso.unidad3.listas;

public class EjemploListaEnlazada {


    // Clase Principal para ejecutar el ejemplo

    public static void main(String[] args) {
        ListaEnlazada miLista = new ListaEnlazada();

        // Agregar elementos a la lista
        miLista.agregar(10);
        miLista.agregar(20);
        miLista.agregar(30);

        // Imprimir la lista para ver el resultado
        System.out.println("Lista enlazada:");
        miLista.imprimirLista(); // Salida: 10 -> 20 -> 30 -> null
    }


}

// Clase Nodo
class Nodo {
    int dato;
    Nodo siguiente;

    // Constructor para inicializar el nodo
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null; // Inicialmente, no apunta a ningún otro nodo
    }
}

// Clase ListaEnlazada
class ListaEnlazada {
    Nodo cabeza; // La referencia al primer nodo de la lista

    // Constructor para inicializar la lista vacía
    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para agregar un nuevo nodo al final de la lista
    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        // Si la lista está vacía, el nuevo nodo es la cabeza
        if (this.cabeza == null) {
            this.cabeza = nuevoNodo;
            return;
        }

        // Si la lista no está vacía, recorrer hasta el final
        Nodo ultimo = this.cabeza;
        while (ultimo.siguiente != null) {
            ultimo = ultimo.siguiente;
        }

        // El último nodo ahora apunta al nuevo nodo
        ultimo.siguiente = nuevoNodo;
    }

    // Método para imprimir todos los elementos de la lista
    public void imprimirLista() {
        Nodo actual = this.cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
