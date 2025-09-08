package com.mx.curso.unidad1.vectores;

import java.util.Vector;

public class EjemploVector {

    public static void main(String[] args) {

        Vector<Double> notas = new Vector<>();
        notas.add(10.0);
        notas.add(9.0);
        notas.add(8.0);

        System.out.println(notas.get(0));
        System.out.println(notas.set(0, 11.70));

        double suma = 0;
        for (Double nota : notas) {
            suma += nota;
        }

        double media = suma / notas.size();


    }
}
