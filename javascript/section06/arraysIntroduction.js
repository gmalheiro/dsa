const strings = ['a','b','c','d'];
// 4 * 4 = 16 bytes of storage for storing 

console.log(strings[2]); //O(1)

strings.push('e'); // O(1)

strings.pop(); // O(1)

strings.unshift('x'); // O(n)

strings.splice(Math.floor(strings.length/2),0,'alien');/*
* In the best case: O(n / 2)
* In the worst case: O(n)
* */

console.log(strings)
