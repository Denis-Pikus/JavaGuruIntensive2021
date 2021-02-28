package dpdev.homework_2_palindrome.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    Logger logger = LoggerFactory.getLogger(PalindromeTest.class);
    Palindrome palindrome = new Palindrome();

    @Test
    public void testDeleteNotLettersAndDigitSymbols() {
        char[] expected = "11211".toCharArray();
        String testString = "11,?2  1.1/ ";
        logger.info("Test string {}", testString);
        char[] actual = palindrome.deleteNotLettersAndDigitSymbols(testString);
        assertArrayEquals(expected, actual);
        logger.info("Modified string {}", actual.toString());
    }

    @Test
    public void swap() {
        char[] testArray = "123".toCharArray();
        char[] expected = "321".toCharArray();
        logger.info("Original array is: {}", Arrays.toString(testArray));
        palindrome.swap(testArray);
        assertArrayEquals(expected, testArray);
        logger.info("Swapped array is: {}", Arrays.toString(testArray));
    }

    @Test
    public void testIsPalindromeTrue() {
        String testString = "-1 /2 *, 21!";
        assertTrue(palindrome.isPalindrome(testString));
        logger.info("Input string is palindrome.");
    }

    @Test
    public void testIsPalindromeFalse() {
        String testString = "-1 /2 *, 21!1";
        assertFalse(palindrome.isPalindrome(testString));
        logger.info("Input string isn't palindrome.");
    }
}