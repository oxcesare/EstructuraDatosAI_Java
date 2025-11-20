package com.mx.curso.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

// Clase de prueba temporal para visualizar ComparatorPanel.
// Simulamos una instancia de MainApp solo para cumplir con el constructor.
class TestAppController extends MainApp {

    private CardLayout testCardLayout;
    private JPanel testCardPanel;
    // Constructor que recibe el layout y el panel de esta prueba
    public TestAppController(CardLayout layout, JPanel panel) {
        // No llamamos al constructor de superclase para evitar inicializar toda la UI.
        super(true);
        this.testCardLayout = layout;
        this.testCardPanel = panel;
    }

    @Override
    public void showView(String viewName) {
        System.out.println("Navegacion simulada a la vista: " + viewName);
        testCardLayout.show(testCardPanel, viewName);
    }
}

public class TestComparatorPanel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // 1. Configurar el CardLayout y el Panel de tarjetas para la prueba
            CardLayout cardLayout = new CardLayout();
            JPanel cardPanel = new JPanel(cardLayout);

            // 2. Crear el controlador de la prueba que simula MainApp
            TestAppController testAppController = new TestAppController(cardLayout, cardPanel);

            // 3. Crear las vistas que se necesitan para el flujo: Comparador -> Gráficas
            ComparatorPanel comparatorPanel = new ComparatorPanel(testAppController);
            // Requerimos una instancia de GraphPanel para que haya algo a lo que navegar
            GraphPanel graphPanel = new GraphPanel(testAppController);

            // 4. Agregar ambas vistas al CardPanel con sus nombres (constantes de MainApp)
            // Usamos COMPARATOR_VIEW como identificador de la primera vista
            cardPanel.add(comparatorPanel, MainApp.COMPARATOR_VIEW);
            // Usamos GRAPHS_VIEW como identificador de la vista de destino
            cardPanel.add(graphPanel, MainApp.GRAPHS_VIEW);

            // 5. Crear la ventana principal de prueba (JFrame)
            JFrame testFrame = new JFrame("Prueba de ComparatorPanel con Navegación");
            testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            testFrame.setSize(800, 600);
            testFrame.setLocationRelativeTo(null);

            // 6. Agregar el panel de tarjetas a la ventana
            testFrame.add(cardPanel);

            // 7. Mostrar la vista inicial (ComparatorPanel)
            cardLayout.show(cardPanel, MainApp.COMPARATOR_VIEW);

            // 8. Mostrar la ventana
            testFrame.setVisible(true);
        });
    }
}