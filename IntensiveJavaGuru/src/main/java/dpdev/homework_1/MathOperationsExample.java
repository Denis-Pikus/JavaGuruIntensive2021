package dpdev.homework_1;

import dpdev.homework_1.operations.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class MathOperationsExample {
    static Logger logger = LoggerFactory.getLogger(MathOperationsExample.class);
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 3;
        logger.info("Addition of numbers: {} + {} = {}", a, b, Calculator.addition(a, b));
        logger.info("Subtraction of numbers: {} - {} = {}", a, b, Calculator.subtraction(a, b));
        logger.info("Multiplication of numbers: {} * {} = {}", a, b, Calculator.multiplication(a, b));
        logger.info("Division of numbers:{} / {} = {}", a, b, Calculator.divide(a, b));
        int[] randomNumbersArray = Calculator.randomNumbersGenerator();
        logger.info("{}, {}, {}", randomNumbersArray[0], randomNumbersArray[1], randomNumbersArray[2]);
        logger.info("Addition of numbers = {}", Arrays.stream(randomNumbersArray).sum());
    }
}
