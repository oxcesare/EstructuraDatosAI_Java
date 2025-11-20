package com.mx.curso.unidad3.pila.backtracking;

public class SimulacionDFS {
    public static void main(String[] args) {


        PilaListaEnlazada pila = new PilaListaEnlazada();

        // Estado inicial: PUSH A
        pila.push("A");
        System.out.println("Inicio en A");
        pila.mostrar();

        // Paso 1: POP & Visitar A
        String actual = pila.pop();
        System.out.println("POP & Visitar: " + actual);
        pila.mostrar();

        // Paso 2: PUSH B (vecino de A)
        pila.push("B");
        System.out.println("PUSH vecino: B");
        pila.mostrar();

        // Paso 3: PUSH C (vecino de A)
        pila.push("C");
        System.out.println("PUSH vecino: C");
        pila.mostrar();

        // Paso 4: POP & Visitar C
        actual = pila.pop();
        System.out.println("POP & Visitar: " + actual);
        pila.mostrar();

        // Paso 5: PUSH D (vecino de C)
        pila.push("D");
        System.out.println("PUSH vecino: D");
        pila.mostrar();

        // Paso 6: POP & Visitar D
        actual = pila.pop();
        System.out.println("POP & Visitar: " + actual);
        pila.mostrar();

        // Paso 7: POP & Visitar B
        actual = pila.pop();
        System.out.println("POP & Visitar: " + actual);
        pila.mostrar();

        // Paso 8: PUSH E (vecino de B)
        pila.push("E");
        System.out.println("PUSH vecino: E");
        pila.mostrar();

        // Fin: Pila vacía (continúa exploración desde E)
        System.out.println("Fin: Pila vacia (continua exploración desde E)");

    }
}