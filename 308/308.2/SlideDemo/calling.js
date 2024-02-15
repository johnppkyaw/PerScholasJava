// Define the function.
function defaultMessage() {
  console.log("Default message") ;
}

// Call the function.
defaultMessage();

function customMessage(custom, times) {
  for (let i = 0; i < times; i++) {
     console.log(i, custom) ;
  }
}

customMessage("Hello!", 3);
