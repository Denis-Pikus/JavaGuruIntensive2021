package dpdev.shape;

public class Triangle extends AbstractShape {
    private double side;
    private double height;

    public Triangle(String name, double side, double height) {
        super(name);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (side * height) / 2;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", side is " + side +
                " and height is " + height +
                ", area is " + DECIMAL_FORMAT.format(getArea());
    }
}
