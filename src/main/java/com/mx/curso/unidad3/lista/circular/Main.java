package com.mx.curso.unidad3.lista.circular;

// Clase Nodo
class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

// Clase Lista Circular Simplemente Enlazada
class ListaCircular {
    Nodo cabeza;

    public ListaCircular() {
        this.cabeza = null;
    }

    // Método para agregar un nuevo nodo al final de la lista
    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        // Si la lista está vacía, el nuevo nodo se apunta a sí mismo
        if (this.cabeza == null) {
            this.cabeza = nuevoNodo;
            nuevoNodo.siguiente = this.cabeza;
            return;
        }

        // Si la lista no está vacía, se recorre hasta el último nodo
        Nodo ultimo = this.cabeza;
        while (ultimo.siguiente != this.cabeza) {
            ultimo = ultimo.siguiente;
        }

        // El último nodo ahora apunta al nuevo nodo
        ultimo.siguiente = nuevoNodo;
        // El nuevo nodo apunta a la cabeza para cerrar el ciclo
        nuevoNodo.siguiente = this.cabeza;
    }

    // Método para imprimir la lista (se necesita una condición de parada)
    public void imprimirLista() {
        if (this.cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = this.cabeza;
        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != this.cabeza);
        System.out.println("(cabeza)");
    }
}

// Clase Principal para ejecutar el ejemplo
public class Main {
    public static void main(String[] args) {
        ListaCircular miLista = new ListaCircular();

        // Agregar elementos a la lista
        miLista.agregar(10);
        miLista.agregar(20);
        miLista.agregar(30);

        // Imprimir la lista para ver el resultado
        System.out.println("Lista circular enlazada:");
        miLista.imprimirLista(); // Salida: 10 -> 20 -> 30 -> (cabeza)
    }
}