// Notes:
// The arrays aren't sorted
// The input is two arrays there is a logic to scan them and see if there is any common elements and the result should return true or false
// The return means logging true or false or return a boolean value?
// They will always be of different sizes?

const array1 = ["a", "b", "c", "x"];
const array2 = ["z", "y", "i"];

const arrayA = ["a", "b", "c", "x"];
const arrayB = ["z", "y", "x"];

//Always think of different inputs

//What if we had two same letters in the same array? Q1
const arrayC = ["a", "a", "c", "x"];
const arrayD = ["z", "y", "x"];

//What if we had same letters in array and an equal letter in the other array? Q2
const arrayE = ["a", "a", "c", "x"];
const arrayF = ["z", "a", "x"];

//What if we had numbers? Q3
const arrayG = ["a", 1, "c", "x"];
const arrayH = ["z", 1, "x"];

//What if we had arrays as elements in the arrays? Q4
const arrayI = ["a", [], "c", "x"];
const arrayJ = ["z", [], "x"];

//What if we had null as elements in the array? Q5
const arrayK = ["a", null, "c", "x"];
const arrayL = ["z", null, "x"];

/* What if we didn't receive a second array? What would happen to the function? Q6 */
const arrayM = ["a", "b", "c", "x"];

//Bruteforce approach
const checkArraysIfThereIsCommonElement = (arrayA, arrayB) => { // O(n^2) = quadratic if the arrays are the same size
    //If the inputs sizes are different they look more like o(n * m)
    for (let i = 0; i < arrayA.length; i++) {
        for (let j = 0; j < arrayB.length; j++) {
            if (arrayA[i] == arrayB[j]) {
                console.log(true);
                return true;
            }
        }
    }
    return false;
};

//Always make the solution error free as possible

/*
Ask questions like: can we assume always two params?
I'll always be receiving the same data type as parameters?

Ex: func (array1:string[], array2:number[]) or (array1:string[], array2:number)

Make suggestions on how to improve it like doing  checks and etc...


Tell the interviewer about the weakpoints in your method like:

    in this function only numbers, strings and booleans can be used correctly here

    If we used non literal values this might not work like a javascript expression

    And also this code could be a little bit more readable

*/
const checkCommonItensInArrayNplusMSolution = (arrayA, arrayB) => { // O(n + m)
    let set = new Set();

    for (let i = 0; i < arrayA.length; i++) {
        set.add(arrayA[i]);
    }

    for (let i = 0; i < arrayB.length; i++) {
        if (set.has(arrayB[i])) {
            console.log("It has");
            return true;
        }
    }

    return false;

};

/*
    One of the most common patterns when it comes to nested for loops 
    is that you might be able to use hash tables in javascript they are called objects 
*/

//Always modularize your code breaking it into smaller functions
const mapArrayToObject = (array) => {
    let object = {};
    array.forEach(item => {
        if (!object[item]) 
            object[item] = true;
    });
    return object;
}

const neagoieSolution = (array1, array2) => {
    let map = mapArrayToObject(array1);
    //Loop through the second array and check if item in second array exists on created object
    for (let j = 0; j < array2.length; j++) {
        if (map[array2[j]]) {
            return true;
        }
    }
    return false;
}


const neagoieCleanerSolution = (array1,array2) => {
    return array1.some(item => array2.includes(item));
}
/*
    In this solution we used built-in methods in javascript having a nicer solution
*/

/*

    Q1 - It wouldn't add the a a second time because were checking it and it would return true because of x 

    Q3  & Q5 - This is a language specific question but the answer in javascript is yes because it would treat them as literals
    
    Q4 - In JavaScript, comparing arrays or objects checks reference equality (not value equality),
    so it would treat `[]` as unique, even if both arrays contain empty arrays. In `["a", [], "c", "x"]` and `["z", [], "x"]`,
    it would return `true` because of "x", but the empty arrays would not be considered equal.

    Q6 
    The function would break because there's nothing to iterate over

*/

console.log(neagoieSolution(arrayA,arrayB));