package dpdev.homework_1.operations;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest{
    static Logger logger = LoggerFactory.getLogger(CalculatorTest.class);

    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int expectedResult = a + b;
        int actualResult = Calculator.addition(a, b);
        assertEquals(expectedResult, actualResult);
        logger.info("{} + {} = {}", a, b, a + b);
    }

    @Test
    public void testSubtraction() {
        int a = 5;
        int b = 3;
        int expectedResult = a - b;
        int actualResult = Calculator.subtraction(a, b);
        assertEquals(expectedResult, actualResult);
        logger.info("{} - {} = {}", a, b, a - b);
    }

    @Test
    public void testMultiplication() {
        int a = 5;
        int b = 3;
        int expectedResult = a * b;
        int actualResult = Calculator.multiplication(a, b);
        assertEquals(expectedResult, actualResult);
        logger.info("{} * {} = {}", a, b, a * b);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () ->Calculator.divide(5, 0));
    }

    @Test
    public void testDivide() throws Exception {
        int a = 5;
        int b = 3;
        double expectedResult = (double) a / b;
        double actualResult = Calculator.divide(a, b);
        assertEquals(actualResult, expectedResult, 3);
        logger.info("{} / {} = {}", a, b, a / b);
    }

    @Test
    public void testRandomNumbersGenerator() {
        int expectedResult = 3;
        int actualResult = Calculator.randomNumbersGenerator().length;
        assertEquals(expectedResult, actualResult);
        logger.info("Test passed");
    }

    @Test
    public void testRandomNumbersGeneratorLeftBorder() {
        int leftBorder = 1;
        int actualResult = Calculator.randomNumbersGenerator().length;
        boolean expectedResult = leftBorder <= actualResult;
        assertTrue(expectedResult);
        logger.info("Test passed");
    }

    @Test
    public void testRandomNumbersGeneratorRightBorder() {
        int rightBorder = 10;
        int actualResult = Calculator.randomNumbersGenerator().length;
        boolean expectedResult = rightBorder >= actualResult;
        assertTrue(expectedResult);
        logger.info("Test passed");
    }
}