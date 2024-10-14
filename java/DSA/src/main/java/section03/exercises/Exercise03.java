package section03.exercises;

import java.util.List;

public class Exercise03 {

    public static void main(String[] args) {
        String[] tweets = {"hey", "wow", "hi", "nice"};
        retrieveOldestAndNewestTweet(tweets);

        List<Tweet> tweetsWithDate = List.of(
                new Tweet("hey", 2014),
                new Tweet("Wow", 2012),
                new Tweet("hi", 2018)
        );
        retrieveOldestAndNewestTweetWithDateComparison(tweetsWithDate);

        String exampleString = "asdjfajlksdjlkcjalksdjkljjlk";
        System.out.println("Length of the string: " + exampleString.length());
    }

    public static void retrieveOldestAndNewestTweet(String[] tweets) {
        // O(1) time complexity for accessing the first and last element
        System.out.println(tweets[0] + " , " + tweets[tweets.length - 1]);
    }

    public static void retrieveOldestAndNewestTweetWithDateComparison(List<Tweet> tweets) {
        if (tweets == null || tweets.isEmpty()) {
            System.out.println("No tweets available.");
            return;
        }

        int[] dates = findOldestAndNewestDates(tweets);
        System.out.println("Oldest date: " + dates[0] + " , Newest date: " + dates[1]);
    }

    private static int[] findOldestAndNewestDates(List<Tweet> tweets) {
        int oldestDate = tweets.getFirst().date;
        int newestDate = tweets.getFirst().date;

        for (Tweet tweet : tweets) {
            if (tweet.date > newestDate) {
                newestDate = tweet.date; // Update if a newer date is found
            }
            if (tweet.date < oldestDate) {
                oldestDate = tweet.date; // Update if an older date is found
            }
        }

        return new int[]{oldestDate, newestDate}; // Return the results as an array
    }
}

// Tweet class definition
class Tweet {
    String tweet;
    int date;

    // Constructor for Tweet
    public Tweet(String tweet, int date) {
        this.tweet = tweet;
        this.date = date;
    }
}

/*
You may get asked, what is the big O of using the .length in this case:
'asdjfajlksdjlkcjalksdjkljjlk'.length;

The answer to this question is that it depends.

It depends on the language you are using.

We need to know how the method works on the string here and how it works in Java or any other language it might use.

The .length here in Java is a property; if you look in the docs,
it's only going there and retrieving.

So O(1) constant time.
*/
