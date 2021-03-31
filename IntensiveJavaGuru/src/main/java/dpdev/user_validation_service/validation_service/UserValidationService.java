package dpdev.user_validation_service.validation_service;

import dpdev.user_validation_service.bean.User;
import dpdev.user_validation_service.my_exceptions.UserValidationException;

public class UserValidationService {
    private User user;

    public void validate(User user) throws UserValidationException{
        if (user.getAge() < 0 || user.getAge() > 120 ||
            user.getFirstName().length() < 3 || user.getFirstName().length() > 15 ||
                user.getLastName().length() < 3 || user.getLastName().length() > 15)
            throw new UserValidationException("You inputted wrong arguments!");
    }
}
