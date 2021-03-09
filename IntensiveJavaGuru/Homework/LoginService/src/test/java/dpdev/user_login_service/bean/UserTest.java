package dpdev.user_login_service.bean;

import dpdev.user_login_service.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private Logger log = LoggerFactory.getLogger(UserTest.class);
    User user;

    @BeforeEach
    void setUp(){
        user = new User();
        user.setLogin("qwerty");
        user.setPassword("qwerty");
        user.setAttempts(1);
    }

    @Test
    void resetAttempts() {
        int expected = 3;
        log.info("Current attempts is: {}", user.getAttempts());
        user.resetAttempts();
        int actual = user.getAttempts();
        log.info("Attempts before after is: {}", user.getAttempts());
        assertEquals(expected, actual);
    }

    @Test
    void toBlockUser() {
        log.info("User block status is: {}", user.isBlocked());
        user.toBlockUser();
        log.info("User block status after modify is: {}", user.isBlocked());
    }
}