#include <iostream>

void anotherFunChallenge(int input) {
    int a = 5; // O(1)
    int b = 10; // O(1)
    int c = 50; // O(1)

    // First loop
    for (int i = 0; i < input; i++) { // O(n)
        int x = i + 1; // O(1)
        int y = i + 2; // O(1)
        int z = i + 3; // O(1)
    }

    // Second loop
    for (int j = 0; j < input; j++) { // O(n)
        int p = j * 2; // O(1)
        int q = j * 2; // O(1)
    }

    std::string whoAmI = "I don't know"; // O(1)

    // Time complexity: O(4 + 7n) or O(4 + 5n) if we don't count the i++
}

int main() {
    int input = 5; // Example input
    anotherFunChallenge(input);
    
    return 0;
}

/*
    The time complexity analysis is as follows:
    - O(1) for the variable declarations (a, b, c)
    - O(n) for the first loop (input iterations)
        - Inside the loop:
            - x, y, z declarations are O(1)
    - O(n) for the second loop (input iterations)
        - Inside the loop:
            - p and q declarations are O(1)
    - The overall time complexity is O(4 + 7n), which simplifies to O(n) since we drop the constants.
*/
