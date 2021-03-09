package dpdev.user_login_service.service;

import dpdev.user_login_service.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {
    private Logger log = LoggerFactory.getLogger(UserService.class);
    private User user;

    public UserService(User user) {
        this.user = user;
    }

    public boolean checkUserPassword(User user, String password){
        if (!user.isBlocked() && !password.equals("") && password.equals(user.getPassword())) {
            user.resetAttempts();
            return true;
        }
        else {
            user.setAttempts(user.getAttempts() -1);
            if (user.getAttempts() == 0)
                user.toBlockUser();
            return false;
        }
    }
}
