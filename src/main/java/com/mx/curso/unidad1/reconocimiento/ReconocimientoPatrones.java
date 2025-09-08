package com.mx.curso.unidad1.reconocimiento;

import java.util.Vector;

public class ReconocimientoPatrones {

    public static void main(String[] args) {

        Vector<Double> caracterisitcas = new Vector<>();
        caracterisitcas.add(3.5);
        caracterisitcas.add(1.4);
        caracterisitcas.add(0.2);

        System.out.println("Vector Original: " + caracterisitcas);

        double sum = 0.0D;
        for (Double d : caracterisitcas) {
            sum += d;
        }

        for (int i = 0; i < caracterisitcas.size(); i++) {
            double valor = caracterisitcas.get(i);
            double valorNormalizado = valor / sum;
            caracterisitcas.set(i, valorNormalizado);
        }
        System.out.println("Vector Normalizado: " + caracterisitcas);


    }
}
