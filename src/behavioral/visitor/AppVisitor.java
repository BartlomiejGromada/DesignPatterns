package behavioral.visitor;

public class AppVisitor {

    public static void main(String[] args) {
        Item[] items = {
                new Computer(3500, "123213sds"),
                new Printer(80, 2, 123214)
        };

        Visitor visitor = new VisitorImpl();
        int sum = 0;
        for (Item item : items) {
            sum += item.accept(visitor);
        }

        System.out.println("Total cost: " + sum);

    }
}
