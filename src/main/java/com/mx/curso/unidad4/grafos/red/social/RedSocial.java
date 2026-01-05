package com.mx.curso.unidad4.grafos.red.social;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedSocial {
    private final Map<User, List<User>> adjacencias = new HashMap<>();

    public void agregarUsuario(User user) {
        adjacencias.putIfAbsent(user, new java.util.ArrayList<>());
    }

    //Crear una amistad bidireccional entre dos usuarios
    public void conectarAmigos(User seguidor, User seguido) {
        if (!adjacencias.containsKey(seguidor) || !adjacencias.containsKey(seguido)) {
            throw new IllegalArgumentException("Ambos usuarios deben estar en la red social");
        }
        adjacencias.get(seguidor).add(seguido);
        adjacencias.get(seguido).add(seguidor);

        // otra implementacion puede ser
        // adjacencias.get(seguidor).add(seguido);
    }

    // Mostrar la red social
    public void imprimirRed() {
        adjacencias.forEach((user, amigos) -> {
            System.out.println(user.getName() + " es amigo de: " + amigos);
        });
    }


    public static void main(String[] args) {
        RedSocial miRed = new RedSocial();

        // Crear Nodos
        User ana = new User(1, "Ana");
        User beto = new User(2, "Beto");
        User carla = new User(3, "Carla");
        User david = new User(4, "David");
        User cesar = new User(5, "Cesar");

        // Registrar Nodos
        miRed.agregarUsuario(ana);
        miRed.agregarUsuario(beto);
        miRed.agregarUsuario(carla);
        miRed.agregarUsuario(david);
        miRed.agregarUsuario(cesar);

        // Crear Aristas (Conexiones)
        miRed.conectarAmigos(ana, beto);
        miRed.conectarAmigos(ana, carla);
        miRed.conectarAmigos(beto, david);
        miRed.conectarAmigos(carla, david);
        miRed.conectarAmigos(cesar, ana);
        miRed.conectarAmigos(ana, cesar);


        miRed.imprimirRed();
    }
}
