package com.mx.curso.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

// Sigue el principio SRP (Single Responsibility Principle): solo maneja la UI de la generacion de reportes.
public class ReportGeneratorPanel extends JPanel {

    private MainApp mainApp;
    private JComboBox<String> typeAlgorithmComboBox;
    private JComboBox<String> algorithmComboBox;

    public ReportGeneratorPanel(MainApp app) {
        this.mainApp = app;
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Panel Principal
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBorder(BorderFactory.createTitledBorder("Generador de Reportes de Rendimientos"));

        // Panel para controles (usando GridBagLayout para mejor alineacion)
        JPanel controlsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // --- Tipo de Algoritmo ---
        gbc.gridx = 0;
        gbc.gridy = 0;
        controlsPanel.add(new JLabel("Tipo de Algoritmo:"), gbc);

        gbc.gridx = 1;
        typeAlgorithmComboBox = new JComboBox<>(new String[]{"Ordenamiento", "Busqueda", "Estructura Lineal"});
        controlsPanel.add(typeAlgorithmComboBox, gbc);

        // --- Algoritmo ---
        gbc.gridx = 0;
        gbc.gridy = 1;
        controlsPanel.add(new JLabel("Algoritmo:"), gbc);

        gbc.gridx = 1;
        algorithmComboBox = new JComboBox<>(new String[]{"Bubble Sort", "QuickSort", "Sequential Search", "Stack", "Queue"});
        controlsPanel.add(algorithmComboBox, gbc);

        // --- Boton Generar Datos ---
        JButton generateButton = new JButton("Generar Datos");
        generateButton.addActionListener(this::handleGenerateData);

        // Agregar controles al panel principal
        contentPanel.add(controlsPanel);
        contentPanel.add(Box.createVerticalStrut(20)); // Espacio

        // Centrar el boton
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(generateButton);
        contentPanel.add(buttonPanel);

        add(contentPanel, BorderLayout.CENTER);
    }

    // Maneja la accion del boton "Generar Datos"
    private void handleGenerateData(ActionEvent e) {
        // Logica para generar datos...

        // Simplemente navega a la vista de medicion para propositos de la UI
        mainApp.showView(MainApp.MEASUREMENT_VIEW);
    }
}