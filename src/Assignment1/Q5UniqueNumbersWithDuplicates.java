package Assignment1;
import java.util.Arrays;

public class Q5UniqueNumbersWithDuplicates {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 2, 4, 1, 5, 6, 3 };

        // Sort the array
        Arrays.sort(numbers);

        // Print unique numbers and their occurrences
        System.out.println("Unique numbers:");
        int count = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                if (count == 1) {
                    System.out.println(numbers[i - 1]);
                }
                count = 1;
            } else {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(numbers[numbers.length - 1]);
        }

        System.out.println("Duplicate numbers and their occurrences:");
        count = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                if (count > 1) {
                    System.out.println(numbers[i - 1] + " - Occurrences: " + count);
                }
                count = 1;
            } else {
                count++;
            }
        }
        if (count > 1) {
            System.out.println(numbers[numbers.length - 1] + " - Occurrences: " + count);
        }
    }
}
