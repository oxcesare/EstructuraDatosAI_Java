package com.mx.curso.unidad2.ordenamiento.inserccion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Edades {

    public static void main(String[] args) {


        Map<String, Integer> personas = new HashMap<>();

        personas.put("Ana", 34);
        personas.put("Luis", 22);
        personas.put("Carlos", 29);
        personas.put("Sofía", 25);

        int[] edades = new int[personas.size()];
        //iterar las edades el mapa de edades y guardar las edades en el arreglo
        int index = 0;
        for (Integer edad : personas.values()) {
            edades[index++] = edad;
        }

        Inserccion.insertionSort(edades);
        System.out.println("\nArreglo ordenado:");
        System.out.println(Arrays.toString(edades));

    }
}
