package structural.flyweight;

public class Engine {

    private String nameEngine;
    private double capacity;

    public Engine(String nameEngine, double capacity) {
        this.nameEngine = nameEngine;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "nameEngine='" + nameEngine + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
