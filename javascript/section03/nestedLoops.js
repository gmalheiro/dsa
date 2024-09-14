// Log all pairs of array
// 1,2,3,4,5
//Eg:
// [1,1] [1,2] [1,3] [1,4] [1,5] 
// [2,1] [2,2]  [2,3] [2,4] [2,5]

const boxes = [1,2,3,4,5];

function logAllPairOfArray(array) {
    for (let i = 0; i < array.length; i++) { //o(n)
        for (let j = 0; j < array.length; j++) { // o(n)
            console.log(array[i],',',array[j]);
        }
    }
}


/*
    The big O of this function would be O(n ˆn) or o(nˆ2)  or quadratic time
    If the loops are nested we multiply them

*/