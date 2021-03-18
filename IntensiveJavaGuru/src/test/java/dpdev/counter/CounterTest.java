package dpdev.counter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    Logger log = LoggerFactory.getLogger(CounterTest.class);
    Counter counter;

    @BeforeEach
    void  setUp() {
        counter = new Counter();
    }

    @Test
    void increment() {
        counter.setValue(50);
        log.info("Start value equals {}", counter.getValue());
        counter.setStep(10);
        log.info("Start step equals {}", counter.getStep());
        int expected = 60;
        counter.increment();
        log.info("Modified value equals {}", counter.getValue());
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    void decrement() {
        counter.setValue(50);
        log.info("Start value equals {}", counter.getValue());
        counter.setStep(10);
        log.info("Start step equals {}", counter.getStep());
        int expected = 40;
        counter.decrement();
        log.info("Modified value equals {}", counter.getValue());
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    void reset() {
        counter.setValue(50);
        log.info("Start value equals {}", counter.getValue());
        counter.setStep(10);
        log.info("Start step equals {}", counter.getStep());
        int expectedValue = 0;
        int expectedStep = 1;
        counter.reset();
        log.info("Modified value equals {}", counter.getValue());
        log.info("Modified step equals {}", counter.getStep());
        int actualValue = counter.getValue();
        int actualStep = counter.getStep();
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedStep, actualStep);
    }

    @Test
    void setValue() {
        log.info("Start value equals {}", counter.getValue());
        int expected = 50;
        counter.setValue(50);
        log.info("Modified value equals {}", counter.getValue());
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    void setValueLessZero() {
        log.info("Start value equals {}", counter.getValue());
        int expected = 0;
        counter.setValue(-1);
        log.info("Modified value equals {}", counter.getValue());
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    void setValueMoreHundred() {
        log.info("Start value equals {}", counter.getValue());
        int expected = 0;
        counter.setValue(101);
        log.info("Modified value equals {}", counter.getValue());
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    void getValue() {
        counter.setValue(50);
        log.info("Start value equals {}", counter.getValue());
        int expected = 50;
        counter.getValue();
        int actual = counter.getValue();
        assertEquals(expected, actual);
    }

    @Test
    void setStep() {
        log.info("Start step equals {}", counter.getStep());
        counter.setStep(5);
        int expected = 5;
        log.info("Modified step equals {}", counter.getStep());
        int actual = counter.getStep();
        assertEquals(expected, actual);
    }

    @Test
    void setStepLessZero() {
        log.info("Start step equals {}", counter.getStep());
        counter.setStep(-1);
        int expected = 1;
        log.info("Modified step equals {}", counter.getStep());
        int actual = counter.getStep();
        assertEquals(expected, actual);
    }

    @Test
    void setStepMoreTen() {
        log.info("Start step equals {}", counter.getStep());
        counter.setStep(11);
        int expected = 1;
        log.info("Modified step equals {}", counter.getStep());
        int actual = counter.getStep();
        assertEquals(expected, actual);
    }

    @Test
    void getStep() {
        counter.setStep(5);
        log.info("Start step equals {}", counter.getStep());
        int expected = 5;
        counter.getStep();
        int actual = counter.getStep();
        assertEquals(expected, actual);
    }
}