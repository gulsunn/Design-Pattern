package DesignPattern.CreationalDP.FactoryDP.FactoryDP;

import javax.swing.*;
import java.awt.*;

public class MainFactoryDP {
    public static void main(String[] args) {

       // Sekil daire = new Daire();
       // daire.draw();

       //  Sekil dikdortgen = new Dikdortgen();
       //  dikdortgen.draw();

       // Polygon polygon = new Polygon();
       // polygon.draw();

        ShapeFactory shapeFactory= new ShapeFactory();
        Sekil sekil1 = shapeFactory.sekilCiz("ÜÇGEN");
        sekil1.draw();

    }
}
