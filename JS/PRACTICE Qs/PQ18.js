// create a fun to return avg of 3 numbers
function avg(a, b, c) {
  let average = parseFloat((a + b + c) / 3);
  console.log(`Average of ${a},${b},${c} is:${average.toFixed(3)}`);
}
avg(1, 5, 2);

// create a function to print a table of 

function printTable(num){
    for(let i=1;i<=10;i++){
        console.log(num*i);
    }
}
printTable(5);

// create a fun that returns the sum of no from 1 to n
function sumOfNum(num){
    let sum=0;
    for(let i=1;i<=num;i++){
        sum= sum+i;
    }
    return sum;
}
let num = prompt("Enter a num to calc the sum from 1 to n:");
console.log("Sum from 1 to",num,"is:",sumOfNum(num));