package dpdev.romanCalculator.number.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArabianNumberParserToRomanTest {
    private Logger log = LoggerFactory.getLogger(ArabianNumberParserToRomanTest.class);
    private ArabianNumberParserToRoman parser;

    @BeforeEach
    void setUp(){
        parser = new ArabianNumberParserToRoman();
    }

    @Test
    void arabicToRoman() {
        String expected = "X";
        String actual = parser.arabicToRoman(10);
        log.info("expected = {}, actual = {}", expected, actual);
        assertEquals(expected, actual);
    }
}