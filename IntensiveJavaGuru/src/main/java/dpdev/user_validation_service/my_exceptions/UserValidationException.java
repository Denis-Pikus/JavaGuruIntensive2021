package dpdev.user_validation_service.my_exceptions;

public class UserValidationException extends RuntimeException{
    public UserValidationException(String message) {
        super(message);
    }
}
