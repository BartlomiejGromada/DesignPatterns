package creational.factory_method;

public class AppFactoryMethod {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.createShape("Square");
        Shape triangle = shapeFactory.createShape("Triangle");
        //Shape circle = shapeFactory.createShape("Circle");

        square.printInfo();
        triangle.printInfo();
        // circle.printInfo(); //NullPointerException

    }
}
