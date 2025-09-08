package com.mx.curso.unidad3.lista.doble;

public class EjemploListaDoble {

    public static void main(String[] args) {
        ListaDoble miLista = new ListaDoble();

        // Agregar elementos
        miLista.agregar(10);
        miLista.agregar(20);
        miLista.agregar(30);

        // Imprimir la lista en ambas direcciones
        System.out.println("Recorrido hacia adelante:");
        miLista.imprimirHaciaAdelante(); // Salida: 10 <-> 20 <-> 30 <-> null

        System.out.println("\nRecorrido hacia atrás:");
        miLista.imprimirHaciaAtras(); // Salida: 30 <-> 20 <-> 10 <-> null
    }
}

// Clase Nodo
class Nodo {
    int dato;
    Nodo siguiente; // Puntero al siguiente nodo
    Nodo anterior; // Puntero al nodo anterior

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}

// Clase Lista Doblemente Enlazada
class ListaDoble {
    Nodo cabeza; // Referencia al primer nodo
    Nodo cola;   // Referencia al último nodo

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    // Método para agregar un nodo al final de la lista
    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            return;
        }

        cola.siguiente = nuevoNodo;
        nuevoNodo.anterior = cola;
        cola = nuevoNodo;
    }

    // Método para imprimir la lista hacia adelante
    public void imprimirHaciaAdelante() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Método para imprimir la lista hacia atrás
    public void imprimirHaciaAtras() {
        Nodo actual = cola;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        }
        System.out.println("null");
    }


}