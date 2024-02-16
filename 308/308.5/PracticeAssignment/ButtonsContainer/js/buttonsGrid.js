
//Grab all button nodes
let btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
const button1 = document.getElementById("btn1");
const button2 = document.getElementById("btn2");
const button3 = document.getElementById("btn3");
const button4 = document.getElementById("btn4");
const button5 = document.getElementById("btn5");
const button6 = document.getElementById("btn6");
const button7 = document.getElementById("btn7");
const button8 = document.getElementById("btn8");
const button9 = document.getElementById("btn9");

button5.addEventListener("click", (e) => {
  //save btn1's text
  const savedBtn1Text = document.getElementById("btn1").innerText;

  //btn1 takes btn4
  button1.innerText = button4.innerText;

  //4 takes 7
  button4.innerText = button7.innerText;

  //7 takes 8
  button7.innerText = button8.innerText;

  //8 takes 9
  button8.innerText = button9.innerText;

  //9 takes 6
  button9.innerText = button6.innerText;

  //6 takes 3
  button6.innerText = button3.innerText;

  //3 takes 2
  button3.innerText = button2.innerText;

  //2 takes 1 from the saved value
  button2.innerText = savedBtn1Text;
})
