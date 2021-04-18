package dpdev.crack_the_PIN;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(PinCracker.crack("827ccb0eea8a706c4c34a16891f84e7b"));
        System.out.println(PinCracker.crack("86aa400b65433b608a9db30070ec60cd"));

    }
}
