package DesignPattern.StructuralDP.FacadeDP;

public class ShapeMaker {// FacadeClass

    Shape circle = new Circle();
    Shape square = new Square();
    Shape rectangle = new Rectangle();

    public void  drawCircle(){
        circle.draw();
    }
    public void  drawSquare(){
        square.draw();
    }
    public void  drawRectangle(){
        rectangle.draw();
    }

}
