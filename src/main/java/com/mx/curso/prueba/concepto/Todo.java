package com.mx.curso.prueba.concepto;

// Usa las anotaciones de Jackson si usas jersey-media-json-jackson
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Todo {
    private int id;
    private int userId;
    private String title;
    private boolean completed;

    // Getters y Setters (Obligatorios para la deserialización de Jackson)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
}