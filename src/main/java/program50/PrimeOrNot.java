package program50;

public class PrimeOrNot {
    public static void main(String[] args) {
        int number = 7;
        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;  // Found a divisor, not prime
            }
        }

        return true;  // No divisors found, it's prime
    }
}
