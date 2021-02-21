package dpdev.homework_2_palindrome;

import dpdev.homework_2_palindrome.service.Palindrome;

public class PalindromeDemo {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("А роза упала на лапу Азора"));
    }
}
