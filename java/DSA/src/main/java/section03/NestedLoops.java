package section03;

public class NestedLoops {
    public static  void main (String [] args) {
        // Log all pairs of array
        // 1,2,3,4,5
        //Eg:
        // [1,1] [1,2] [1,3] [1,4] [1,5]
        // [2,1] [2,2]  [2,3] [2,4] [2,5]

        int[] boxes = {1,2,3,4,5};
        logAllPairsOfArray(boxes);

        /*
            The big O of this function would be O(n ˆn) or o(nˆ2)  or quadratic time
            If the loops are nested we multiply them
        */

    }

    public static void logAllPairsOfArray (int [] array) {
        for (int i : array) { //O(n)
            for (int j : array) { //O(n)
                System.out.println(i + " , " + j);
            }
        }
    }
}
