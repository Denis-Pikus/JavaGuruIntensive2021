package dpdev.homework_2_palindrome.service;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PalindromeTest extends TestCase {
    Logger logger = LoggerFactory.getLogger(PalindromeTest.class);
    Palindrome palindrome = new Palindrome();

    @Test
    public void testDeleteNotLettersAndDigitSymbols() {
        char[] expected = "11211".toCharArray();
        String testString = "11,?2  1.1/ ";
        logger.info("Test string {}", testString);
        char[] actual = palindrome.deleteNotLettersAndDigitSymbols(testString);
        Assert.assertArrayEquals(expected, actual);
        logger.info("Modified string {}", actual.toString());
    }

//    @Test
//    void swap() {
//        int[] testArray = {2, 0, 1, 5};
//        int[] expected = {5, 1, 0, 2};
//        logger.info("Original array is: {}", Arrays.toString(testArray));
//        arrayService.swap(testArray);
//        assertArrayEquals(expected, testArray);
//        logger.info("Swapped array is: {}", Arrays.toString(testArray));
//    }

    @Test
    public void testIsPalindrome() {

    }
}