package section05.exercises;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Exercise02 {

    // Notes:
    // The arrays aren't sorted.
    // The input is two arrays. The logic scans them and checks if there are any common elements.
    // The result should return true or false.
    // Arrays may be of different sizes.

    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c", "x"};
        String[] array2 = {"z", "y", "i"};

        String[] arrayA = {"a", "b", "c", "x"};
        String[] arrayB = {"z", "y", "x"};

        System.out.println(neagoieCleanerSolution(arrayA, arrayB));  // Expected output: true
    }

    // Brute force approach - O(n^2) for arrays of the same size
    // If arrays have different sizes, complexity is O(n * m)
    public static boolean checkArraysIfThereIsCommonElement(String[] arrayA, String[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i].equals(arrayB[j])) {
                    System.out.println(true);
                    return true;
                }
            }
        }
        return false;
    }

    // Always aim to make the solution error-free as possible

    /*
    Ask questions such as:
    - Can we always assume two parameters?
    - Will we always receive arrays of the same data type?

    For example:
    - `method(String[] array1, Integer[] array2)` or `method(String[] array1, int[] array2)`

    Make suggestions for improvement, such as adding null checks or size validation.
    */

    public static boolean checkCommonItemsInArrayNPlusMSolution(String[] arrayA, String[] arrayB) { // O(n + m)
        Set<String> set = new HashSet<>();

        // Populate the set with the elements of arrayA
        for (String item : arrayA) {
            set.add(item);
        }

        // Check if any element from arrayB exists in the set
        for (String item : arrayB) {
            if (set.contains(item)) {
                System.out.println("It has");
                return true;
            }
        }

        return false;
    }

    /*
        In Java, we can use HashSets for O(n) lookups.
        HashMaps can also be useful for storing key-value pairs, but for this solution, a Set is sufficient.
    */

    // Helper method to map array elements into a Set
    // This prevents adding duplicates, which is handled automatically by HashSet in Java
    public static Set<String> mapArrayToSet(String[] array) {
        Set<String> set = new HashSet<>(Arrays.asList(array));
        return set;
    }

    // Neagoie solution using a HashSet
    public static boolean neagoieSolution(String[] array1, String[] array2) {
        Set<String> set = mapArrayToSet(array1);

        // Loop through the second array and check if any element exists in the set
        for (String item : array2) {
            if (set.contains(item)) {
                return true;
            }
        }

        return false;
    }

    // Neagoie cleaner solution using Java's built-in stream functions
    public static boolean neagoieCleanerSolution(String[] array1, String[] array2) {
        return Arrays.stream(array1).anyMatch(item -> Arrays.asList(array2).contains(item));
    }

    /*
        This cleaner solution uses Java's `Stream` API to implement a concise, readable solution.
        It behaves similarly to the `.some()` and `.includes()` functions in JavaScript.

        Q1 - If we had two identical letters in the same array, only one would be added to the set since sets prevent duplicates.
        Q3 & Q5 - In Java, primitive types like `int` would need to be handled separately if arrays were mixed types.
        Q4 - Java compares object references for arrays, meaning `[]` would be treated as unique and not equal to other empty arrays.
        Q6 - If we didn't receive a second array, the function would throw a `NullPointerException`. Adding null checks would prevent this.
    */
}
