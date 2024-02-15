const url = /^(([^:\/?#]+):)?(\/\/([^\/?#]*))?([^?#]*)(\?([^#]*))?(#(.*))?/;
const text = "http://www.example.com/~david";
const result = text.match(url);
if (result != null) {
   let fullurl = result[0];
   // Contains "http://www.example.com/~david"
   let protocol = result[2]; // Contains "http"
   let host = result[4]; // Contains "www.example.com"
   let path = result[5]; // Contains "/~david"

   debugger

   console.log("fullurl", fullurl)
   console.log("protocol", protocol)
   console.log("host", host)
   console.log("path", path)
}
