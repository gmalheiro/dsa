function printAllNumbersThenAllPairSums(numbers) {
    console.log("these are the numbers:"); //o(1)
    numbers.forEach(number => { //(on)
        console.log(number); //o(n)
    });

    console.log("and these are their sums:"); //o(1)
    numbers.forEach(firstNumber => { //o(n)
        numbers.forEach( secondNumber => { //o(n)
            console.log(firstNumber + secondNumber); //o(n)
        });
    });
}

printAllNumbersThenAllPairSums([1, 2, 3, 4, 5]); 

/*

// o(2 + 3n + n*n )
// o(2 + 3n + nˆ2)
// o(nˆ2)

    We drop all the other numbers in the big o because we want the bigger the dominat which is o(nˆ2)

*/