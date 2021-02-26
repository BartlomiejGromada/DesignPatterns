package structural.decorator;

public class PizzaWithMozzarella implements Pizza{

    private static final double PIZZA_WITH_MOZZARELLA_PRICE = 12;
    private String name;

    public PizzaWithMozzarella(String name) {
        this.name = name;
    }

    @Override
    public double price() {
        return BASE_PIZZA + PIZZA_WITH_MOZZARELLA_PRICE;
    }

    @Override
    public String toString() {
        return "PizzaWithMozzarella{" +
                "name='" + name + '\'' +
                '}';
    }
}
