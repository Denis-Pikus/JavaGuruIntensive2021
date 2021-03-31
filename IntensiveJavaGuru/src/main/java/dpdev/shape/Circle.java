package dpdev.shape;

import java.util.Objects;

public class Circle extends AbstractShape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius is " + radius +
                ", area is " + DECIMAL_FORMAT.format(getArea());
    }
}
