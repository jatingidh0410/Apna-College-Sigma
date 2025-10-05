// console.log("Hello World first link with JS in Html.");
// console.log("Apna College Course");
// let a = 10;
// let b = 13;
// console.log("Sum is :",(a+b));

// let pencilPrice = 10;
// let eraserPrice = 5;
// console.log(
//   "The total price of pencil and eraser is:",
//   pencilPrice + eraserPrice,
//   "rupees."
// );
// let output = `The total price is: ${pencilPrice + eraserPrice} rupees.`; // backtics ``
// console.log(output);

//Arithmetic Operator
// let a = 10;
// let b = 20;
// console.log(`Arithmetic Operations on a=10,b=20: ${a + b},${a - b},${a * b},${a / b},${a % b},${a ** 5}`);
//Unary Operator
// console.log(a++);
// console.log(++a); // same for --a

// Comaprison
// console.log(`Is 10 = 20:${a==b}`);

//Conditional Statements
// let age =23;

// if(age >= 18){
//     console.log(`You are eligible to vote`);
// }else{
//     console.log(`You can't vote`);
// }

// nested if else
//     let marks = 56;
// if (marks >= 33){
//     if (marks >= 80){
//         console.log("0");
//     }else{
//         console.log("A");
//     }
// }else{
//     console.log('Better Luck next Time.');
// }

// Logical Operator
// console.log((5>3) && (7>16) );
// let marks=95;
// if (marks != 30 && marks >= 80){
//     console.log("Pass");
//     console.log("Grade A+")
// }

// switch case
// let light = "YeLLow";
// switch(light.toLowerCase()) {
//   case "red":
//     console.log("stop");
//     break;
//   case "yellow":
//     console.log("slow down");
//     break;
//   case "green":
//     console.log("go");
//     break;
//   default:
//     console.log("light broken.");
// }

// alert and prompt

// alert("alert msg");
// console.error("Calendar Broken");
// console.warn("");

// let name1 = prompt("Enter your name:");
// console.log(`Your name is: ${name1}`);
// let age = prompt("Enter your age:");
// console.log(`your age is ${age}`);

// String Methods
// let sampleString = "   Hello Jatin   ";
// console.log(sampleString);
// console.log(sampleString.trim());
// console.log(sampleString.toLowerCase());
// console.log(sampleString.toUpperCase());

// let msg = "Error";
//prompt(`For New Users:\nUsername: 'admin'\nPassword: 'admin'`);
// prompt("User:");prompt("Password");

// console.log(msg.indexOf('o'));

// method channing
// let trimString = sampleString.trim();
// let trim_UpperCaseString = trimString.toUpperCase();
// console.log(trim_UpperCaseString);
// console.log(trim_UpperCaseString.slice(1,trim_UpperCaseString.length-6));
// console.log(trim_UpperCaseString.slice(0,-6)) // same as obove it subtracts -6 with total length of str.
// console.log(trim_UpperCaseString.replace('HELLO',"Welcome,"));

// let cat = 'meow ';
// let dog = 'b';
// console.log(cat.replace('me',dog));
// console.log(cat.repeat(4));

// arrays
// let students = ["Jatin", "Ram", "Sham", "Sita", "Gita"];
// let studentInfoColumn = ["rollNo", "Name", "CGPA", "City"];
// let studentInfo = [1, "JatinG ", 9.9, "Ulwe"]; //multi type array
// console.log(`${studentInfoColumn} \n${studentInfo}`);
// console.log(studentInfo[1][0]); // accessing second index, first value. "J"
//empty aaray
// let emptyArray = [];
// for(let i = 0 ; i<3;i++){
//     emptyArray[i] = prompt("Enter Any 3 fruits to store in array:");
// }
// console.log("Array:",emptyArray);

// methods of array.
// let cars = ['bmw','suv','benz'];

// console.log(cars.push("lexus"));
// console.log(cars);
// console.log("Poped:",cars.pop()); // push pop the last element
// console.log("Unshift",cars.unshift("rollsroyals"));
// console.log(cars);
// console.log(cars.shift());
// console.log(cars); // shift and unshift is to add elemts to start of an array

// console.log(final.indexOf('march'));
// console.log(final.includes('july'));

// let final2  = ["january","febuary"];

// final2 = final2.concat(final);
// console.log(final2);
// console.log("Reversed Array:",final2.reverse());
// console.log("Slice:",final2.slice(2,-3));
// //splice(start, deleteCount, item0...n);

// final2.reverse();
// console.log(final2);
// console.log(final2.splice(2,2,"march","april","may"));
// console.log(final2);
// console.log(final2.splice(5,1,"june","july")); // start from ,no of entry to delete,what to replace which start 
// console.log(final2);
// console.log(final2.splice(8,0,"september","october","november","december"));  // delete none just add elements.
// console.log(final2);

// let arr1 = ['a','c','e','z','k','b','y'];
// arr1.sort();
// console.log(arr1);
// let arr2 = [23,100,3,4,7,34,78,2,1];
// arr2.sort();
// console.log(arr2);

// arrays reference
let languages = ['c','c++','html','javascript','python','java','c#','sql'];
console.log("Reversed index of javascript is:",languages.reverse().indexOf("javascript"));

languages[1] == languages[1]

const arr3 = [1,2,3,4];

//nested array
