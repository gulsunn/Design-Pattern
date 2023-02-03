package DesignPattern.StructuralDP.FacadeDP;

public class FacadeRunner {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle(); // Circle::draw()
    }
}
