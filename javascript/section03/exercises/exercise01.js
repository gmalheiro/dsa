// What is the Big O of the below function? (Hint, you may want to go line by line)
function funChallenge(input) {
    let a = 10; //O(1)
    a = 50 + 3;// 0(1)
    //If it is inside the for of n loop its o(n)
    for (let i = 0; i < input.length; i++) { //O(n)
      anotherFunction(); //O(n)
      let stranger = true; //O(n)
      a++;// O(n)
    }
    return a;//O(1)
    //O(3 + n + n + n + n)
    //Our big O is: O(3 + 4n)
  }