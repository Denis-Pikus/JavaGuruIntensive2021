package dpdev.romanCalculator.fabrics;

import dpdev.romanCalculator.number.parser.Parser;
import dpdev.romanCalculator.number.parser.RomanNumberParserToArabianImpl;
import dpdev.romanCalculator.number.parser.StringToNumberParserImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParserFactoryTest {
    private Logger log = LoggerFactory.getLogger(ParserFactoryTest.class);
    private ParserFactory factory;

    @BeforeEach
    void setUp() {
        factory = new ParserFactory();
    }

    @Test
    void getParserRomanToArabian() {
        String test = "V + V";
        Parser expected = new RomanNumberParserToArabianImpl();
        Parser actual = factory.getParser(test);
        assertEquals(expected.getClass(), actual.getClass());
        log.info("Expected class is {}", expected.getClass());
        log.info("Actual class is {}", actual.getClass());

    }

    @Test
    void getParserToArabian() {
        String test = "5 + 5";
        Parser expected = new StringToNumberParserImpl();
        Parser actual = factory.getParser(test);
        assertEquals(expected.getClass(), actual.getClass());
        log.info("Expected class is {}", expected.getClass());
        log.info("Actual class is {}", actual.getClass());

    }
}