const x = 1;
hoist();
function hoist() {
   console.log(x);
   // ReferenceError
   var x = 2;
}
