package dpdev.unique_word_vocabulary;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordVocabularyTest {
    private static final Logger logger = LoggerFactory.getLogger(UniqueWordVocabularyTest.class);
    private UniqueWordVocabulary uniqueWordVocabulary= new UniqueWordVocabulary();

    @Test
    void addWord() {
        uniqueWordVocabulary.addWord("murka");
        uniqueWordVocabulary.addWord("murka");
        assertEquals(1, uniqueWordVocabulary.vocabulary.size());
        logger.info(uniqueWordVocabulary.vocabulary.toString());
    }

    @Test
    void addWordNull() {
        uniqueWordVocabulary.addWord("murka");
        uniqueWordVocabulary.addWord(null);
        assertEquals(1, uniqueWordVocabulary.vocabulary.size());
        logger.info(uniqueWordVocabulary.vocabulary.toString());
    }

    @Test
    void addWordEmptyString() {
        uniqueWordVocabulary.addWord("murka");
        uniqueWordVocabulary.addWord("");
        assertEquals(1, uniqueWordVocabulary.vocabulary.size());
        logger.info(uniqueWordVocabulary.vocabulary.toString());
    }

    @Test
    void getWordsCount() {
        uniqueWordVocabulary.addWord("murka");
        uniqueWordVocabulary.addWord("4urka");
        uniqueWordVocabulary.addWord("4urka");
        assertEquals(2, uniqueWordVocabulary.getWordsCount());
        logger.info(uniqueWordVocabulary.vocabulary.toString());
    }

    @Test
    void printVocabulary() {
        uniqueWordVocabulary.addWord("murka");
        uniqueWordVocabulary.addWord("4urka");
        uniqueWordVocabulary.addWord("4urka");
        uniqueWordVocabulary.printVocabulary();
    }
}