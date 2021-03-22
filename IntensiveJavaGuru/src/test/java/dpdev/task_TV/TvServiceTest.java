package dpdev.task_TV;

import dpdev.task_TV.bean.Tv;
import dpdev.task_TV.exceptions.TvException;
import dpdev.task_TV.service.TvService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class TvServiceTest {

    private Logger log = LoggerFactory.getLogger(TvServiceTest.class);
    private Tv tv;
    private TvService tvService;

    @BeforeEach
    void setUp(){
        tv = new Tv("Samsung");
        tvService = new TvService(tv);
        log.info("Tv manufacturer is {}, current channel is {}, current volume is {}, tv isOn: {}",
                tv.getManufacturer(), tv.getCurrentChannel(), tv.getCurrentVolume(), tv.isON());
    }

    @Test
    void switchChannelUp() {
        tv.setON(true);
        int expected = 1;
        tvService.switchChannelUp();
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual);
        log.info("Changed channel is {}", tv.getCurrentChannel());
    }

    @Test
    void switchChannelUpMaxChannel() {
        tv.setON(true);
        tv.setCurrentChannel(tv.MAX_CHANNEL);
        int expected = 0;
        log.info("Current channel is {}", tv.getCurrentChannel());
        tvService.switchChannelUp();
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual);
        log.info("Changed channel is {}", tv.getCurrentChannel());
    }

    @Test
    void switchChannelUpException() {
        assertThrows(TvException.class, () -> tvService.switchChannelUp());
        log.info("Tv isn't on!");
    }

    @Test
    void switchChannelDown() {
        tv.setON(true);
        int expected = 1;
        tv.setCurrentChannel(2);
        log.info("Current channel is {}", tv.getCurrentChannel());
        tvService.switchChannelDown();
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual);
        log.info("Changed channel is {}", tv.getCurrentChannel());
    }

    @Test
    void switchChannelDownMinChannel() {
        tv.setON(true);
        tv.setCurrentChannel(tv.MIN_CHANNEL);
        int expected = 100;
        log.info("Current channel is {}", tv.getCurrentChannel());
        tvService.switchChannelDown();
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual);
        log.info("Changed channel is {}", tv.getCurrentChannel());
    }

    @Test
    void switchChannelDownException() {
        assertThrows(TvException.class, () -> tvService.switchChannelDown());
        log.info("Tv isn't on!");
    }

    @Test
    void switchVolumeUp() {
        tv.setON(true);
        int expected = 1;
        tvService.switchVolumeUp();
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual);
        log.info("Changed volume is {}", tv.getCurrentVolume());
    }

    @Test
    void switchVolumeUpMax() {
        tv.setON(true);
        int expected = 10;
        tv.setCurrentVolume(tv.MAX_VOLUME);
        log.info("Current volume is {}", tv.getCurrentVolume());
        tvService.switchVolumeUp();
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual);
        log.info("Changed channel is {}", tv.getCurrentVolume());
    }

    @Test
    void switchVolumeUpException() {
        assertThrows(TvException.class, () -> tvService.switchVolumeUp());
        log.info("Tv isn't on!");
    }

    @Test
    void switchVolumeDown() {
        tv.setON(true);
        int expected = 1;
        tv.setCurrentVolume(2);
        log.info("Current volume is {}", tv.getCurrentVolume());
        tvService.switchVolumeDown();
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual);
        log.info("Changed volume is {}", tv.getCurrentVolume());
    }

    @Test
    void switchVolumeDownMin() {
        tv.setON(true);
        int expected = 0;
        log.info("Current volume is {}", tv.getCurrentVolume());
        tvService.switchVolumeDown();
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual);
        log.info("Changed volume is {}", tv.getCurrentVolume());
    }

    @Test
    void switchVolumeDownException() {
        assertThrows(TvException.class, () -> tvService.switchVolumeDown());
        log.info("Tv isn't on!");
    }

    @Test
    void turnOnTv() {
        log.info("Current status TV is {}", tv.isON());
        tvService.turnOnTv();
        boolean actual = tv.isON();
        assertTrue(actual);
        log.info("Changed status TV is {}", tv.isON());
    }

    @Test
    void turnOffTv() {
        tv.setON(true);
        log.info("Current status TV is {}", tv.isON());
        tvService.turnOffTv();
        boolean actual = tv.isON();
        assertFalse(actual);
        log.info("Changed status TV is {}", tv.isON());
    }
}