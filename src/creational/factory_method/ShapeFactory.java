package creational.factory_method;

public class ShapeFactory {

    public Shape createShape(String name) {
        if (name.equalsIgnoreCase("Square"))
            return new Square();
        else if (name.equalsIgnoreCase("Triangle"))
            return new Triangle();

        return null;
    }
}
