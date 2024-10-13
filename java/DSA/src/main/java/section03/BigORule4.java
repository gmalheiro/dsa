package section03;

import java.util.List;

public class BigORule4 {
    public static void printAllNumbersThenAllPairSums(List<Integer> numbers) {
        // O(1) - Print a message
        System.out.println("These are the numbers:");

        // O(n) - Print each number in the list
        for (int number : numbers) {
            System.out.println(number);
        }

        // O(1) - Print a message
        System.out.println("And these are their sums:");

        // O(n^2) - Nested loops to print the sum of each pair
        for (int firstNumber : numbers) {
            for (int secondNumber : numbers) {
                System.out.println(firstNumber + secondNumber);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        printAllNumbersThenAllPairSums(numbers);

        /*
         o(2 + 3n + n*n )
         o(2 + 3n + nˆ2)
         o(nˆ2)
        We drop all the other numbers in the big o because we want the bigger the dominat which is o(nˆ2)
        */
    }
}
