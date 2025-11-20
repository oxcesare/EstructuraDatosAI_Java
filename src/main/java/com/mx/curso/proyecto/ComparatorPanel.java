package com.mx.curso.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

// Sigue el principio SRP: solo maneja la UI para seleccionar algoritmos para comparacion.
public class ComparatorPanel extends JPanel {

    private MainApp mainApp;
    private JComboBox<String> algorithm1ComboBox;
    private JComboBox<String> algorithm2ComboBox;

    public ComparatorPanel(MainApp app) {
        this.mainApp = app;
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Panel Principal
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBorder(BorderFactory.createTitledBorder("Comparador"));

        // Panel para controles (usando GridBagLayout para mejor alineacion)
        JPanel controlsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        String[] sortingAlgorithms = {
                "Bubble Sort",
                "Selection Sort",
                "Insertion Sort",
                "Merge Sort ",
                "QuickSort"};

        // --- Algoritmo 1 ---
        gbc.gridx = 0;
        gbc.gridy = 0;
        controlsPanel.add(new JLabel("Algoritmo 1:"), gbc);

        gbc.gridx = 1;
        algorithm1ComboBox = new JComboBox<>(sortingAlgorithms);
        controlsPanel.add(algorithm1ComboBox, gbc);

        // --- Algoritmo 2 ---
        gbc.gridx = 0;
        gbc.gridy = 1;
        controlsPanel.add(new JLabel("Algoritmo 2:"), gbc);

        gbc.gridx = 1;
        algorithm2ComboBox = new JComboBox<>(sortingAlgorithms);
        controlsPanel.add(algorithm2ComboBox, gbc);

        // --- Boton Comparar ---
        JButton compareButton = new JButton("Comparar");
        compareButton.addActionListener(this::handleCompare);

        // Agregar controles al panel principal
        contentPanel.add(controlsPanel);
        contentPanel.add(Box.createVerticalStrut(20)); // Espacio

        // Centrar el boton
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(compareButton);
        contentPanel.add(buttonPanel);

        add(contentPanel, BorderLayout.CENTER);
    }

    // Maneja la accion del boton "Comparar"
    private void handleCompare(ActionEvent e) {
        // Logica para iniciar la comparacion...

        // Simplemente navega a la vista de graficas
        mainApp.showView(MainApp.GRAPHS_VIEW);
    }
}