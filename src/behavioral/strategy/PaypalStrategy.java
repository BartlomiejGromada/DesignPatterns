package behavioral.strategy;

public class PaypalStrategy implements PaymentStrategy {

    String email;
    String password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " pln -> You pay by paypal");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "PaypalStrategy{" +
                "name='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
