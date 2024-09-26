let tweets = ["hey", 'wow', 'hi', 'nice'];

const retrieveOldestAndNewestTweet = (array) => {
    console.log(array[0], ' , ', array[array.length - 1]); //o(1)
}

//retrieveOldestAndNewestTweet(tweets);


let tweetsWithDate = [{
    tweet: 'hey',
    date: 2014
    }, {
    tweet: 'Wow',
    date: 2012
    }, {
    tweet: 'hi',
    date: 2018
}];

const retrieveOldestAndNewestTweetWithDateComparison = (array) => { 
    let newestDate = array[array.length - 1].date; 
    let oldestDate = array[0].date; 
    array.forEach(item => { 
        if(item.date >= newestDate){
            newestDate = item.date;
        }

        if(item.date < oldestDate){
            oldestDate = item.date;
        }

    });
    console.log('oldest date', oldestDate, ' newest date: ', newestDate);
}

retrieveOldestAndNewestTweetWithDateComparison(tweetsWithDate);// time complexity = O(n) and space complexity = O(1)




// You may get asked, what is the big O of using the .length in this case:
'asdjfajlksdjlkcjalksdjkljjlk'.length; 
/*
The answer to this question is that it depends

It depends on the  language you are using 

We need to know how the method works on the string here and how it works in javascript or any other language it might use


the .length here in js is a property if you look in the docs

So it's only going there and retrieving 

So O(1) constant time
*/ 