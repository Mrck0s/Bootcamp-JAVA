for (var i = 0; i < 5; i++) {
  console.log(i);
}
// i = 0 -> 1 -> 2 -> 3 -> 4 -> 5

for (var i = 0; i < 5; i++) {
  i = i + 1;
  console.log(i);
}
// i = 0 -> 1 -> console.log = 1 -> i = 2 -> 3 -> console.log = 3 -> i = 4 -> 5 -> console.log -> 5

for (var i = 0; i < 5; i++) {
  i = i + 3;
  console.log(i);
}
// i = 0 -> 3 -> console.log = 3 -> i = 4 -> 7 -> console.log -> 7

function y(num1, num2) {
  return num1 + num2;
}
console.log(y(2, 3));
console.log(y(3, 5));
// num1 = 2, num2 = 3 -> console.log -> 5, num1 = 3, num2 = 5 -> console.log -> 8

function y(num1, num2) {
  console.log(num1);
  return num1 + num2;
}
console.log(y(2, 3));
console.log(y(3, 5));
// num1 = 2, num2 = 3 -> conosle.log -> 2 -> console.log -> 5 -> num1 = 3, num2 = 5 -> console.log -> 3 -> console.log -> 8

a = 15;
console.log(a);
function y(a) {
  console.log(a);
  return a;
}
b = y(10);
console.log(b);
// a = 15 -> console.log -> 15 -> b = y(10) -> console.log -> 10 -> b = 10 -> console.log -> 10

a = 15;
console.log(a);
function y(a){
   console.log(a);   
   return a*2;
}
b = y(10);
console.log(b);
// a = 15 -> console.log -> 15 -> b = y(10) -> console.log -> 10 -> b = 20 -> console.log -> 20
