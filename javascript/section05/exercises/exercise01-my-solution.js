let array1 = [1,2,3,9];
let array2 = [1,2,4,4];

const findMatchingPairsThatAddUpToSum = (array,sum) => {
    for(let i = 0; i < array.length; i++) {
        for(let j = 0; j < array.length; j++){
            if(array[i] + array[j] == sum){
                console.log('it add up');
                return;
            }
        }
    }
}

findMatchingPairsThatAddUpToSum(array2,8);