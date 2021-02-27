package behavioral.visitor;

public class Computer implements Item{

    private int cost;
    private String serialNumber;

    public Computer(int cost, String serialNumber) {
        this.cost = cost;
        this.serialNumber = serialNumber;
    }

    public int getCost() {
        return cost;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
