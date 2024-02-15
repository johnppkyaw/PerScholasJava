const customerError = new Error('Custom Error made by the developer.');

function someFunc(a) {
   if (a === 4) {
      throw customerError;
   }
}

try {
   someFunc(4);
} catch (e) {
   console.log("Logging Customer Error:")
   console.log(e.message)
}
