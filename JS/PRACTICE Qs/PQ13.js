let favMovie = "kantara";
let guessedMovie;

while (guessedMovie !== favMovie && guessedMovie !== "quit" && guessedMovie !== "q") {
    guessedMovie = prompt("Guess my fav Movie:");
}
if (guessedMovie.toLowerCase() === favMovie) {
        console.log("You guessed it right!");
} else {
        console.log("Exited the game!!");
}