let array1 = [1, 2, 3, 9];
let array2 = [1, 2, 4, 4];

// Using brute force approach
const hasPairWithSumBruteForce = (array,sum) => { // Onˆ2 or quadratic time
    for(let i = 0; i < array.length; i++) {
        for(let j = i + 1; j < array.length; j++){
            if(array[i] + array[j] == sum){
                return [i,j];
            }
        }
    }
}

const hasPairWithSumWithSortedArray = (data, target) => { //O(n) or linear
    let low = 0;
    let high = data.length - 1;
    while (low < high) {
        let sum = data[low] + data[high];
        if (sum == target) {
            return [low,high];
        } else if (sum < target) {
            low++;  
        } else {
            high--; 
        }
    }
    return false;
};
/*
    Considering the arrays are sorted this solution would have a linear time O(n)

    This solution use the double pointer technique

    What this solution is doing is the following:
    
    - if the sum is lesser than the target it moves the low pointer one step ahead (it increments the low pointer +1 low++)
    
    - If the sum is greater than the target it moves the high pointer one step before (it decreases the high pointer -1 high--)
*/

const hasPairWithSumWithUnSortedArray = (data, target) => {
    const comp = new Map();

    for (let i = 0; i < data.length; i++) {
        let value = data[i];
        let complement = target - value;

        // Checking if the complement exists in the map
        if (comp.has(complement)) {
            // Return the indices of the pair
            return [comp.get(complement), i];
        }

        // Add the current value and its index to the map
        comp.set(value, i);
    }

    return false;
};

console.log(hasPairWithSumWithSortedArray(array2,8));