package java_50_Program;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        int n = 50; // upto 50 prime numbers print karenge

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
