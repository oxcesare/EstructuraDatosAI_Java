package com.mx.curso.unidad2.ordenamiento.quickSort;

import java.util.*;

public class OrdenarComentarios {
    public static void main(String[] args) {

        Map<String, Double> comentarios = new HashMap<>();
        comentarios.put("Me encantó el producto", 0.9);
        comentarios.put("No funcionó como esperaba", 0.3);
        comentarios.put("Excelente servicio", 0.95);
        comentarios.put("Podría ser mejor", 0.5);
        comentarios.put("Muy decepcionado", 0.1);

        // Convertir a lista de entradas
        List<Map.Entry<String, Double>> lista = new ArrayList<>(comentarios.entrySet());

        // Ordenar por valor (puntuación)
        lista.sort(Map.Entry.comparingByValue());

        // Reconstruir el mapa ordenado
        Map<String, Double> comentariosOrdenados = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : lista) {
            comentariosOrdenados.put(entry.getKey(), entry.getValue());
        }

        // Mostrar resultados
        System.out.println("Comentarios ordenados por puntuación:");
        for (Map.Entry<String, Double> entry : comentariosOrdenados.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}