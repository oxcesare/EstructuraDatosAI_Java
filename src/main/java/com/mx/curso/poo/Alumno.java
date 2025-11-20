package com.mx.curso.poo;

public class Alumno {

    private String matricula;

    public void incripcionCurso(){
        System.out.println("El alumno esta inscrito en el curso de Estructura de datos");
    }

    public String getMatricula() {
        return matricula;
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.matricula="A12345";
        alumno.incripcionCurso();
        System.out.println("Matricula del alumno: " + alumno.getMatricula());

        Numpy.multiplica(5,7);

    }
}
