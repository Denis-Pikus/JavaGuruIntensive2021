package dpdev.romanCalculator.bean;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class DevisionTest {
    Logger log = LoggerFactory.getLogger(DevisionTest.class);
    @Test
    void calculate() {
        Devision devision = new Devision();
        int expected = 5;
        int actual = devision.calculate("10 / 2");
        assertEquals(expected, actual);
        log.info("Expression 10 / 2 = {}", actual);
    }
}