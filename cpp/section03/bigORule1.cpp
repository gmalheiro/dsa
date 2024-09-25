#include <iostream>
#include <vector>

void findNemo (const std::vector<std::string>& array) {
  for (int i = 0;  i < array.size(); i++) {
      std::cout << "Running" << std::endl;
      if (array[i] == "nemo") {
          std::cout << "Found NEMO!"<< std::endl;
          break;
      }
  }
}


int main () {
    std::vector<std::string> nemo = {"nemo"};
    
    std::vector<std::string> everyone = {"dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank"};
    
    std::vector<std::string> large(100, "not anyone");
    large[large.size() - 1] = "nemo";

    findNemo(everyone);

    return 0;
}

// Worst case

// In bigO its important to always wait for the worst scenario
/*
  In this example we have three arrays:
  
  1. The best case which is the nemo array having the word nemo in the first element
  2. everyone array with the nemo word being in the fourth position, a not so bad scenario
  3. The worst scenario in the large array in which the word nemo is in the end of the array

*/