#include <iostream>
#include <vector>

// Function to print all numbers and their pair sums
void printAllNumbersThenAllPairSums(const std::vector<int>& numbers) {
    std::cout << "These are the numbers:" << std::endl; // O(1)
    
    // O(n) - Print each number
    for (const auto& number : numbers) {
        std::cout << number << std::endl; // O(n)
    }

    std::cout << "And these are their sums:" << std::endl; // O(1)

    // O(n^2) - Print pair sums
    for (const auto& firstNumber : numbers) { // O(n)
        for (const auto& secondNumber : numbers) { // O(n)
            std::cout << (firstNumber + secondNumber) << std::endl; // O(n)
        }
    }
}

int main() {
    // Call the function with a sample vector
    printAllNumbersThenAllPairSums({1, 2, 3, 4, 5});

    return 0;
}

/*
    The overall time complexity is:
    O(2 + 3n + n^2)
    Simplified to O(n^2), since we drop the lower-order terms.
*/
