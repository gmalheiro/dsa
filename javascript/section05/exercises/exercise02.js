// Notes:
// The arrays aren't sorted
// The input is two arrays there is a logic to scan them and see if there is any common elements and the result should return true or false
// The return means logging true or false or return a boolean value?
// They will always be of different sizes?

const array1 = ["a", "b", "c", "x"];
const array2 = ["z", "y", "i"];

const arrayA = ["a", "b", "c", "x"];
const arrayB = ["z", "y", "x"];

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


const checkCommonItensInArrayNplusMSolution = (arrayA,arrayB) => { // O(n + m)
    let set = new Set();

    for (let i = 0; i < arrayA.length; i++) {
        set.add(arrayA[i]);
    }

    for (let i = 0; i < arrayB.length; i++){
        if (set.has(arrayB[i])) {
            console.log("It has");
            return true;
        } 
    }

    console.log('IT DOES NOT HAVE');
    return false;

};

/*
    One of the most common patterns when it comes to nested for loops 
    is that you might be able to use hash tables in javascript they are called objects 
*/