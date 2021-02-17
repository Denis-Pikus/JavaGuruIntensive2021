package dpdev.homework_1.operations;

import java.util.Random;

public class Calculator {

    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static double divide(int a, int b) {
        if (a == 0) {
            throw new ArithmeticException("Divide by zero!");
        } else {
            return (double) a / b;
        }
    }

    public static int [] randomNumbersGenerator(){
        return new Random().ints(3, 1, 11).toArray();
    }
}
