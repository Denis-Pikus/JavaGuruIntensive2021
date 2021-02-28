package dpdev.homework_2.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {
    Logger logger = LoggerFactory.getLogger(ArrayServiceTest.class);
    ArrayService arrayService = new ArrayService();

    @Test
    void create() {
        int expected = 5;
        int[] actual = arrayService.create(5);
        assertEquals(actual.length, expected);
        logger.info("Created array which size {}", actual.length);
    }

    @Test
    void createNegativeArgument() {
        assertThrows(NegativeArraySizeException.class, () -> arrayService.create(-1));
        logger.info("It impossible to create array which negative size!");
    }

    @Test
    void fillRandomly() {
        int expected = 50;
        int[] actualArray = new int[50];
        arrayService.fillRandomly(actualArray);
        assertEquals(actualArray.length, expected);
        logger.info("Created array which size {}", actualArray.length);
        int minimum = Arrays.stream(actualArray).min().getAsInt();
        int maximum = Arrays.stream(actualArray).max().getAsInt();
        boolean actualMinBorder = minimum >= 0;
        boolean actualMaxBorder = maximum <= 100;
        assertTrue(actualMinBorder);
        logger.info("Minimal border's >= 0.");
        assertTrue(actualMaxBorder);
        logger.info("Maximal border's <= 100.");
    }

    @Test
    void printArray() {

    }

    @Test
    void sum() {
        int expected = 11;
        int[] array = {5, 6};
        int actual = arrayService.sum(array);
        assertEquals(expected, actual);
        logger.info("Sum array {} is: {}", Arrays.toString(array), arrayService.sum(array));
    }

    @Test
    void avg() {
        double expected = 1.333;
        int[] array = {-1, 2, 3};
        double actual = arrayService.avg(array);
        assertEquals(expected, actual, 0.001);
        logger.info("Avg array {} is: {}", Arrays.toString(array), arrayService.avg(array));
    }

    @Test
    void avgEmptyArray() {
        double expected = 0.0;
        int[] array = new int[0];
        double actual = arrayService.avg(array);
        assertEquals(expected, actual);
        logger.info("Avg array {} is: {}", Arrays.toString(array), arrayService.avg(array));
    }

    @Test
    void sort() {
        int[] testArray = {2, 0, 1, 5};
        int[] expected = {0, 1, 2, 5};
        logger.info("Unsorted array is: {}", Arrays.toString(testArray));
        arrayService.sort(testArray);
        assertArrayEquals(expected, testArray);
        logger.info("Sorted array is: {}", Arrays.toString(testArray));
    }

    @Test
    void swap() {
        int[] testArray = {2, 0, 1, 5};
        int[] expected = {5, 1, 0, 2};
        logger.info("Original array is: {}", Arrays.toString(testArray));
        arrayService.swap(testArray);
        assertArrayEquals(expected, testArray);
        logger.info("Swapped array is: {}", Arrays.toString(testArray));
    }
}