package structural.bridge;

public class Tshirt extends Cloth {

    public Tshirt(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("T-shirt is color: " + color.paint());
    }
}