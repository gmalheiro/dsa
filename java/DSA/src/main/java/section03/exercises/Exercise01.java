package section03.exercises;
// What is the bigO of funcChallenge?
public class Exercise01 {
    public static void main (String [] args) {
        int result = funChallenge(10);
        System.out.println(result);
    }

    public static int funChallenge (int input) {
        int a = 10; //O(1)
        a = 50 + 3; //O(1)
        //if it is inside the for loop it's O(n)
        for (int i = 0; i < input; i++ ) {
            //anotherFunction() O(n)
            boolean stranger = true; //O(n)
            a++; //O(n)
        }
        return a; //O(1)
        // O(3 + n + n + n + n)
        // O(3 + 4n)
        // If we drop the constants O(n)
    }
}
