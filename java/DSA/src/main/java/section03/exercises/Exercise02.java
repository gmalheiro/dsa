package section03.exercises;

public class Exercise02 {
    // What is the Big O of the below function? (Hint, you may want to go line by line)
    public static void anotherFunChallenge(int input) {
        int a = 5; // O(1)
        int b = 10; // O(1)
        int c = 50; // O(1)

        for (int i = 0; i < input; i++) { // O(n)
            int x = i + 1; // O(n)
            int y = i + 2; // O(n)
            int z = i + 3; // O(n)
        }

        for (int j = 0; j < input; j++) { // O(n)
            int p = j * 2;  // O(n)
            int q = j * 2;  // O(n)
        }

        String whoAmI = "I don't know"; // O(1)
    }
    public static  void main (String [] args) {
        anotherFunChallenge(5);
    }
    // O(4 + 7n) or O(4 + 5n) if we don't count the i++ or j++
}
