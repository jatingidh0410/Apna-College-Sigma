// create a fun to roll a dice
function rollDice() {
  let roll = Math.floor(Math.random() * 6) + 1;
  console.log("Roll a dice using Ctrl+R :",roll);
}
rollDice();