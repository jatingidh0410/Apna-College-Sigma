// A "good string" is a string that starts with a letter 'a' & has length > 3.
// write a program to find if a string is good or not .

let stringValue = "Apple";

if (stringValue[0].toLowerCase() === 'a' && stringValue.length > 3) {
  console.log("The string is a good string");
} else {
  console.log("The string is not good.");
}

// Q2: predict the op
let num = 12;
if (num % 3 === 0 && (num + 1 == 15 || num - 1 == 11)) {
  console.log("safe");
} else {
  console.log("not safe");
}
 // safe is the predicted op