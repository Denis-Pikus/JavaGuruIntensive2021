package dpdev.romanCalculator.bean;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    Logger log = LoggerFactory.getLogger(AdditionTest.class);
    @Test
    void calculate() {
        Addition addition = new Addition();
        int expected = 5;
        int actual = addition.calculate("2 + 3");
        assertEquals(expected, actual);
        log.info("Expression 2 + 3 = {}", actual);

    }
}