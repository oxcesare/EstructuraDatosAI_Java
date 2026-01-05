package com.mx.curso.historial.commits;

import com.mx.curso.unidad4.arbol.inorden.ArbolBinarioBusquedaInorden;
import com.mx.curso.unidad4.arbol.postorden.ArbolBinarioBusquedaPostorden;
import com.mx.curso.unidad4.arbol.preorden.ArbolBinarioBusquedaPreorden;

public class Test {

    public static void main(String[] args) {

        int[][] datosDesordenados = {
                {50, 30, 80, 20, 45, 70, 95, 15, 35, 85},
                {65, 40, 90, 22, 55, 78, 99, 10, 48, 85},
                {33, 77, 15, 50, 88, 99, 10, 25, 60, 90},
                {70, 40, 85, 20, 60, 75, 95, 12, 55, 80},
                {25, 60, 15, 40, 80, 5, 30, 55, 75, 90},
                {88, 44, 99, 22, 66, 90, 10, 30, 50, 70},
                {55, 35, 75, 20, 48, 62, 85, 10, 40, 70},
                {90, 50, 95, 30, 70, 92, 98, 15, 65, 80},
                {42, 84, 21, 63, 10, 31, 52, 73, 94, 5},
                {58, 28, 78, 18, 48, 68, 88, 38, 52, 92}

        };

        ArbolBinarioBusquedaInorden arbol = new ArbolBinarioBusquedaInorden();
        ArbolBinarioBusquedaPostorden arbolPost = new ArbolBinarioBusquedaPostorden();
        ArbolBinarioBusquedaPreorden arbolPre = new ArbolBinarioBusquedaPreorden();

        for (int valor : datosDesordenados[5]) {
            arbol.insertar(valor);
            arbolPost.insertar(valor);
            arbolPre.insertar(valor);
        }

        System.out.println("Recorrido Inorden:");
        arbol.recorrido();
        System.out.println("\n\nRecorrido Postorden:");
        arbolPost.recorrido();
        System.out.println("\n\nRecorrido Preorden:");
        arbolPre.recorrido();
    }
}
