package com.mx.curso.unidad2.ordenamiento.mezcla.implementaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejemplo01 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(4, 8, 1, 9));

        System.out.println("Antes de ordenar: " + numeros);

        // Ordena usando Collections.sort() (usa TimSort internamente)
        Collections.sort(numeros);

        System.out.println("Después de ordenar: " + numeros);
    }

}
