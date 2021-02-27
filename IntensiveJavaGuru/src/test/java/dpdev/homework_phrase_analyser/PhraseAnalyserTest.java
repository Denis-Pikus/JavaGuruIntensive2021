package dpdev.homework_phrase_analyser;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class PhraseAnalyserTest {
    private static final Logger logger = LoggerFactory.getLogger(PhraseAnalyserTest.class);
    private PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

    @Test
    void analyseTestNoChance() {
        String testString = "Make themself great again";
        String expected = "It stands no chance";
        String actual = phraseAnalyser.analyse(testString);
        assertEquals(expected, actual);
        logger.info("{} - {}", testString, actual);
    }

    @Test
    void analyseTestBeWorse() {
        String testString = "I will be great again";
        String expected = "It could be worse";
        String actual = phraseAnalyser.analyse(testString);
        assertEquals(expected, actual);
        logger.info("{} - {}", testString, actual);
    }

    @Test
    void analyseTestFine() {
        String testString = "Be yourself";
        String expected = "It is fine, really";
        String actual = phraseAnalyser.analyse(testString);
        assertEquals(expected, actual);
        logger.info("{} - {}", testString, actual);
    }
}