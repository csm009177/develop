const http = require('http');
const fs = require('fs')

http.createServer(function(request, response){
  console.log(request.method);
  console.log(request.url);
}).listen(8000);

console.log(typeof(http))
console.log(typeof(http.createServer))
console.log(typeof(http.createServer(function(){})))
console.log(typeof(http.createServer(function(request, response){})))

