package DesignPattern.CreationalDP.FactoryDP.FactoryDP;

import javax.swing.*;
import java.awt.*;

public class Ucgen extends JPanel implements Sekil{

    @Override
    public void draw() {
        Graphics g = null;

        Ucgen ucgen = new Ucgen();
        JFrame frame = new JFrame("Java Şekil Çizdirme");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(ucgen, BorderLayout.CENTER);

        frame.pack();
        frame.setSize(450, 450);
        frame.setVisible(true);

        paintComponent(g);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        java.awt.Polygon p = new java.awt.Polygon();
        p.addPoint(350, 280);
        p.addPoint(280, 350);
        p.addPoint(410, 350);
        g.drawPolygon(p);
      //  g.fillPolygon(p);

    }
}
