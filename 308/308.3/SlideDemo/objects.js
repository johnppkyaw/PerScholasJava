function Person(first, last, age, eye) {
  this.firstName = first;
  this.lastName = last;
  this.age = age;
  this.eyeColor = eye;
    this.introduce = function() {
  console.log(this.firstName + " " + this.lastName +
    " is " + this.age + " years old with " + this.eyeColor + " eyes.");
  };
  }

const person = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
  eyeColor: "blue",
  fullName: function() {
    return this.firstName + " " + this.lastName;
  }
};

console.log(person.firstName + " is " + person["age"] + " years old.");

const myArray = Object.values(person);
console.log("myArray: ", myArray); // [‘John’, ‘Doe’, 50, ‘blue’]

delete person.age; // or delete person[“age”]
console.log(person);
// { firstName: ‘John’, lastName: ‘Doe’, eyeColor: ‘blue’ }

console.log("called fullName method: ", person.fullName());


//Object Instantiation
const myFather = new Person("John", "Doe", 50, "blue");
const myMother = new Person("Sally", "Rally", 48, "green");

myFather.birthday = "June 15th"; // Adding a property to an Object.

myMother.introduce(); // Calling an Object method.


Person.prototype.species = "Human";

console.log("prototype property added: ", myMother.species);

const myBrother = new Person("Jane", "Doe", 22, "blue");
myBrother.species = "Goblin";
Person.prototype.species = "Human"; //myBrother's species will not be overriden by this

console.log(myFather.species); // Human
console.log(myBrother.species); // Goblin
console.log(myBrother.__proto__.species); // Human
console.log(Object.getPrototypeOf(myBrother).species);//Human
