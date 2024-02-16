const button = document.getElementById('btn');
button.addEventListener('click', () => {
  //button.innerText is a string.  must convert it to number datatype
  button.innerText = parseInt(button.innerText) + 1;
});
