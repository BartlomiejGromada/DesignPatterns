package structural.bridge;

public class Jeans extends Cloth {

    public Jeans(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Jeans is: " + color.paint());
    }
}