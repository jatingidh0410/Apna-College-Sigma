let arr = [1, 2, 3, 4, 5];
let arr1 = [...arr];

let char = [..."hello"];

let odd = [1, 3, 5, 7, 9];
let even = [2, 4, 6, 8, 10];

let num = [...odd, ...even];
//using spresd as object literals
let data = {
  //this is our object
  Mail: "jatingidh04@gmail.com",
  Password: "ApnaCollege",
  Salary: 99999,
};

let dataCopy = { ...data, Company: "Google" };

// learn the concept of rest
function sum(...args) {
  //arguments
  for (let i = 0; i < args.length; i++) {
    console.log("You Gave Us:", args[i]);
  }
  return "Done";
}
sum(1, 2, 3, 4);
