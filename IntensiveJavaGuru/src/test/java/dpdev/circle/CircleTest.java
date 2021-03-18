package dpdev.circle;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CircleTest {
    Logger log = LoggerFactory.getLogger(CircleTest.class);
    Circle circle = new Circle(2);

    @Test
    void calculateArea() {
        double expected = 12.56;
        double actual = circle.calculateArea();
        assertEquals(expected, actual, 2);
        log.info("Circle area with radius {} equals {}", circle.getRadius(), actual);
    }

    @Test
    void circleInstanceLessThenZero() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1.0));
        log.info("You inputted wrong argument!");
    }
}