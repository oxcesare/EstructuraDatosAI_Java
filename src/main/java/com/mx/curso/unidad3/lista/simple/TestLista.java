package com.mx.curso.unidad3.lista.simple;

public class TestLista {

    public static void main(String[] args) {
        // Crear una instancia de lista enlazada
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("Insertar nuevos datos: ");
        lista.insertarAlIniicio(10);
        lista.insertarAlIniicio(20);

        System.out.println("Insertar datos al final: ");
        lista.insertarAlFinal(30);
        lista.insertarAlFinal(40);

        lista.insertarAlIniicio(50);

        lista.imprimirLista();



    }
}
