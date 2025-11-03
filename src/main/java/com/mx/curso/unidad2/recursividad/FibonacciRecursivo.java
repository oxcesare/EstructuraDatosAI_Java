package com.mx.curso.unidad2.recursividad;

public class FibonacciRecursivo {

    public static int fibonacci(int n) {
        // Casos Base: Las condiciones que detienen la recursión
        if (n <= 1) {
            return n;
        }
        // Caso Recursivo: La función se llama a sí misma
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Serie de Fibonacci hasta la posicion " + numero + ":");
        for (int i = 0; i < numero; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}