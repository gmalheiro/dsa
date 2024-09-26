#include <iostream>
#include <vector>

// Placeholder function for anotherFunction
void anotherFunction() {
}

int funChallenge(const std::vector<int>& input) {
    int a = 10; // O(1)
    a = 50 + 3; // O(1)

    // O(n) - Iterate through the input array
    for (size_t i = 0; i < input.size(); i++) {
        anotherFunction(); // O(1) - Assuming this is O(1) for simplicity
        bool stranger = true; // O(1)
        a++; // O(1)
    }

    return a; // O(1)
}

int main() {
    std::vector<int> input = {1, 2, 3, 4, 5}; // Example input
    int result = funChallenge(input);
    
    std::cout << "Result: " << result << std::endl;

    return 0;
}

/*
    The time complexity analysis is as follows:
    - O(1) for variable declarations and assignments (a = 10 and a = 50 + 3)
    - O(n) for the loop that runs input.length times
    - Inside the loop, we assume:
        - anotherFunction() is O(1)
        - the declaration of stranger is O(1)
        - a++ is O(1)

    The overall time complexity is O(3 + 4n), which simplifies to O(n) since we drop the constants.
*/
