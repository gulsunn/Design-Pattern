package DesignPattern.CreationalDP.FactoryDP.JavaSekilCizme;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SekilCiz panel=new SekilCiz();


        JFrame frame = new JFrame("Java Şekil Çizdirme");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setSize(450, 450);
        frame.setVisible(true);




    }
}
