package dpdev.homework_Sign_Comparator;

public class SignComparator {
    public String compare(int number){
        if (number == 0) return "Number is equal to zero";
        if (number < 0) return "Number is negative";
        else return "Number is positive";

    }
}
