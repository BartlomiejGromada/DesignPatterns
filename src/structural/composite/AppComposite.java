package structural.composite;

public class AppComposite {

    public static void main(String[] args) {
        Department financeDepartment = new FinanceDepartment("Finance Department Warsaw");
        Department taxCollectionDepartment = new TaxCollectionDepartment("Tax Collection Department Warsaw");
        HeadDepartment headDepartment = new HeadDepartment("Head Department Poland");

        headDepartment.addDepartment(financeDepartment);
        headDepartment.addDepartment(taxCollectionDepartment);

        headDepartment.printInfo();

        headDepartment.removeDepartment(taxCollectionDepartment);

        headDepartment.printInfo();

    }
}