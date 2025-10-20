//generate a random no between 1 to 100
let num = Math.floor(Math.random() * 100);
console.log(num + 1);

// add random no in range of 21 to 25
let num2 = Math.floor(Math.random() * 5) + 21;
console.log(num2);

// now with same logic create a guessing game
let randomNum = Math.floor(Math.random() * 10) + 1;
let guess = prompt("Guess a number from 1 to 10:");

while (true) {
  if (guess === "quit") {
    console.log("User Quit.");
    break;
  }
  if (guess == randomNum) {
    console.log("🎉 You guessed it right!");
    break;
  } else if (guess > randomNum) {
    guess = prompt("Guessed No too Big");
  } else {
    guess = prompt("Guessed No too Small");
  }
}
