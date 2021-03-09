package dpdev.Unique_word_counter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterTest {
    UniqueWordCounter wordCounter = new UniqueWordCounter();
    Logger logger = LoggerFactory.getLogger(UniqueWordCounterTest.class);

    @Test
    public void addWordTest(){
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("orange");
        assertEquals(2, wordCounter.map.size());
        logger.info(wordCounter.map.toString());
    }

    @Test
    public void getMostFrequentWordTest(){
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("orange");
        assertEquals(2, wordCounter.map.size());
        logger.info(wordCounter.map.toString());
    }

    @Test
    public void printWordsFrequencytest(){
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("orange");
        wordCounter.printWordsFrequency();
        logger.info(wordCounter.map.toString());
    }
}