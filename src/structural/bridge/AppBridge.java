package structural.bridge;

public class AppBridge {

    public static void main(String[] args) {
        Cloth tshirt = new Tshirt(new Red());
        Cloth jeans = new Jeans(new GREEN());

        tshirt.draw();
        jeans.draw();
    }
}