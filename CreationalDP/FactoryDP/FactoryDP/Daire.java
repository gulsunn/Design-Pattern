package DesignPattern.CreationalDP.FactoryDP.FactoryDP;

import javax.swing.*;
import java.awt.*;

public class Daire extends JPanel implements Sekil {

    @Override
    public void draw() {
        Graphics g = null;

        Daire daire = new Daire();

        JFrame frame = new JFrame("Java Şekil Çizdirme");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(daire, BorderLayout.CENTER);

        frame.pack();
        frame.setSize(450, 450);
        frame.setVisible(true);

          paintComponent(g);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);

        g.drawOval(50, 40, 100, 100);
    }

}
