package section03;

import java.util.Arrays;
import java.util.List;

public class BigORule2 {
    //Drop the constants
    public static void printFirstItemThenFirstHalfThenSayHi100Times(String[] items) {
        // Print the first item (O(1))
        System.out.println("that's me: " + items[0]);

        // Calculate the middle index (O(n/2))
        int middleIndex = items.length / 2;
        int index = 0;

        // Print first half of the array (O(n/2))
        while (index < middleIndex) {
            System.out.println(items[index]);
            index++;
        }

        // Print "hi" 100 times (O(100))
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
        }
    }

    public static void compressBoxesTwice(List<String> boxes) {
        // First forEach loop (O(n))
        for (String box : boxes) {
            System.out.println(box);
        }

        // Second forEach loop (O(n))
        for (String box : boxes) {
            System.out.println(box);
        }
    }


    public static void main(String[] args) {
        String[] array = new String[100];
        Arrays.fill(array, "hey");
        printFirstItemThenFirstHalfThenSayHi100Times(array);
    }
}
