package structural.composite;

public class TaxCollectionDepartment implements Department {

    private String name;

    public TaxCollectionDepartment(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("This is tex collection department -> "+this.name);
    }
}