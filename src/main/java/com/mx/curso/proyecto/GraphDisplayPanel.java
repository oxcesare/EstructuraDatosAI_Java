package com.mx.curso.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

// Clase auxiliar para dibujar graficas ilustrativas
// Sigue el principio OCP: se puede extender para dibujar diferentes tipos de graficas
class GraphDisplayPanel extends JPanel {
    private String title;
    private Color color;

    public GraphDisplayPanel(String title, Color color) {
        this.title = title;
        this.color = color;
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        // --- Dibujar Ejes ---
        g2d.drawLine(20, height - 20, width - 20, height - 20); // Eje X
        g2d.drawLine(20, 20, 20, height - 20); // Eje Y

        // --- Dibujar Titulo ---
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.drawString(title, width / 2 - g2d.getFontMetrics().stringWidth(title) / 2, 15);

        // --- Dibujar Barras Ilustrativas (3 Escenarios) ---
        int barWidth = 30;
        int maxTime = height - 40; // Altura maxima de la barra

        // Tiempos ilustrativos (PC >> CP > MC)
        int mcHeight = maxTime / 5;
        int cpHeight = maxTime / 2;
        int pcHeight = maxTime * 4 / 5;

        // Barras para Mejor Caso (MC)
        g2d.setColor(color.darker());
        g2d.fill(new Rectangle2D.Double(35, height - 20 - mcHeight, barWidth, mcHeight));
        g2d.drawString("MC", 35, height - 5);

        // Barras para Caso Promedio (CP)
        g2d.setColor(color);
        g2d.fill(new Rectangle2D.Double(35 + barWidth + 10, height - 20 - cpHeight, barWidth, cpHeight));
        g2d.drawString("CP", 35 + barWidth + 10, height - 5);

        // Barras para Peor Caso (PC)
        g2d.setColor(color.brighter());
        g2d.fill(new Rectangle2D.Double(35 + barWidth * 2 + 20, height - 20 - pcHeight, barWidth, pcHeight));
        g2d.drawString("PC", 35 + barWidth * 2 + 20, height - 5);
    }
}