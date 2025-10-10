package com.mx.curso.unidad2;


public class FactorialRecursivo {

    public static int factorial(int n) {
        // Caso Base: La condición de parada
        if (n <= 1) {
            return 1;
        }
        // Caso Recursivo: La función se llama a sí misma con un problema más pequeño
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}