package structural.flyweight;

public class Car extends Vehicle {

    private String brand;

    public Car(Engine engine, String color, String brand) {
        super(engine, color);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString() + " -> brand='" + brand;
    }
}
