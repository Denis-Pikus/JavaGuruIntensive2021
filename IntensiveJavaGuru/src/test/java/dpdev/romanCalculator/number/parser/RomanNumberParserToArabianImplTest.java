package dpdev.romanCalculator.number.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberParserToArabianImplTest {
    private Logger log = LoggerFactory.getLogger(RomanNumberParserToArabianImplTest.class);
    private RomanNumberParserToArabianImpl parser;
    @BeforeEach
    void setUp(){
        parser = new RomanNumberParserToArabianImpl();
    }

    @Test
    void parse() {
        String testRoman = "V + V";
        String expected = "5 + 5";
        String actual = parser.parse(testRoman);
        assertEquals(expected, actual);
        log.info("Parse roman numbers like {} to arabian is {} ", testRoman, actual);
    }

    @Test
    void romanToArabic() {
        String expected = "13";
        String test = "XIII";
        String actual = parser.romanToArabic(test);
        assertEquals(expected, actual);
        log.info("Roman number {} is arabian number {}", test, actual);
    }
}