#include <iostream>
#include <vector>

// Function to print the first item, then the first half, and say "hi" 100 times
void printFirstItemThenFirstHalfThenSayHi100Times(const std::vector<std::string>& items) {
    // O(1) - Print the first item
    std::cout << "That's me: " << items[0] << std::endl;

    // O(n/2) - Print the first half of the array
    int middleIndex = items.size() / 2; // O(1)
    int index = 0; // O(1)

    while (index < middleIndex) { // O(n/2)
        std::cout << items[index] << std::endl;
        index++;
    }

    // O(100) - Say "hi" 100 times
    for (int i = 0; i < 100; i++) { // O(100)
        std::cout << "hi" << std::endl;
    }
}

void compressBoxesTwice(const std::vector<std::string>& boxes) {
    // O(n) - Print each box once
    for (const auto& box : boxes) {
        std::cout << box << std::endl;
    }

    // O(n) - Print each box again
    for (const auto& box : boxes) {
        std::cout << box << std::endl;
    }

    // O(2n) -> O(n) after dropping constants
}

int main() {
    std::vector<std::string> array(100, "hey");

    // Call the first function
    printFirstItemThenFirstHalfThenSayHi100Times(array);

    // Call the compressBoxesTwice function
    compressBoxesTwice(array);

    return 0;
}

/*
    For the `printFirstItemThenFirstHalfThenSayHi100Times` function:
    O(1 + n/2 + 100) simplifies to O(n).

    For the `compressBoxesTwice` function:
    O(2n) simplifies to O(n) after dropping constants.
*/
