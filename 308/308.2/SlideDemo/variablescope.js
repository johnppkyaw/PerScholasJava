const scope = "global scope"; // A global variable
function checkscope() {
   let scope = "local scope"; // A local variable
   function nested() {
      let scope = "nested scope"; // A nested local variable
      return scope; // Return the value in this scope
   }
   return nested();
}
const result = checkscope();
console.log(result); // Will print “nested scope”
