package com.mx.curso.unidad2.hackerRank;

public class Cadena {

    public static void main(String[] args) {
        String cadena = "Cesar";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
    }
}
