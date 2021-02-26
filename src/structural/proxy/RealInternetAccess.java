package structural.proxy;

public class RealInternetAccess implements OfficeInternetAccess {

    private String nameEmployee;

    public RealInternetAccess(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }


    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: " + nameEmployee);
    }
}
