// Q1.Write a JavaScript program to get the first n elements of an array.[n can be any positive number]

let sizeA = parseInt(prompt("Enter the size of Array:"));
let arrayElement = [];

for (let i = 0; i < sizeA; i++) {
  arrayElement.push(prompt(`Enter element ${i + 1}:`));
}
console.log(arrayElement);

// Now get first n elements
let n = parseInt(prompt("Enter how many first elements you want:"));
let firstN = arrayElement.slice(0, n);
console.log(`First ${n} elements:`, firstN);

// Q2 get last n elements
n = parseInt(prompt("Enter how many last elements you want:"));
let lastN = arrayElement.slice(-n);
console.log(`Last ${n} elements:`, lastN);

// Q3 .Write a JavaScript program to check whether a string is blank or not
let sampleString = "";
if (sampleString.length == 0) {
  console.log(`The String is Empty.`);
} else {
  console.log(`The String is not Empty.`);
}

// Q4
let sampleString2 = "jatin     ";
let char = sampleString2.charAt(2);
if (char === char.toLowerCase() && char !== char.toUpperCase()) {
  console.log(`The character '${char}' at index 2 is lowercase.`);
} else {
  console.log(`The character '${char}' at index 2 is NOT lowercase.`);
}

// 05 
console.log(sampleString2.trim());

// Q6: 
let sampleArray = [1, 2, 3, 3, 4, 5, 5, 7, 8, 9, 10];
let findArray = parseInt(prompt("Enter the value to find in Array:"));

let found = false; // flag variable

for (let i = 0; i < sampleArray.length; i++) {
  if (sampleArray[i] === findArray) {
    found = true;
    break; // stop searching once found
  }
}

if (found) {
  console.log("Element Found");
} else {
  console.log("Element Not Found");
}

