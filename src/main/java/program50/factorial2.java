package program50;

import java.math.BigInteger;

 public class factorial2 {
    public static void main(String[] args) {
        // Convert int to BigInteger
        BigInteger num = BigInteger.valueOf(56);
        BigInteger fact = fact(num);

        System.out.println("The factorial is: " + fact);
    }

    // Method to calculate factorial using BigInteger
    public static BigInteger fact(BigInteger num) {
        BigInteger factorial = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
            factorial = factorial.multiply(i);
        }

        return factorial;
    }
}
