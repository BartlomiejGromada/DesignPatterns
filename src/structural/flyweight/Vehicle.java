package structural.flyweight;

import java.util.Objects;

public abstract class Vehicle {

    private Engine engine;
    private String color;

    public Vehicle(Engine engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return engine.equals(vehicle.engine) &&
                color.equals(vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, color);
    }
}
