package section03;

import java.util.Arrays;

public class SpaceComplexity {
    public static void boo(int n) {
        for (int i = 0; i < n; i++) { //O(1)
            System.out.println("boo");
        }
    }

    public static String[] arrayOfHiNTimes (int n) { //O(n)
       String [] hiArray = new String[n]; //O(1)
       Arrays.fill(hiArray, "hi"); //O(n)
       return  hiArray;
    }

    public static void main (String [] args) {
        boo(6);
        String [] result = arrayOfHiNTimes(10);
        for (String str: result) {
            System.out.println(str);
        }

        /*
          The boo function has a space complexity of O(1) because it's allocation a constant amount of memory when declaring let i in the for loop
          The arrayOfHiNTimes has a space complexity of O(n) because were adding a new element that number of the input. So each item is an additional memory space on our computers
        */
    }
}
