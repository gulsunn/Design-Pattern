package DesignPattern.CreationalDP.FactoryDP.FactoryDP;

import javax.swing.*;
import java.awt.*;

public class Dikdortgen extends JPanel implements Sekil{

    @Override
    public void draw() {
        Graphics g = null;

        Dikdortgen dikdortgen=new Dikdortgen();
        JFrame frame = new JFrame("Java Şekil Çizdirme");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(dikdortgen, BorderLayout.CENTER);

        frame.pack();
        frame.setSize(450, 450);
        frame.setVisible(true);

        paintComponent(g);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.drawRect(50,40,100,100);

    }

}
