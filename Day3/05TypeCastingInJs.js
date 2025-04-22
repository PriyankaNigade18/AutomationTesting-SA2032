/*
Type casting
---------------
Converting one type of data into other type

Types
----------
1.Implicit casting(Type Coersion)
-----------------
Automatic casting which is taken care by javascript

2.Explicit Casting
-----------------------
Manual casting/forcefull casting
String()
Number()
Boolean()

Rule: For data conversion type/value should be compatible


*/

console.log("------Implicit Casting(Type Coersion)------");
/*
String conversion
--------------
Whenever we apply arithmetic operator (+) with string then other value
that will convert into String
*/
console.log("-----String conversion-----");

let d1="100"+20;//20 number coerced to string
console.log(d1);//10020
console.log(typeof d1);//string

let d2=100+45+"90";//145 coerced to string
console.log(d2);//14590
console.log(typeof d2);//string

let d3=10+"78"+90;//10 and 90 number coerced into string
console.log(d3);//107890
console.log(typeof d3);//string

let d4="Hello"+true;//true boolean data coerced to string
console.log(d4);//Hellotrue
console.log(typeof d4);//string

console.log("------Number conversion-----");

/*
Number conversion:
Whenever we perform arithmetic operation(-,*,/) on String the that string will 
convert into number

String value should be convertable
*/
console.log("Hello"/9);//NaN

let d5="20"/2;//"20" string coerced to number
console.log(d5);//10
console.log(typeof d5);//number

let d6="100"*2;//"100" string coerced into number 100
console.log(d6);//200
console.log(typeof d6);//number

console.log("100"/"10");//10 "100" and "10" coerced intonumber

let d7=("200"+"10")/2;
console.log(d7);//10005
console.log(typeof d7);//number

console.log("-----Explicit casting------");

console.log("---data into number Number()------");

let data="200";
console.log(data);//200
console.log(typeof data);//string
console.log(data+200);//200200
//string into number-Number()
//400

let result=Number(data);
console.log(result);//200 as number
console.log(typeof result);// number
console.log(result+200);//400

console.log(Number(true));//boolean to number : 1
console.log(Number(false));//boolean to number : 0
console.log(Number(null));//0
console.log(Number("Jay"));//NaN
console.log(Number("90"));//90
console.log(Number('p'));//NaN


console.log("----Number to String- String()----");
let num=2000;
console.log(typeof num);//number
console.log(num+100);//2100

let numToString=String(num);//"2000"

console.log(numToString);//"2000"
console.log(typeof numToString);//string
console.log(numToString+100);//2000100

/*
Boolean Conversion true/false
------------------
Truthy values:
--------------
Any true value in boolean context refer as truthy
nonzero,nonempty string

Falsy values:
------------------------
Any false value in boolean context refer as falsy
In js 5 values are there those are falsy
0,null,undefined,empty string "",NaN,false
*/

console.log("---Boolean conversion------");
//truthy values
console.log(Boolean(90));//true
console.log(Boolean(-90));//true
console.log(Boolean("Jay"));//true
console.log(Boolean("J"));//true
console.log(Boolean(90.67));//true
console.log(Boolean(true));//true

console.log("-------------");

console.log(Boolean(0));
console.log(Boolean(null));
console.log(Boolean(undefined));
console.log(Boolean(""));
console.log(Boolean(NaN));
console.log(Boolean(false));


console.log(Number(null));































































