package dpdev.romanCalculator.bean;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    Logger log = LoggerFactory.getLogger(MultiplyTest.class);
    @Test
    void calculate() {
        Multiply multiply = new Multiply();
        int expected = 6;
        int actual = multiply.calculate("2 * 3");
        assertEquals(expected, actual);
        log.info("Expression 2 * 3 = {}", actual);
    }
}