package dpdev.sum_of_prime_number;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {
    Logger log = LoggerFactory.getLogger(PrimeNumbersTest.class);
    PrimeNumbers primeNumbers = new PrimeNumbers();

    @Test
    void sumOfPrimeNumber() {
        int expected = 5501;
        int actual = primeNumbers.sumOfPrimeNumber(500);
        assertEquals(expected, actual);
        log.info("Sum of first 50's prime numbers of number 500 equals {} without numbers 17 and 71", actual);
    }

    @Test
    void sumOfPrime_10_Number() {
        int expected = 17;
        int actual = primeNumbers.sumOfPrimeNumber(10);
        assertEquals(expected, actual);
        log.info("Sum of prime numbers of number 10 equals {}", actual);
    }

    @Test
    void isPrimeNumberTrue() {
        assertTrue(primeNumbers.isPrimeNumber(3));
        log.info("3 is prime number.");
    }

    @Test
    void isPrimeNumberFalse() {
        assertFalse(primeNumbers.isPrimeNumber(4));
        log.info("4 isn't prime number.");
    }

}