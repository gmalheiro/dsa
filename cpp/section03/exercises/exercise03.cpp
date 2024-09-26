#include <iostream>
#include <vector>
#include <string>

using namespace std;

void retrieveOldestAndNewestTweet(const vector<string>& array) {
    // O(1)
    cout << array[0] << " , " << array[array.size() - 1] << endl; 
}

struct Tweet {
    string tweet;
    int date;
};

void retrieveOldestAndNewestTweetWithDateComparison(const vector<Tweet>& array) {
    int newestDate = array[array.size() - 1].date; // Initialize with the first date
    int oldestDate = array[0].date; // Initialize with the first date

    for (const auto& item : array) { // O(n)
        if (item.date >= newestDate) {
            newestDate = item.date;
        }

        if (item.date <= oldestDate) {
            oldestDate = item.date;
        }
    }

    cout << "oldest date: " << oldestDate << " , newest date: " << newestDate << endl;
}

int main() {
    vector<string> tweets = {"hey", "wow", "hi", "nice"};
    retrieveOldestAndNewestTweet(tweets);

    vector<Tweet> tweetsWithDate = {
        {"hey", 2014},
        {"wow", 2012},
        {"hi", 2018}
    };

    retrieveOldestAndNewestTweetWithDateComparison(tweetsWithDate); // Time complexity = O(n) and space complexity = O(1)

    // Discussing the length property in C++
    string exampleString = "asdjfajlksdjlkcjalksdjkljjlk";
    cout << "Length of the string: " << exampleString.length() << endl; // O(1)

    /*
    The time complexity for accessing .length in C++ depends on how the string class is implemented.
    In C++, string::length() is typically O(1) because it returns a stored size attribute of the string.
    */
    
    return 0;
}
