//Different terms for inputs
const compressBoxesTwice = (boxes) => {
    boxes.forEach(box => {
        console.log(box);
    });

    boxes.forEach(box => {
        console.log(box);
    });
}


const compressBoxesTwice2 = (boxes1,boxes2) => {
    boxes1.forEach(box => {
        console.log(box);
    });

    boxes2.forEach(box => {
        console.log(box);
    });
}


/*
    The first function big O is o(n) because its iterating through the same array
    The second function big o is o(n + m) because they are iterating through a different arrayd
*/