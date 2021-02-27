package behavioral.visitor;

public class VisitorImpl implements Visitor {

    @Override
    public int visit(Computer computer) {

        int price = computer.getCost();
        if (computer.getCost() > 3000)
            price -= 200;

        System.out.println("Computer: "+ computer.getSerialNumber()+ " -> cost: "+price);
        return price;
    }

    @Override
    public int visit(Printer printer) {
        int cost = printer.getPriceOfCartridge() * printer.getNoOfCartridge();
        System.out.println("Printer: " + printer.getModelNumber() + " -> cost: " + cost);
        return cost;
    }
}
