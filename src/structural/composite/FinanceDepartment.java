package structural.composite;

public class FinanceDepartment implements Department {

    private String name;

    public FinanceDepartment(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("This is finance department -> " + this.name);
    }


}