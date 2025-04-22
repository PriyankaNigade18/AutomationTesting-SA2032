
/*
Arithmetic operator
Unary operators
Relational operators
Logical Operators

Equality
--------------
1.loose equality(==)
2.strict equality(===)

*/

console.log("------Arithmetic operator-------");

let a = 20, b = 10;
console.log("Addition  is: " + (a + b));
console.log(`Addition is: ${a + b}`);
console.log(`Subtraction is: ${a - b}`);
console.log(`division is: ${a / b}`);
console.log(`multiplication is: ${a * b}`);
console.log(`Modulus is: ${a % b}`);

console.log(9 / 0);//Infinity
console.log(-90 / 0);//-Infinity
console.log("Hello" / 0);//NaN: not a number
console.log(0 / 0);//NaN

//isNaN(): Is not a number 
console.log(isNaN("Priyanka"));//true
console.log(isNaN(0));//false

console.log("------Unary operator-------");
/*
++ Increment                    -- decrement
let a=10;                           a=10
a++ : post increment                a--: post decrement
++a: Pre increment                  --a:pre decrement

a=a+1                               a=a-1
*/

//post Increment
let a1 = 80;
console.log(a1);//80
console.log(a1++);//80
console.log(a1);//81

//pre increment
let b1 = 90;
console.log(b1);//90
console.log(++b1);//91

//post decrement
let c1 = 56;
console.log(c1);//56
console.log(c1--);//56
console.log(c1);//55

//pre decrement
let d1 = 67;
console.log(d1);//67
console.log(--d1);//66


let num1 = 169;
let num2 = num1++;
//first value assigned then incremented
console.log(num1);//170

console.log(num2);//169

let num3 = 78;
let num4 = ++num3;
console.log(num3);//79
console.log(num4);//79

let num5 = 90;
let num6 = num5--;

console.log(num5);//89
console.log(num6);//90

let num7 = 145;
let num8 = --num7;
console.log(num7);//144
console.log(num8);//144

console.log("--------Relational operator-------------");
/*
< less than
<= less than equal to
> greater than
>= greater than equal to

!= not equal to

equality
=============
1.strict equality ===
2.loose equality ==

Test data: num7=num8=144, num6=90, num3=num4=79
*/

console.log(num6 < num7);//true
console.log(num3 <= num4);//true
console.log(num4 > num6);//false
console.log(num8 > num6);//true
console.log(num7 >= num8);//true
console.log(num8 != num6);//true
console.log(num3 != num4);//false

/*
Strict equality ===
This check exact value and type of value
*/

console.log("100" === 100);//false


/*
loose equality ==
check the data and convert into same type then compare
*/
//
console.log("100" == 100);//true

console.log(null === undefined);//false

console.log(null == undefined);//true


console.log("-------Logical Operator in Js----------");
/*
c1      c2      c1&&c2(AND)     c1||c2(OR)   !c1(NOT)
true    true    true            true            false
true    false    false          true            false
false    true     false          true           true
false    false     false        false           true

testdata: num7=num8=144 num6=90 num3=num4=79


*/
//true && true 
console.log((num7 >= num8) && (num3 === num4));//true
//true && false 
console.log((num7 >= num8) && (num3 != num4))//false

//false && true 
console.log((num7 != num8) && (num3 < num6))//false
//false && false 
console.log((num7 != num8) && (num3 != num4))//false


//true || true 
console.log((num7 >= num8) || (num3 === num4));//true
//true || false 
console.log((num7 >= num8) || (num3 != num4))//true

//false || true 
console.log((num7 != num8) || (num3 < num6))//true

//false || false 
console.log((num7 != num8) || (num3 != num4))//false


//NOT (!) 
console.log(num3 >= num4);//true
console.log(!(num3 >= num4));//false

console.log("------Guess output-----");

//Ctrl+a -->ctrl+K+F: formatting in vscode
//test
console.log(false + 1);//1
console.log(null + 1);//unknown+1=1
console.log(true + 1);//2
console.log(0 / 0);//nan
console.log("Hi" / 0);//nan
console.log(90 / 0);//infinity
console.log("" + 10);//10
console.log(undefined + 100);//Nan
console.log(true + true);//2












































































