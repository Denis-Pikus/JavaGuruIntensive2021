package dpdev.crack_the_PIN;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PinCracker {

    public static String crack(String hash) {
        for (int i = 0; i < 100000; i++) {
            String password = String.valueOf(i);
            while (password.length() < 5) {
                password = "0" + password;
            }
            String hashNum = getHashCode(password);
            if (hashNum.equalsIgnoreCase(hash)) {
                return password;
            }
        }
        return null;
    }

    private static String getHashCode(String str) {
        MessageDigest messageDigest = null;
        StringBuilder sb = new StringBuilder();
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            byte[] digest = messageDigest.digest(str.getBytes());
            for (byte b : digest) {
                sb.append(String.format("%02X", b));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
