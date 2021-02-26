package structural.proxy;

import java.util.Random;

public class ProxyInternetAccess implements OfficeInternetAccess {

    private String employeeName;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) < 3)
            System.out.println("No Internet access granted. Your job level is below 3.");
        else {
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        }
    }

    public int getRole(String employeeName) {
        // Check role from the database based on Name and designation
        // return job level or job designation.
        Random r = new Random();
        return r.nextInt()+10;
    }
}
