package dpdev.user_login_service.service;

import dpdev.user_login_service.bean.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private Logger log = LoggerFactory.getLogger(UserServiceTest.class);
    User user;
    UserService userService;

    @BeforeEach
    void setUp(){
        user = new User();
        user.setLogin("qwerty");
        user.setPassword("qwerty");
        userService = new UserService(user);
    }

    @Test
    void checkUserPasswordTrue() {
        boolean actual = userService.checkUserPassword(user, "qwerty");
        assertTrue(actual);
        log.info("Password is right!");
    }

    @Test
    void checkUserPasswordFalse() {
        boolean actual = userService.checkUserPassword(user, "0000");
        assertFalse(actual);
        log.info("Password is wrong!");
    }


}