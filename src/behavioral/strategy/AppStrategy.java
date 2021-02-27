package behavioral.strategy;

import java.util.Arrays;
import java.util.List;

public class AppStrategy {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Cola", 7),
                new Item("Chips", 6),
                new Item("Water", 2)
        );

        ShoppingCart shoppingCart = new ShoppingCart(items);
        shoppingCart.pay(new PaypalStrategy("tomasz@gmail.com", "PWD12@sds"));

        shoppingCart.pay(new CreditCardStrategy("Tomasz Kowalski", "1234-553-3221-1123", "DSDA"));

    }
}
