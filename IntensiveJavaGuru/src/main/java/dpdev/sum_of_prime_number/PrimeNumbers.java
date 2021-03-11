package dpdev.sum_of_prime_number;

public class PrimeNumbers {

    public int sumOfPrimeNumber(int num) {
        int sum = 0;
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (isPrimeNumber(i) == true && i != 17 && i != 71) {
                sum += i;
                count++;
                if (count == 50) break;
            }
        }
        return sum;
    }

    public boolean isPrimeNumber(int num) {
        for (int j = 2; j <= Math.floor(Math.sqrt(num)); j++) {
            if ((num % j) == 0) {
                return false;
            }
        }
        return true;
    }
}

