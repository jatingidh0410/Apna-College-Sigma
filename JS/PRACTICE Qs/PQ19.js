let greet = "hello";
function changeGreet() {
  let greet = "namaste";
  console.log(greet);
  function innerGreet() {
    console.log(greet);
  }
}

console.log(greet);
changeGreet(); 