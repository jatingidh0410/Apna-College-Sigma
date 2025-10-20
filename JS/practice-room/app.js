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
// let languages = ['c','c++','html','javascript','python','java','c#','sql'];
// console.log("Reversed index of javascript is:",languages.reverse().indexOf("javascript"));

// languages[1] == languages[1]

// const arr3 = [1,2,3,4];

//nested array
// let nestedArray = [[2,4],[4,7],[8,9]];
// console.log(nestedArray);
// nestedArray[2][1]
// nestedArray[2][0]
// nestedArray[0][0]
// nestedArray[0][1]

//loops
// console.log("Printing odd no from 1 to 15");
// for(let i=1; i<=15; i+=2){
//     console.log(i);
// }

// console.log("Printing even no from 2 to 10");
// for(let i=2; i<=10; i+=2){
//     console.log(i);
// }

// for(let i=1;i<=10;i++){
//     console.log(5*i);
// }

// let numb = parseInt(prompt("Enter a no to get that table"));
// for(let i=numb;i<=numb*10;i=i+numb){
//     console.log(i);
// }

// Nested loops
// for(let i=1;i<=3;i++){
//     console.log("Outer Loops",i)
//     for(let j=1;j<=3;j++){
//         console.log(j);
//     }
// }

// While loop
// let i=1;
// while(i<=5){
//     console.log(i);
//     i++;
// }

// let i = 0;
// while (i <= 20) {
//   console.log(i);
//   i+=2;
// }

// loops in array
// let fruits = ["mango",'apple',"banana","kiwi","orange","pineapple"];
// for(let i=0;i<fruits.length;i++){
//     console.log(i+1,fruits[i]);
// }
// for(let i=fruits.length-1;i>=0;i--){
//     console.log(i+1,fruits[i]);
// }

//nested arrays
// let heroes = [
//   ["ironman", "spiderman", "thor"],
//   ["superman", "wonder woman", "flash"],
// ];

// for (let i = 0; i < heroes.length; i++) {
//   console.log(`List #${i}`);
//   for (let j = 0; j < heroes[i].length; j++) {
//     console.log(heroes[i][j]);
//   }
// }

// for of loop
// let fruits = ["mango","apple","banana","litchi","pineapple"];
// for(fruit of fruits){
//     console.log(fruit);
// }

// for(char of "JatinRGidh"){
//     console.log(char);
// }

// let heroes = [["Iron Man","Hulk","Thor"],["Spiderman","Black Widow","Hawk Eye"]];
// for(list of heroes){
//     for(hero of list){
//         console.log(hero);
//     }
// }

// js object literals
// const stud = {
//     name1: "Jatin",
//     age: 21,
//     marks : 9.9,
//     city:"Navi Mumbai"
// };
// console.log(stud.city);

// // update val
// stud.city = "Mumbai";
// console.log(stud.city);

// stud.gender = "M";
// console.log(stud);

// stud.marks = [9,9,9.6,9.9];
// console.log(stud.marks);

// // delete val
// delete stud.gender;
// console.log(stud);

// obejct of Objects
// const classInfo = {
//   stud1: {
//     nm: "Jatin",
//     mrks: "O",
//     city: "NM",
//   },
//   stud2: {
//     nm: "Sham",
//     mrks: "A+",
//     city: "M",
//   },
//   stud3: {
//     nm: "Ram",
//     mrks: "B+",
//     city: "KH",
//   }
// };
// console.log(classInfo);
// console.log(classInfo.stud2.nm);

// Array of Objects
// const classInfo = [
//   stud1 = {
//     nm: "Jatin",
//     mrks: "O",
//     city: "NM",
//   },
//   stud2 = {
//     nm: "Sham",
//     mrks: "A+",
//     city: "M",
//   },
//   stud3 = {
//     nm: "Ram",
//     mrks: "B+",
//     city: "KH",
//   }
// ];

// console.log(classInfo);
// console.log(classInfo[1].nm);

// Math Object
let step = Math.floor(Math.random() * 10);
// let step2 = step*100;
// step2 = Math.floor(step*100);
console.log(step+1);
