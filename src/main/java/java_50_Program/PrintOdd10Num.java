package java_50_Program;

public class PrintOdd10Num {
    public static void main(String[] args) {
        int num = 1;   // starting number
        int count = 0; // kitne odd print hue

        do {
            if (num % 2 != 0) {
                System.out.println(num);
                count++;
            }
            num++;
        } while (count < 10); // exit condition
    }
}
