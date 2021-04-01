package dpdev.pascal_triangle.Bean;

import java.math.BigInteger;

public class Diagonal {
    private BigInteger[][] pascalTriangle;

    public Diagonal() {

    }

    public BigInteger diagonal(int n, int p) {
        BigInteger sum = BigInteger.ZERO;
        if (n > 0 && p > 0 && n > p) {
            pascalTriangle = pascalArray(n);
            show();
        } else throw new IllegalArgumentException("Bad arguments!");
        for (int i = 0; i < n - p + 1; i++) {
            sum = sum.add(pascalTriangle[i][p]);
        }
        return sum;
    }

    private BigInteger[][] pascalArray(int n) {
        pascalTriangle = new BigInteger[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            this.pascalTriangle[i][0] = this.pascalTriangle[i][i] = BigInteger.ONE;
            for (int j = 1; j < i; j++) {
                this.pascalTriangle[i][j] =
                        this.pascalTriangle[i - 1][j - 1].add(this.pascalTriangle[i - 1][j]);
            }
        }
        return this.pascalTriangle;
    }

    public void show() {
        for (int i = 0; i < this.pascalTriangle.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(this.pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
