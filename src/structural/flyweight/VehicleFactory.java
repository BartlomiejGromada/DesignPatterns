package structural.flyweight;

import java.util.HashMap;

public class VehicleFactory {

    private static HashMap<String, Vehicle> vehicles = new HashMap<>();

    public static Vehicle createCar(String nameCar, Engine engine, String color,
                                    String brand) {

        if (vehicles.get(nameCar) != null)
            return vehicles.get(nameCar);
        else {
            System.out.println("Creating new Car...");
            Car car = new Car(engine, color, brand);
            vehicles.put(nameCar, car);
            return car;
        }
    }

}
