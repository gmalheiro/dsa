#include <iostream>
#include <vector>

// Function to compress boxes twice using the same array
void compressBoxesTwice(const std::vector<std::string>& boxes) {
    for (const auto& box : boxes) {
        std::cout << box << std::endl;
    }

    for (const auto& box : boxes) {
        std::cout << box << std::endl;
    }
}

// Function to compress boxes twice using two different arrays
void compressBoxesTwice2(const std::vector<std::string>& boxes1, const std::vector<std::string>& boxes2) {
    for (const auto& box : boxes1) {
        std::cout << box << std::endl;
    }

    for (const auto& box : boxes2) {
        std::cout << box << std::endl;
    }
}

int main() {
    std::vector<std::string> boxes = {"box1", "box2", "box3"};
    std::vector<std::string> boxes2 = {"boxA", "boxB", "boxC"};

    // Call the first function
    compressBoxesTwice(boxes);

    // Call the second function
    compressBoxesTwice2(boxes, boxes2);

    return 0;
}

/*
    The first function has a Big O of O(n) because it's iterating through the same array.
    The second function has a Big O of O(n + m) because it's iterating through two different arrays.
*/
