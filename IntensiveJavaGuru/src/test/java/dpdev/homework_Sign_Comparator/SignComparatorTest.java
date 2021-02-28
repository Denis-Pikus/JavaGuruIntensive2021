package dpdev.homework_Sign_Comparator;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class SignComparatorTest {
    private static final Logger logger = LoggerFactory.getLogger(SignComparatorTest.class);
    private SignComparator signComparator = new SignComparator();

    @Test
    void compareTestZero() {
        String expected = "Number is equal to zero";
        String actual = signComparator.compare(0);
        assertEquals(expected, actual);
        logger.info("Number is equal to zero");
    }

    @Test
    void compareTestPositive() {
        String expected = "Number is positive";
        String actual = signComparator.compare(5);
        assertEquals(expected, actual);
        logger.info("Number is positive");
    }

    @Test
    void compareTestNegative() {
        String expected = "Number is negative";
        String actual = signComparator.compare(-5);
        assertEquals(expected, actual);
        logger.info("Number is negative");
    }
}