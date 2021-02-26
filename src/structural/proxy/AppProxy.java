package structural.proxy;

public class AppProxy {

    public static void main(String[] args) {
        OfficeInternetAccess internetAccess = new ProxyInternetAccess("Tom");
        internetAccess.grantInternetAccess();
    }
}
