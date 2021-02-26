package structural.bridge;

import java.awt.*;

public abstract class Cloth {

    Color color;

    public Cloth(Color color) {
        this.color = color;
    }

    abstract void draw();
}