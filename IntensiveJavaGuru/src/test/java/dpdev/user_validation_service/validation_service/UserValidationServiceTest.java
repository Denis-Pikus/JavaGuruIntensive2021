package dpdev.user_validation_service.validation_service;

import dpdev.homework_1.operations.Calculator;
import dpdev.user_validation_service.bean.User;
import dpdev.user_validation_service.my_exceptions.UserValidationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationServiceTest {
    private Logger log = LoggerFactory.getLogger(UserValidationServiceTest.class);
    private User user;
    private UserValidationService service;

    @BeforeEach
    void setUp() {
        service = new UserValidationService();
    }

    @Test
    void validateFirstNameError() {
        user = new User("Li", "Petrov", 20);
        Exception exception = assertThrows(UserValidationException.class, () -> service.validate(user));
        assertEquals("You inputted wrong arguments!", exception.getMessage());
        log.info(exception.getMessage());
    }

    @Test
    void validateLastNameError() {
        user = new User("Petr", "Li", 20);
        Exception exception = assertThrows(UserValidationException.class, () -> service.validate(user));
        assertEquals("You inputted wrong arguments!", exception.getMessage());
        log.info(exception.getMessage());
    }

    @Test
    void validateMinAgeError() {
        user = new User("Petr", "Petrov", -1);
        Exception exception = assertThrows(UserValidationException.class, () -> service.validate(user));
        assertEquals("You inputted wrong arguments!", exception.getMessage());
        log.info(exception.getMessage());
    }

    @Test
    void validateMaxAgeError() {
        user = new User("Petr", "Petrov", 130);
        Exception exception = assertThrows(UserValidationException.class, () -> service.validate(user));
        assertEquals("You inputted wrong arguments!", exception.getMessage());
        log.info(exception.getMessage());
    }
}