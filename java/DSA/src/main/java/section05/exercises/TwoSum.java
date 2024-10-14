package section05.exercises;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 9};
        int[] unSortedArray = {1, 4, 2, 4};
        int[] resultBruteForce = twoSumBruteForce(sortedArray, 5);
        System.out.println("{" + resultBruteForce[0] + "," + resultBruteForce[1] + "}");
        int[] resultTwoPointerTechnique = twoSumTwoPointerWithSortedArray(sortedArray, 5);
        System.out.println("{" + resultTwoPointerTechnique[0] + "," + resultTwoPointerTechnique[1] + "}");
        int [] resultTwoSumUnsortedArray = twoSumUnsortedArray(unSortedArray,8);
        System.out.println("{" + resultTwoSumUnsortedArray[0] + "," + resultTwoSumUnsortedArray[1] + "}");
    }

    public static int[] twoSumBruteForce(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


    public static int[] twoSumTwoPointerWithSortedArray(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length - 1;
        while (low < high) {
            int sum = sortedArray[low] + sortedArray[high];
            if (sum == target) {
                return new int[]{low, high};
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        return new int[]{};
    }
    /*
        Considering the arrays are sorted this solution would have a linear time O(n)

        This solution use the double pointer technique

        What this solution is doing is the following:

        - if the sum is lesser than the target it moves the low pointer one step ahead (it increments the low pointer +1 low++)

        - If the sum is greater than the target it moves the high pointer one step before (it decreases the high pointer -1 high--)
      */


    public static int [] twoSumUnsortedArray (int [] data, int target) {
        HashMap<Integer,Integer> complements = new HashMap<Integer,Integer>();
        for (int i = 0; i <= data.length; i++) {
            int value = data[i];
            int complement = target - value;

            if (complements.containsKey(complement)) {
                return  new int[] {complements.get(complement),i};
            }
            complements.put(complement,i);
        }
        return  new int[] {};
    }

}
