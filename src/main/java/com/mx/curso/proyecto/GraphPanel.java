package com.mx.curso.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

// Sigue el principio SRP: solo maneja la UI para mostrar las graficas.
public class GraphPanel extends JPanel {

    private MainApp mainApp;

    public GraphPanel(MainApp app) {
        this.mainApp = app;
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel graphsContainer = new JPanel(new GridLayout(1, 3, 20, 0));
        graphsContainer.setBorder(BorderFactory.createTitledBorder("Gráficas Comparativas de Rendimiento"));

        // Agregar las tres graficas ilustrativas
        graphsContainer.add(new GraphDisplayPanel("Algoritmo 1: QuickSort", Color.BLUE));
        graphsContainer.add(new GraphDisplayPanel("Algoritmo 2: Bubble Sort", Color.RED));
        graphsContainer.add(new GraphDisplayPanel("Comparativa N vs Tiempo", Color.GREEN));

        add(graphsContainer, BorderLayout.CENTER);
    }
}