package com.mx.curso.unidad2.busqueda.binaria.aplicacionesAI2;

import com.mx.curso.unidad2.busqueda.binaria.BusquedaBinaria;
import com.mx.curso.unidad2.busqueda.binaria.BusquedaBinariaDouble;

public class BusquedaBinariaImpl {

    public static void main(String[] args) {

        double[] datos_ordenados = {0.0001, 0.0005, 0.001, 0.005, 0.01, 0.05, 0.1, 0.5, 1.0};

        double elementoABuscar = 0.01;

        int indice = BusquedaBinariaDouble.busquedaBinaria(datos_ordenados, elementoABuscar);

        System.out.println("Indice encontrado (double): " + indice);

    }
}
