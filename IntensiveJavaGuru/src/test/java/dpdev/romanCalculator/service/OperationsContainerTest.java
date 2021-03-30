package dpdev.romanCalculator.service;

import dpdev.romanCalculator.bean.*;
import dpdev.romanCalculator.exceptions.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OperationsContainerTest {
    private Logger log = LoggerFactory.getLogger(OperationsContainerTest.class);
    private OperationsContainer operationsContainer;

    @BeforeEach
    void setUp() {
        operationsContainer = new OperationsContainer();
    }

    @Test
    void retrieveMathOperationMult() {
        String test = "*";
        MathOperation mult = new Multiply();
        MathOperation actual = operationsContainer.retrieveMathOperation(test);
        assertEquals(mult.getClass(), actual.getClass());
    }

    @Test
    void retrieveMathOperationDev() {
        String test = "/";
        MathOperation dev = new Devision();
        MathOperation actual = operationsContainer.retrieveMathOperation(test);
        assertEquals(dev.getClass(), actual.getClass());
    }

    @Test
    void retrieveMathOperationAdd() {
        String test = "+";
        MathOperation add = new Addition();
        MathOperation actual = operationsContainer.retrieveMathOperation(test);
        assertEquals(add.getClass(), actual.getClass());
    }

    @Test
    void retrieveMathOperationSub() {
        String test = "-";
        MathOperation sub = new Subtraction();
        MathOperation actual = operationsContainer.retrieveMathOperation(test);
        assertEquals(sub.getClass(), actual.getClass());
    }

    @Test
    void parseIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> operationsContainer.retrieveMathOperation("error"));
        log.info("You inputted wrong mathematics operation");
    }
}