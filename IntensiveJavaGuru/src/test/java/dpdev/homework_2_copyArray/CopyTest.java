package dpdev.homework_2_copyArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CopyTest {

    private static final Logger logger = LoggerFactory.getLogger(CopyTest.class);
    private Copy copy = new Copy();

    @Test
    void copyTest() {
        int[] testArray = {-10, 0, 11, 50, -5, 40, 22, 12, -11, 5000};
        int[] expected = {-10, 0, 11, -5, 40, 22, 12};
        int[] actual = copy.copyArrayOfRange(testArray, -10, 40);
        Assertions.assertArrayEquals(expected, actual);
        logger.info("Test array is: {}", testArray);
        logger.info("Created array by method copyArrayOfRange: {} ", actual);
    }

    @Test
    void copyTestEmptyInputArray() {
        int[] testArray = new int[0];
        int[] expected = new int[0];
        int[] actual = copy.copyArrayOfRange(testArray, -10, 40);
        Assertions.assertArrayEquals(expected, actual);
        logger.info("Test array is: {}", testArray);
        logger.info("Created array by method copyArrayOfRange: {} is empty", actual);
    }

    @Test
    void copyTestRangeOutOfArrayElements() {
        int[] testArray = {-10, 0, 11, 50, -5, 40, 22, 12, -11, 5000};
        int[] expected = {};
        int[] actual = copy.copyArrayOfRange(testArray, -100, -50);
        Assertions.assertArrayEquals(expected, actual);
        logger.info("Test array is: {}", testArray);
        logger.info("Created array by method copyArrayOfRange: {} is empty", actual);
    }
}