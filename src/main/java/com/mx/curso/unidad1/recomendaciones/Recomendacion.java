package com.mx.curso.unidad1.recomendaciones;

public class Recomendacion {

    public static void main(String[] args) {
        String[][] arr = {
                {"Usuario A", "Usuario B", "Usuario C", "Usuario D", "Usuario E"},
                {"Pelicula 1", "Pelicula 2", "Pelicula 3", "Pelicula 4", "Pelicula 5"},
                {"5", "3", "1", "1", "4"},
                {"4", "0", "1", "1", "4"},
                {"1", "1", "1", "5", "4"},
                {"1", "0", "1", "4", "0"},
                {"0", "1", "6", "4", "0"}
        };


        //Imprimir calificaciones
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        //sumar la primera columna
        int sum = 0;
        int pelicula = 4;
        for (int i = 2; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i][pelicula]);
        }
        System.out.println("Suma de la primera columna: " + sum);

        int calificacion = sum / (arr.length - 2);

        System.out.println("Calificacion promedio de la pelicula " + arr[1][pelicula] + " es: " + calificacion);
    }
}
