package dpdev.sum_of_prime_number;

public class PrimeNumbers {

    public int sumOfPrimeNumber(int num){
        int sum = 0;
        int count = 0;
        for (int i = 2; i <= num; i++){
            boolean isPrime = true;
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j ++) {
                if ((i % j) == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i != 17 && i != 71){
                sum += i;
                count++;
            }
            if (count == 50) break;
        }
        return sum;
    }
}
