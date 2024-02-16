class Person {
  static species = "Human";
  #firstName; #lastName; #years; #eyeColor;
  constructor(firstName, lastName, age, eyeColor) {
    this.#firstName = firstName;
    this.#lastName = lastName;
    this.#years = age;
    this.#eyeColor = eyeColor;
  }
  get name() {
    return this.#firstName + " " + this.#lastName;
  }
  set age(new_age) { this.#years = new_age; }
  get age() { return this.#years; }
  static greet() {
    if (Math.random() <= 0.5)
	console.log("Hello!");
    else
	console.log("Hi!");
  }
};

class Learner extends Person {
  #grades = [];
  set grade(new_grade) {
    this.#grades.push(new_grade);
  }
  get grade() {
    return this.#grades;
  }
  get average() {
    let total = 0;
    for (let i = 0; i < this.#grades.length; i++) {
      total += this.#grades[i];
    }
    return Math.round(total/this.#grades.length);
  }
};
const myFather = new Learner("John", "Doe", 50, "blue");
console.log(myFather.name);
myFather.grade = 100;
myFather.grade = 50;
console.log(myFather.grade[1]);
