package DesignPattern.CreationalDP.FactoryDP.JavaSekilCizme;

import javax.swing.*;
import java.awt.*;

public class SekilCiz extends JPanel {
    public SekilCiz() {
        setSize(450, 450);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);

        g.drawOval(50, 40, 100, 100);

        g.fillOval(160, 40, 100, 100);
        /*

        g.fillArc(280, 40, 100, 100, 130, 135);

        g.setColor(Color.RED);

        g.drawRect(50, 150, 100, 100);

        g.fillRect(160, 150, 150, 100);

        g.setColor(Color.DARK_GRAY);

        g.drawLine(380, 40, 380, 250);
        g.drawLine(381, 40, 381, 250);

        g.setColor(Color.MAGENTA);

        g.drawRoundRect(50, 280, 100, 60, 30, 40);

        g.fillRoundRect(160, 280, 100, 60, 30, 40);

        g.setColor(Color.BLACK);

        g.drawString("Java'da Şekil Çizimleri", 30, 30);

        g.setColor(Color.ORANGE);

        java.awt.Polygon p = new java.awt.Polygon();
        p.addPoint(350, 280);
        p.addPoint(280, 350);
        p.addPoint(410, 350);
        g.fillPolygon(p);

         */


    }

}
