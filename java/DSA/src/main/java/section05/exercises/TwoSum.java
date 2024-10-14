package section05.exercises;

public class TwoSum {
    public static void main (String [] args) {
        int [] sortedArray = {1,2,3,9};
        int [] result = hasPairWithSumBruteForce(sortedArray,5);
        System.out.println("{" + result[0] + "," + result[1]+"}");
    }


    public static int [] hasPairWithSumBruteForce (int [] array,int sum) {
        for (int i = 0 ; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    return  new int [] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
