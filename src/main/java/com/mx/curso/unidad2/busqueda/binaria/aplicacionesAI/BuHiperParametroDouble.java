package com.mx.curso.unidad2.busqueda.binaria.aplicacionesAI;

import com.mx.curso.unidad2.busqueda.binaria.BusquedaBinariaDouble;

import java.util.Arrays;
import java.util.Collections;

public class BuHiperParametroDouble {

    public static void main(String[] args) {

        double[] tasa = {0.0005, 0.0001, 0.001, 0.005, 0.01, 0.05, 0.1, 0.5, 1.0};

        Arrays.sort(tasa);

        double hiperParametroBuscado = 0.0005;

        int busqueda = BusquedaBinariaDouble.busquedaBinaria(tasa, hiperParametroBuscado);

        if (busqueda != -1) {
            System.out.println("El hiperparametro " + hiperParametroBuscado + " se encontro en el indice: " + busqueda);
        } else {
            System.out.println("El hiperparametro " + hiperParametroBuscado + " no se encontro en el arreglo.");
        }

    }
}
