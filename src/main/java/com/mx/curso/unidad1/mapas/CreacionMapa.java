package com.mx.curso.unidad1.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CreacionMapa {

    public static void main(String[] args) {

        //Creación de un mapa
        Map<String, String> mapa = new HashMap<>();
        mapa.put("clave1", "valor1");
        mapa.put("clave2", "valor2");
        mapa.put("clave3", "valor3");
        mapa.put("clave4", "valor4");

        System.out.println(mapa);

        // creacion de mapa con treeMap
        Map<String, String> mapa2 = new TreeMap<>();
        mapa2.put("clave11", "valor1");
        mapa2.put("clave22", "valor2");
        mapa2.put("clave33", "valor3");
        mapa2.put("clave44", "valor4");

        System.out.println(mapa2);

        //Iterar el mapa2
        for (Map.Entry<String, String> entrada : mapa2.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + " - Valor: " + entrada.getValue());
            if (entrada.getKey().equals("clave22")) {
                System.out.println("Encontrado");
            }
        }

    }
}
