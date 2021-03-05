package dpdev.magic_ball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class MagicBallTest {
    private static final Logger log = LoggerFactory.getLogger(MagicBallTest.class);
    private MagicBall magicBall = new MagicBall();

    @Test
    void getAnswer() {
        for (int i = 0; i < 20; i++) {
            String question = "Завтра будет хорошая погода?";
            log.info(question);
            String actual = magicBall.getAnswer(question);
            assertNotNull(actual);
            log.info(actual);
        }
    }
}