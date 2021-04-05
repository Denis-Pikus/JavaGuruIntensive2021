package dpdev.pascal_triangle.Bean;

public class Diagonal {

    public static int diagonal(int n, int p) {
        int[][] array = createArray(n);
        show(array);
        if (n > 0 && p > 0 && n > p) {
            int sum = 0;
            for (int i = 0; i < (n - p + 1); i++) {
                sum += array[i][p];
            }
            return sum;
        } else throw new IllegalArgumentException("Bad arguments!");
    }

    private static int[][] createArray(int n) {
        int[][] array = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            array[i][0] = 1;
        }
        for (int j = 0; j < n + 1; j++) {
            array[0][j] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                array[i][j] = array[i][j - 1] + array[i - 1][j];
            }
        }
        return array;
    }

    public static void show(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
