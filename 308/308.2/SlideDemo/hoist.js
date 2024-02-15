const x = 1;
hoist();
function hoist() {
   console.log(x);
   // ReferenceError
   const x = 2;
}
