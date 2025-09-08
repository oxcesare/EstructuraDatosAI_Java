package com.mx.curso.unidad1.recomendaciones;

public class Recomendacion2 {

    public static void main(String[] args) {
        // Mejor práctica: Usar matrices solo para los datos numéricos
        int[][] calificaciones = {
                {5, 3, 1, 1, 4},
                {4, 0, 1, 1, 4},
                {1, 1, 1, 5, 4},
                {1, 0, 1, 4, 0},
                {0, 1, 6, 4, 0}
        };

        String[] peliculas = {"Pelicula 1", "Pelicula 2", "Pelicula 3", "Pelicula 4", "Pelicula 5"};
        String[] usuarios = {"Usuario A", "Usuario B", "Usuario C", "Usuario D", "Usuario E"};

        // Imprimir la matriz de calificaciones
        System.out.println("--- Calificaciones de Usuarios ---");
        System.out.print("           "); // Espacio para alinear
        for (String p : peliculas) {
            System.out.printf("%-10s", p);
        }
        System.out.println();
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.printf("%-10s", usuarios[i]);
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.printf("%-10d", calificaciones[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n-----------------------------------");

        // Calcular el promedio de una película específica
        // Pedir al usuario el índice de la película
        int indicePelicula = 2; // Ejemplo: promediar "Pelicula 3"

        int sumaTotal = 0;
        int conteoVotos = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            int calificacion = calificaciones[i][indicePelicula];
            if (calificacion > 0) { // No contar las calificaciones de 0
                sumaTotal += calificacion;
                conteoVotos++;
            }
        }

        double promedio = (double) sumaTotal / conteoVotos;

        System.out.println("Calificacion promedio de '" + peliculas[indicePelicula] + "' es: " + String.format("%.2f", promedio));

        System.out.println("-----------------------------------");

        // Mostrar las calificaciones de un usuario específico
        int indiceUsuario = 1; // Ejemplo: mostrar calificaciones de "Usuario B"
        System.out.println("Calificaciones de " + usuarios[indiceUsuario] + ":");
        for (int i = 0; i < calificaciones[indiceUsuario].length; i++) {
            System.out.println(peliculas[i] + ": " + calificaciones[indiceUsuario][i]);
        }
    }
}
