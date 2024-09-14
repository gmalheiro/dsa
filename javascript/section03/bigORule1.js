// Worst case

// In bigO its important to always wait for the worst scenario
/*
  In this example we have three arrays:
  
  1. The best case which is the nemo array having the word nemo in the first element
  2. everyone array with the nemo word being in the fourth position, a not so bad scenario
  3. The worst scenario in the large array in which the word nemo is in the end of the array

*/
const nemo = ['nemo'];
const everyone = ['dory','bruce','marlin','nemo','gill','bloat','nigel','squirt','darla','hank'];
const large = new Array(100).fill('not anyone');
large[large.length -1 ] = 'nemo';


function findNemo(array) {
  for (let i = 0; i < array.length; i++) {
    console.log('running');
    if (array[i] === 'nemo') {
      console.log('Found NEMO!');
        //Without the return statement the function would still be running even after finding nemo
      break;
    }
  }
}

findNemo(everyone); 

/*
  The big O notation of findNemo is O(n) or linear
  
  The big O(n) depends on the number of inputs of fishes

  If the first element is nemo the bigO would be O(1) or constant time

*/