package com.mx.curso.proyecto;

import javax.swing.*;
import java.awt.*;

// Sigue el principio SRP: solo maneja la UI para mostrar los resultados de la medicion.
public class MeasurementEnginePanel extends JPanel {

    public MeasurementEnginePanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel mainPanel = new JPanel(new GridLayout(1, 3, 20, 0));
        mainPanel.setBorder(BorderFactory.createTitledBorder("Motor de Medición"));

        // Crear los tres paneles de caso: Mejor, Promedio, Peor
        mainPanel.add(createCasePanel("Mejor Caso"));
        mainPanel.add(createCasePanel("Caso Promedio"));
        mainPanel.add(createCasePanel("Peor Caso"));

        add(mainPanel, BorderLayout.CENTER);
    }

    private JPanel createCasePanel(String title) {
        JPanel panel = new JPanel();
        // Usamos BoxLayout para una lista vertical de etiquetas
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder(title));

        // Estructura de las etiquetas (usan JLabel como placeholder para los valores)
        panel.add(createLabelPair("Inicio (ms):", "0.0"));
        panel.add(createLabelPair("Fin (ms):", "0.0"));
        panel.add(createLabelPair("Tiempo Ejec. (ms):", "0.0"));
        panel.add(Box.createVerticalStrut(15));
        panel.add(new JLabel("Lista Original: [5, 1, 4...]"));
        panel.add(Box.createVerticalStrut(5));
        panel.add(new JLabel("Lista Ordenada: [1, 4, 5...]"));

        // Alineacion de los componentes dentro del panel
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        return panel;
    }

    private JPanel createLabelPair(String labelText, String valuePlaceholder) {
        JPanel pair = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pair.add(new JLabel(labelText));
        // JLabel con un valor de ejemplo. Aqui se actualizaría el tiempo real.
        pair.add(new JLabel(valuePlaceholder));
        return pair;
    }
}