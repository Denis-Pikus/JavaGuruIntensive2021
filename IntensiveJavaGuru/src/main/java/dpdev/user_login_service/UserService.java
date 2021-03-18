package dpdev.user_login_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {
    private Logger log = LoggerFactory.getLogger(UserService.class);
    private User user;

    public UserService(User user) {
        this.user = user;
    }

    public boolean login(User user, String password){
        if (user.isBlocked() && !password.equals("") && password.equals(user.getPassword())) {
            user.attemptsReset();
            return true;
        }
        else {
            user.attemptReduce();
            if (user.getAttempts() == 0)
                user.isBlocked();
            return false;
        }
    }
}
