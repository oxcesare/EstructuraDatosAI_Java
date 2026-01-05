package com.mx.curso.prueba.concepto;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJaxbJsonProvider; // Importa el proveedor correcto (puede variar según la versión)
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


public class JerseyClientTest {

    // URL de una API pública de prueba
    private static final String BASE_URI = "https://jsonplaceholder.typicode.com/todos/1";

    @Test
    public void testJerseyClientVersion2_34() {
        // 1. Crear el Cliente Jersey (usando Builder)
        Client client = ClientBuilder.newClient();

        // 2. Registrar el proveedor de JSON (Jackson)
        client.register(JacksonJaxbJsonProvider.class);

        // 3. Definir el Target (el recurso/endpoint)
        WebTarget target = client.target(BASE_URI);

        System.out.println("Ejecutando prueba con Jersey 2.34...");

        // 4. Realizar la petición GET y deserializar la respuesta a un objeto Todo
        Todo todo = target.request(MediaType.APPLICATION_JSON)
                .get(Todo.class);

        // 5. Aserciones: Verificar que la llamada fue exitosa
        //assertNotNull(todo, "El objeto Todo no debe ser nulo.");
        assertNotNull("El objeto Todo no debe ser nulo", todo);


        System.out.println("Prueba 2.34 exitosa. Título recuperado: " + todo.getTitle());
    }
}