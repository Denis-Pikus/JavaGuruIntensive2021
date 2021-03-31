package dpdev.pascal_triangle;

import dpdev.pascal_triangle.Bean.Diagonal;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Diagonal diagonal = new Diagonal();
        BigInteger diagonal1 = diagonal.diagonal(9, 7);
        diagonal.show();
        System.out.println(diagonal1);
    }
}
