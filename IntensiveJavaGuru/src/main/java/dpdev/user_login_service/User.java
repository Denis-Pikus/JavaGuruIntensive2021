package dpdev.user_login_service;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private boolean isBlocked;
    private int attempts = 3;

    public User() {
    }

    public void blockedUser(){
        if (attempts == 0) isBlocked = true;
    }

    public void attemptsReset(){
        if (isBlocked == true)
            attempts = 3;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void attemptReduce(){
        attempts--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isBlocked=" + isBlocked +
                ", attempts=" + attempts +
                '}';
    }

    public int getAttempts() {
        return attempts;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
