package behavioral.visitor;

public class Printer implements Item{

    private int priceOfCartridge;
    private int noOfCartridge;
    private int modelNumber;

    public Printer(int priceOfCartridge, int noOfCartridge, int modelNumber) {
        this.priceOfCartridge = priceOfCartridge;
        this.noOfCartridge = noOfCartridge;
        this.modelNumber = modelNumber;
    }

    public int getPriceOfCartridge() {
        return priceOfCartridge;
    }

    public int getNoOfCartridge() {
        return noOfCartridge;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
