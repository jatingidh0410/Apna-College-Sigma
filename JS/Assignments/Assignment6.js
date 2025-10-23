// find the average of all numbers in an array using an arrow function.
let arrayAverage = (num) => {
  let sum = 0;
  for (let i = 0; i < num.length; i++) {
    sum += num[i];
  }
  let avg = sum / num.length;
  console.log(avg);
};
arrayAverage([2, 3, 4, 6, 7, 8, 1]);

//Q2: create a function isEven and retrn if num is even or not
let isEven = (no) => {
  if (no % 2 === 0) {
    return "even";
  } else {
    return "odd";
  }
};
console.log(isEven(3));
console.log(isEven(8));

//q3:
// const object = {
//   message: "Hello,World!",
//   logMessage() {
//     console.log(this.message);
//   },
// };
// setTimeout(object.logMessage, 1000); //op hello world

//q4:
let length = 4;
function callback() {
  console.log(this.length);
}
const object = {
  length: 5,
  method(callback) {
    callback();
  },
};
object.method(callback, 1, 2);
