package dpdev.homework_2_palindrome.service;

import java.util.Arrays;

public class Palindrome {
    private String text;
    private String [] array;

    public boolean isPalindrome(String someString){
        char[] array = deleteNotLettersAndDigitSymbols(someString);
        char[] reverseArray = array.clone();
        swap(reverseArray);
        return Arrays.equals(array, reverseArray);
    }

    private char [] deleteNotLettersAndDigitSymbols(String str){
        StringBuilder builder = new StringBuilder();
        for(char c : str.toCharArray())
            if(Character.isLetterOrDigit(c))
                builder.append(Character.isLowerCase(c) ? c : Character.toLowerCase(c));
        return builder.toString().toCharArray();
    }

    private void swap(char[] array){
        int i = 0;
        int j = array.length - 1;
        char temp;
        while (i <= j){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i ++;
            j--;
        }
    }
}
