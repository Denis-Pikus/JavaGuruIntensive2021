package dpdev.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private Logger log = LoggerFactory.getLogger(AppTest.class);
    AbstractShape[] shapes;

    @BeforeEach
    void setUp() {
        shapes = new AbstractShape[]{
                new Circle("Circle", 5.0),
                new Square("Square", 4.0),
                new Triangle("Triangle", 2.0, 3.0)
        };
    }

    @Test
    void circleArea() {
        double expected = 78.5;
        double actual = shapes[0].getArea();
        assertEquals(expected, actual, 1);
        log.info("Circle's area is {}", actual);
    }

    @Test
    void squareArea() {
        double expected = 16.0;
        double actual = shapes[1].getArea();
        assertEquals(expected, actual, 1);
        log.info("Square's area is {}", actual);
    }

    @Test
    void triangleArea() {
        double expected = 3.0;
        double actual = shapes[2].getArea();
        assertEquals(expected, actual, 1);
        log.info("Square's area is {}", actual);
    }

    @Test
    void showInfoAboutFigures() {
        Arrays.stream(shapes).forEach(System.out::println);
    }
}