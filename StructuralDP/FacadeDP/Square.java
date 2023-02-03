package DesignPattern.StructuralDP.FacadeDP;

import DesignPattern.StructuralDP.FacadeDP.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
