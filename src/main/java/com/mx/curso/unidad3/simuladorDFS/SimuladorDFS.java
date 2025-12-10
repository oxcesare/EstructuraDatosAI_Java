package com.mx.curso.unidad3.simuladorDFS;

public class SimuladorDFS {
    public static void main(String[] args) {

        PilaListaEnlazada pila = new PilaListaEnlazada();

        pila.push("A");
        System.out.println("Inicio en A");
        pila.mostrar();

        String actual = pila.pop();
        System.out.println("POP & Visitar" + actual);
        pila.mostrar();

        pila.push("B");
        System.out.println("B Vecino de A");
        pila.mostrar();

        pila.push("C");
        System.out.println("PUSH Vecino de C");
        pila.mostrar();

        // Operacion 4
        actual = pila.pop();
        System.out.println("POP & Visitar" + actual);
        pila.mostrar();

        //Operacion 5
        pila.push("D");
        System.out.println("PUSH Vecino de D");
        pila.mostrar();





    }
}
