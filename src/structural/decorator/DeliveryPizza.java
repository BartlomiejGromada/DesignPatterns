package structural.decorator;

public class DeliveryPizza implements Pizza {

    private Pizza pizza;

    private static final double PRICE_DELIVERY = 10;

    public DeliveryPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double price() {
        return PRICE_DELIVERY + this.pizza.price();
    }

    @Override
    public String toString() {
        return "DeliveryPizza{" +
                "pizza=" + pizza +
                '}';
    }
}
