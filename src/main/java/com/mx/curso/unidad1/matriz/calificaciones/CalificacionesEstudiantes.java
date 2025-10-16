package com.mx.curso.unidad1.matriz.calificaciones;

public class CalificacionesEstudiantes {

    public static void main(String[] args) {

        //Definir Matriz de calificaciones
        Double[][] calificaciones = {
                {10.0, 10.0, 9.8},
                {9.0, 7.0, 6.8},
                {7.0, 10.0, 10.0}
        };
        // posicion central de la matriz
        double posicionCentral = calificaciones[1][1];

        System.out.println("Imprimir posicion central: " + posicionCentral);

        posicionCentral = 9.5;

        System.out.println("Imprimir posicion central despues de modificacion: " + posicionCentral);

        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                if(i==1 &&j==1){
                    calificaciones[i][j]=posicionCentral;
                }
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
