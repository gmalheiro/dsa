function boooo(n) {
    for (let i = 0; i < n; i++) { //o(1)
      console.log("booooo");
    }
  }
  
  function arrayOfHiNTimes(n) { //o(n)
    var hiArray = [];//o(1)
    for (let i = 0; i < n; i++) { //o(1)
      hiArray[i] = "hi"; //O(n)
    }
    return hiArray;
  }
  
  arrayOfHiNTimes(6);


/*
  The boo function has a space complexity of O(1) because it's allocatiion a constant amount of memoery when declaring let i in the for loop
  The arrayOfHiNTimes has a space complexity of O(n) because were adding a new element that number of the input. So each item is an additional memory space on our computers 
*/