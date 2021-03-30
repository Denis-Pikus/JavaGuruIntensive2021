package dpdev.romanCalculator.number.parser;

import dpdev.romanCalculator.exceptions.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumberParserImplTest {
    private Logger log = LoggerFactory.getLogger(StringToNumberParserImplTest.class);
    private StringToNumberParserImpl parser;

    @BeforeEach
    void setUp() {
        parser = new StringToNumberParserImpl();
    }

    @Test
    void parse() {
        String testArabian = "5 + 5";
        String expected = "5 + 5";
        String actual = parser.parse(testArabian);
        assertEquals(expected, actual);
        log.info("Parse arabian numbers like {} to arabian is {} ", testArabian, actual);
    }

    @Test
    void parseIllegalArgument() {
        assertThrows(ParseException.class, () -> parser.parse("error"));
        log.info("Illegal argument!");
    }
}