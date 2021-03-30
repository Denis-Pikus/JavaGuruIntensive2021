package dpdev.romanCalculator.bean;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {
    Logger log = LoggerFactory.getLogger(SubtractionTest.class);
    @Test
    void calculate() {
        Subtraction subtraction = new Subtraction();
        int expected = -1;
        int actual = subtraction.calculate("2 - 3");
        assertEquals(expected, actual);
        log.info("Expression 2 - 3 = {}", actual);
    }
}