package section03;

import java.util.Objects;

public class BigORule1 {
    public static void main(String[] args) {
//Worst case
// In bigO it's important to always wait for the worst scenario
/*
  In this example we have three arrays:

  1. The best case which is the nemo array having the word nemo in the first element
  2. everyone array with the nemo word being in the fourth position, a not so bad scenario
  3. The worst scenario in the large array in which the word nemo is in the end of the array

*/

        String[] nemo = {"nemo"};
        String[] everyone = {"dory","bruce","marlin","nemo","gill","bloat","nigel", "squirt","darla","hank"};
        String[] large = new String[100];
        large[large.length - 1] = "nemo";
        findNemo(everyone);
    }

    public static void findNemo(String[]array) {
        for (String s : array) {
            if (Objects.equals(s, "nemo")) {
                System.out.println("FOUND NEMO!");
                break;
            }
        }
    }


}
