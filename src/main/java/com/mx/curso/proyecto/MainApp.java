package com.mx.curso.proyecto;

import javax.swing.*;
import java.awt.*;

// La clase MainApp actúa como el controlador principal y el punto de entrada.
// Sigue el principio OCP (Open/Closed Principle) al permitir añadir nuevas vistas.
public class MainApp extends JFrame {

    private CardLayout cardLayout;
    private JPanel cardPanel;

    // Constantes para el CardLayout
    public static final String GENERATOR_VIEW = "Generador";
    public static final String MEASUREMENT_VIEW = "Medicion";
    public static final String COMPARATOR_VIEW = "Comparador";
    public static final String GRAPHS_VIEW = "Graficas";

    protected MainApp(boolean isTest) {
        // La variable 'isTest' se usa solo para diferenciar esta firma del constructor por defecto.
        // No ejecuta la lógica de inicialización de la UI aquí.
    }

    public MainApp() {
        setTitle("Proyecto Final: Generador de Reportes de Rendimiento");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Inicializar CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Inicializar vistas
        ReportGeneratorPanel generatorPanel = new ReportGeneratorPanel(this);
        MeasurementEnginePanel measurementPanel = new MeasurementEnginePanel();
        ComparatorPanel comparatorPanel = new ComparatorPanel(this);
        GraphPanel graphPanel = new GraphPanel(this);

        // Agregar vistas al CardPanel con sus nombres de identificacion
        cardPanel.add(generatorPanel, GENERATOR_VIEW);
        cardPanel.add(measurementPanel, MEASUREMENT_VIEW);
        cardPanel.add(comparatorPanel, COMPARATOR_VIEW);
        cardPanel.add(graphPanel, GRAPHS_VIEW);

        add(cardPanel);

        // Mostrar la vista inicial
        showView(GENERATOR_VIEW);
    }

    // Metodo para cambiar la vista (Controlador de navegacion)
    public void showView(String viewName) {
        cardLayout.show(cardPanel, viewName);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainApp().setVisible(true);
        });
    }
}