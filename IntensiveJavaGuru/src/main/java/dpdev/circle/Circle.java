package dpdev.circle;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius >= 0)
        this.radius = radius;
        else throw new IllegalArgumentException("Wrong argument!");
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(this.radius, 2.0);
    }
}
