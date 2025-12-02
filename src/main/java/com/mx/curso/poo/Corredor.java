package com.mx.curso.poo;

public class Corredor {

    private int distancia;
    private int tiempo;


    public Corredor() {

    }

    public int calcularEntrenamiento(int distancia, int tiempo) {
        return distancia * tiempo;
    }

}
