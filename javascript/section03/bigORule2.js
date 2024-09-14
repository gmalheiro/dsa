//Drop the constants

function printFirstItemThenFirstHalfThenSayHi100Times(items) {
    console.log('thats me: ',items[0]); //O(1)

    var middleIndex = Math.floor(items.length /2); //O(n/2)
    var index = 0; //0(1)

    while (index < middleIndex) { //O(n/2)
           console.log(items[index]); 
           index++; 
    }

    for (var i = 0; i < 100; i++){  //O(100)
        console.log('hi');
    }
}


let array = new Array(100).fill('hey');


printFirstItemThenFirstHalfThenSayHi100Times(array);


/* 
    O(1 + n/2  + 100)
    O(n + 1)
    O(n)

*/


const compressBoxesTwice = (boxes) => {
    boxes.forEach(box => {
        console.log(box);
    });

    boxes.forEach(box => {
        console.log(box);
    });


    /* Because we have forEach in two different scopes we add them 
        So the BigO would be: O(2n)

        n for each forEach n + n = 2n;

        If we drop the constants it would be O(n)

    */
}