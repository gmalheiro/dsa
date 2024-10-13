#include <iostream>
#include <vector>
#include <sstream>

std::string printVector (const std::vector<int> & vector) {    

    int i;
    int j;

    if (vector[0] && vector[1]) {
       std::ostringstream oss;
       oss << "{" << vector[0] << " , " << vector[1] << "}";
        return oss.str();
    }

    return "{}";
}

std::vector<int> hasPairWithSumBruteForce (const std::vector<int> & vector, int sum) {
    for (int i = 0; i < vector.size(); i++) {
        for (int j = i + 1; j < vector.size(); j++) {
            if (vector[i] + vector[j] == sum) {
                return {i,j};
            }
        }
    }
    return {};
}

int main () {
    std::vector<int> vector1 = {1,2,4,4};

    std::string result = printVector(hasPairWithSumBruteForce(vector1,8));
    
    std::cout << "Result: "  << result << std::endl;


    return 1;
}