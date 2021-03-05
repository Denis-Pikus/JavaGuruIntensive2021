package dpdev.color_detector;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class LightColorDetectorTest {
    private static final Logger log = LoggerFactory.getLogger(LightColorDetectorTest.class);
    private LightColorDetector detector = new LightColorDetector();

    @Test
    void detectInvisibleLight() {
        String expected = "Invisible Light";
        int minWave = 300;
        int maxWave = 800;
        String actual = detector.detect(minWave);
        assertEquals(expected, actual);
        log.info("Wave {} is {}", minWave, actual);
        String actual1 = detector.detect(maxWave);
        assertEquals(expected, actual);
        log.info("Wave {} is {}", maxWave, actual1);
    }

    @Test
    void detectViolet() {
        String expected = "Violet";
        int wave = 381;
        String actual = detector.detect(wave);
        assertEquals(expected, actual);
        log.info("Wave {} is {}", wave, actual);
    }

    @Test
    void detectGreen() {
        String expected = "Green";
        int wave = 500;
        String actual = detector.detect(wave);
        assertEquals(expected, actual);
        log.info("Wave {} is {}", wave, actual);
    }

    @Test
    void detectYellow() {
        String expected = "Yellow";
        int wave = 570;
        String actual = detector.detect(wave);
        assertEquals(expected, actual);
        log.info("Wave {} is {}", wave, actual);
    }

    @Test
    void detectOrange() {
        String expected = "Orange";
        int wave = 600;
        String actual = detector.detect(wave);
        assertEquals(expected, actual);
        log.info("Wave {} is {}", wave, actual);
    }

    @Test
    void detectRed() {
        String expected = "Red";
        int wave = 700;
        String actual = detector.detect(wave);
        assertEquals(expected, actual);
        log.info("Wave {} is {}", wave, actual);
    }
}