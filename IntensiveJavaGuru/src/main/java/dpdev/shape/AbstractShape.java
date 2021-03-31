package dpdev.shape;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class AbstractShape implements Shape {
    protected DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");
    private String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public abstract double getArea();

    @Override
    public String toString() {
        return "Geometric figure: " + name;
    }
}
