package structural.flyweight;

public class AppFlyWeight {

    public static void main(String[] args) {

        Vehicle audiA3 = VehicleFactory.createCar("A3", new Engine("TFSI", 2.0),
                "red", "Audi");

        Vehicle punto = VehicleFactory.createCar("Punto", new Engine("Diesel", 1.2),
                "sliver", "Fiat");

        Vehicle golf = VehicleFactory.createCar("Golf", new Engine("Diesel", 1.6),
                "black", "Volkswagen");

        System.out.println(audiA3);
        System.out.println(punto);
        System.out.println(golf);


        Vehicle audiA3Copy = VehicleFactory.createCar("A3", new Engine("TFSI", 2.0),
                "red", "Audi");

        System.out.println(audiA3Copy);
    }
}
