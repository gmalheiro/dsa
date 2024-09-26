#include <iostream>
#include <vector>
#include <string>

// Function to print "booooo" n times
void boooo(int n) {
    for (int i = 0; i < n; i++) { // O(n)
        std::cout << "booooo" << std::endl;
    }
}

// Function to create an array of "hi" n times
std::vector<std::string> arrayOfHiNTimes(int n) { // O(n)
    std::vector<std::string> hiArray(n); // O(n) - Allocate space for n elements

    for (int i = 0; i < n; i++) { // O(n)
        hiArray[i] = "hi"; // O(1) - Assign "hi" to each element
    }

    return hiArray;
}

int main() {
    // Call the function to create an array of "hi" 6 times
    std::vector<std::string> result = arrayOfHiNTimes(6);
    
    // Print the resulting array
    for (const auto& hi : result) {
        std::cout << hi << std::endl;
    }

    return 0;
}

/*
    The boooo function has a space complexity of O(1) because it allocates a constant amount of memory
    when declaring the variable i in the for loop.

    The arrayOfHiNTimes function has a space complexity of O(n) because we are creating a vector of size n,
    and each element represents an additional memory allocation on our computer.
*/
