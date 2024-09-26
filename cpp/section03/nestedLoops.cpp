#include <iostream>
#include <vector>

// Function to log all pairs of elements in an array
void logAllPairsOfArray(const std::vector<int>& array) {
    // O(n) - Outer loop
    for (size_t i = 0; i < array.size(); i++) {
        // O(n) - Inner loop
        for (size_t j = 0; j < array.size(); j++) {
            std::cout << array[i] << ", " << array[j] << std::endl;
        }
    }
}

int main() {
    std::vector<int> boxes = {1, 2, 3, 4, 5};

    // Call the function with the boxes vector
    logAllPairsOfArray(boxes);

    return 0;
}

/*
    The overall time complexity is O(n^2) due to the nested loops,
    since we multiply the number of iterations of the two loops.
*/
