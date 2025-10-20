//Q1 write a js prog to delete all the occurance of the given element
let sampleArray = [1,2,3,4,5,6,2,3];
let occurance = parseInt(prompt("Enter the no to delete its occurance in this array."));
console.log("printing Original List");
console.log(sampleArray);
for(let i=0;i<sampleArray.length;i++){
    if(sampleArray[i] == occurance){
        sampleArray.splice(i,1);
        i--;
    }
}
console.log("printing Update List");
console.log(sampleArray);

//Q2 enter the count of digits
let digit = 287152;
let counter=0;
while (digit > 0) {
    digit = Math.floor(digit / 10);
    counter++;
}
console.log(counter)

//Q3 find Sum
let digit2 = 287152;
let sum = 0;
let temp = 0;
while(digit2 > 0){
    temp = digit2 % 10;
    sum = sum+temp;
    digit2 = Math.floor(digit2/10);
}
console.log(sum);

//Q4 print factorial
let num = parseInt(prompt("Enter a num to get factorial."));
let fact = 1;
for(let i=num;i>=1;i--){
    fact = i*fact;
}
console.log(`Factorial of ${num} is ${fact}`);


//Q5 find largest in array
let arr1 = [1,2,3,3,6,4,5,6,10,6,-30,1,2,3];
let largest = arr1[0];
for(let i=1;i<arr1.length;i++){
    if(arr1[i] >= largest ){
        largest = arr1[i];
    }
}
console.log(largest);