const str = "23";
const num = Number(str);
console.log(typeof num); // number
console.log(Number(340900000000000000).toExponential()); // 3.409e+17

console.log(Math.PI);				// returns 3.141592653589793
// Math.round(x) 		   returns the value rounded to its nearest integer
console.log(Math.round(4.7));	// returns 5
console.log(Math.round(4.4));	// returns 4
// Math.pow(x, y)  	   returns the value of x to the power of y
console.log(Math.pow(8, 2));	// returns 64
// Math.sqrt(x) 		   returns the square root of x:
console.log(Math.sqrt(64));		// returns 8
// Math.ceil(x) 		   returns the value rounded up to nearest integer
console.log(Math.ceil(4.4));	// returns 5
// Math.floor(x) 		   returns the value rounded down to nearest integer
console.log(Math.floor(4.7));	// returns 4

// Return a range of whole-number values
// from min (inclusive) to max (inclusive)
const min = 5;
const max = 10;
let value = Math.floor(Math.random() * (max - min + 1) + min);
console.log("random number: ", value);

//Random number gen with range
function randomWholeNumber(min, max) {
  return Math.floor(Math.random() * (max - min + 1) + min);
}
console.log(randomWholeNumber(5, 10)); 	// numbers from 5 to 10
console.log(randomWholeNumber(7, 42)); 	// numbers from 7 to 42	console.log(randomWholeNumber(1, 100)); 	// numbers from 1 to 100	console.log(randomWholeNumber(-10, 10)); 	// numbers from -10 to 10	console.log(randomWholeNumber(-4, 20)); 	// numbers from -4 to 20
