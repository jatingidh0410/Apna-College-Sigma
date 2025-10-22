// write a arrow fun that return the square of number n

let square = (num) => {
  return num * num;
};
console.log(square(4));

// fun that prints hello world at interval of 2 sec

let id = setInterval(() => {
  console.log("Hello World");
}, 2000);

setInterval(() => {
  clearInterval(id);
  console.log("clear interval ran");
}, 11000);
