// new Date()
const a = new Date();
console.log(a);
// new Date(year, month, ...)
const b = new Date(2021,11,24,10,33,30,0);
console.log(b);
const c = new Date(2021, 11, 24);
console.log(c);
// new Date(dateString)
const e = new Date("October 13, 2021 11:13:00");
console.log(e);
// new Date(milliseconds)
const f = new Date(86400000);
console.log(f);

let first = new Date ('January 1, 2019 04:30:00');
let second = new Date('2019-01-01T04:30:00');
console.log(first); 	// Tue Jan 01 2019 04:30:00 GMT-0600
console.log(first.getTime() == second.getTime());	// true
console.log(second.getHours());					// 4
console.log(first.setMinutes(45));				// 1546339500000
console.log(first.getMinutes());					// 45
