package com.mx.curso.unidad1.matriz.calificaciones;

public class CalificacionesEstudiantesV2 {

    public static void main(String[] args) {

        int[] calificaciones = {7, 8, 9, 5, 5, 10, 10, 10, 9};
        int calificacionAlumno1 = calificaciones[0];
        int calificacionAlumno2 = calificaciones[1];

        //modificar calificacion alumno 3
        calificaciones[3] = 10;

        System.out.println("Calificacion Alumno 1: " + calificacionAlumno1);
        System.out.println("Calificacion Alumno 2: " + calificacionAlumno2);
        System.out.println("Calificacion Alumno 3: " + calificaciones[3]);

    }
}
