package structural.facade;

public class ShapeMaker {

    private Shape circle;
    private Shape triangle;
    private Shape rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.triangle = new Triangle();
        this.rectangle = new Rectangle();
    }

    public void drawCircle() {
        this.circle.draw();
    }

    public void drawRectangle() {
        this.rectangle.draw();
    }

    public void drawTriangle() {
        this.rectangle.draw();
    }
}
