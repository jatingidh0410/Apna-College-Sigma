// Q1 Create a number variable num with some value.
// Now,print “good” if the number is divisible by 10 and print “bad” if it is not.
let num = Math.floor(Math.random() * 100) + 1;
if (num % 10 === 0) {
  console.log(`${num}:good`);
} else {
  console.log(`${num}:bad`);
}

// Qs2. Take the user's name & age as input using prompts.
// Then return the following statement to the user as an alert (by substituting their name & age):
let name1 = prompt("Enter your name:");
let age = prompt("Enter your age:");
alert(`${name1} is ${age} years old.`);

// Qs3. Write a switch statement to print the months in a quarter.
let months = [
  "january",
  "february",
  "march",
  "april",
  "may",
  "june",
  "july",
  "august",
  "september",
  "october",
  "november",
  "december",
];
let randomMonth = months[Math.floor(Math.random() * months.length)];
switch (randomMonth) {
  case "january":
  case "february":
  case "march":
    console.log("Quater 1,", "Month:", randomMonth);
    break;
  case "april":
  case "may":
  case "june":
    console.log("Quater 2,", "Month:", randomMonth);
    break;
  case "july":
  case "august":
  case "september":
    console.log("Quater 3,", "Month:", randomMonth);
    break;
  case "october":
  case "november":
  case "december":
    console.log("Quater 4,", "Month:", randomMonth);
    break;
  default:
    console.log("Enter vaild month:");
}

//Qs4. A string is a golden string if it starts with the character ‘A’ or ‘a’ and has a total length greater than 5.
// For a given string, print if it is golden or not.
let goldenString = "Amplifier";
if (
  (goldenString[0] == "A" || goldenString[0] == "a") &&
  goldenString.length > 5
) {
  console.log(goldenString, " is a Golden String.");
} else {
  console.log(goldenString, " is not a Golden String.");
}

// Qs5. Write a program to find the largest of 3 numbers.

let num1 = 52,
  num2 = 21,
  num3 = 74;
if (num1 > num2 && num1 > num3) {
  console.log(`${num1} is the greatest number.`);
} else if (num2 > num1 && num2 > num3) {
  console.log(`${num2} is the greatest number.`);
} else {
  console.log(`${num3} is the greatest number.`);
}

//Qs6 (Bonus). Write a program to check if 2 numbers have the same last digit.
// Example: 32 and 47852 have the same last digit i.e. 2.

let n1 = 23,
  n2 = 1243;
if (n1[n1.length - 1] === n2[n2.length - 1]) {
  console.log(`Both ${n1} and ${n2} have same last digit.`);
} else {
  console.log(`Both ${n1} and ${n2} dont't have same last digit.`);
}
