package dpdev.unique_word_counter;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterTest {
    Logger logger = LoggerFactory.getLogger(UniqueWordCounter.class);
    UniqueWordCounter wordCounter = new UniqueWordCounter();

    @Test
    void addWord() {
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("orange");
        assertEquals(2, wordCounter.map.size());
        logger.info(wordCounter.map.toString());
    }

    @Test
    void getMostFrequentWord() {
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("orange");
        assertEquals("apple", wordCounter.getMostFrequentWord());
        logger.info(wordCounter.map.toString());
    }

    @Test
    void printWordsFrequency() {
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("orange");
        wordCounter.printWordsFrequency();
    }
}