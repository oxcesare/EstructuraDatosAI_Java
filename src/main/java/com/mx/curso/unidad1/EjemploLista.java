package com.mx.curso.unidad1;

import java.util.List;

public class EjemploLista {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("numeros.get(" + i + ") = " + numeros.get(i));
        }
    }
}
