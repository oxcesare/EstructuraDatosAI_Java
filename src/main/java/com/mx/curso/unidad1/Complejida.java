package com.mx.curso.unidad1;

import java.util.ArrayList;

public class Complejida {

    public static void main(String[] args) {

        long incio = System.currentTimeMillis();

        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lista.add(i);
        }
        int elemento = 87;

        boolean encontrado = new Complejida().busqcarElemento(lista, elemento);
        System.out.println("Elemento " + elemento + " encontrado: " + encontrado);

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo de ejecucion: " + (fin - incio) + " ms");
    }


    public boolean busqcarElemento(ArrayList<Integer> lista, int elemento) {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == elemento) {
                return true;
            }
        }
        return false;

    }
}
