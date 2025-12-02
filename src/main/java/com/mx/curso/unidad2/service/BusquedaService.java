package com.mx.curso.unidad2.service;


import com.mx.curso.unidad2.busqueda.binaria.BusquedaBinaria;
import com.mx.curso.unidad2.ordenamiento.burbuja.practica1.Burbuja;

public class BusquedaService {

    public static int buscarElemento(int[] arreglo, int elemento) {
        Burbuja.bubbleSort(arreglo);
        return BusquedaBinaria.busquedaBinaria(arreglo, elemento);
    }
}
