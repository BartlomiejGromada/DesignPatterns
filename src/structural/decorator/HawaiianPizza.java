package structural.decorator;

public class HawaiianPizza implements Pizza {

    private static final double HAWAIIAN_PRICE = 8;
    private String name;


    public HawaiianPizza(String name) {
        this.name = name;
    }

    @Override
    public double price() {
        return BASE_PIZZA + HAWAIIAN_PRICE;
    }

    @Override
    public String toString() {
        return "HawaiianPizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
