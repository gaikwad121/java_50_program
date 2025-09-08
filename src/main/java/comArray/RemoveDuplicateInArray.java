package comArray;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        Set<Integer> unique = new LinkedHashSet<>();
        Set<Integer> duplicate = new LinkedHashSet<>();

        for (int num : arr) {
            if (!unique.add(num)) { // agar already present hai
                duplicate.add(num); // duplicate me add karo
            }
        }

        System.out.println("Unique Elements:");
        for (int num : unique) {
            System.out.print(num + " ");
        }

        System.out.println("\nDuplicate Elements:");
        for (int num : duplicate) {
            System.out.print(num + " ");
        }
    }
}
