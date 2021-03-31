package dpdev.shape;

import java.util.Objects;

public class Square extends AbstractShape {
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", side is " + side +
                ", area is " + DECIMAL_FORMAT.format(getArea());
    }
}
