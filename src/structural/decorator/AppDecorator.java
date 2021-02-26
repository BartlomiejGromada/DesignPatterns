package structural.decorator;

public class AppDecorator {

    public static void main(String[] args) {
        Pizza hawaiianPizza = new HawaiianPizza("Pizza with pineapple");
        Pizza mozzarellaPizza = new PizzaWithMozzarella("Pizza with mozzarella");

        Pizza pizzaWithDelivery = new DeliveryPizza(hawaiianPizza);

        System.out.println(mozzarellaPizza + " -> " + mozzarellaPizza.price());
        System.out.println(pizzaWithDelivery + " -> " + pizzaWithDelivery.price());

    }
}
