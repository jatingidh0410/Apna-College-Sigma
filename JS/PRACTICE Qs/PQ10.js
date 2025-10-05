// for the given start state of an array , chnage it to final form using methods.

let start = ['january','july','march','august'];
start.shift();
let final = start[0];
start.shift();
start.unshift("june");
start.unshift(final);
final = start ; // extra no need we can directly print start 
console.log(final);
