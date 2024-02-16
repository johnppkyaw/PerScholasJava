let input = prompt("Enter a range of two numbers, separated by a space (e.g. 23 34): ");
let [min, max] = input.split(" ");

const guess = Math.floor(Math.random() * (Number(max) - Number(min) + 1) + Number(min));

let limiter = 0;
let userGuess;

while (limiter <= 10) {
   userGuess = prompt(`Guess a number between ${min} and ${max}: `);
   if(userGuess < guess) {
    min = Number(userGuess) + 1;
    } else if (userGuess > guess) {
    max = Number(userGuess) - 1;
    } else {
    alert("You got it: " + userGuess);
     break;
    }
   limiter++;
}

if (guess != userGuess){
   alert("Sorry, the answer was: " + guess);
}
