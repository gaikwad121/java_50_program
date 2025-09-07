package java_50_Program;
import java.util.*;

public class oddEvenCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter any number (0 to exit):");
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("Exit");
                break;
            }

            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        }
    }
}
