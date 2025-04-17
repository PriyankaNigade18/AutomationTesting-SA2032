/*
Data type defines type of data which you can store into variable

Javascript support two types of DataTypes
--------------------------
1.Primitive
--------------
    1.Number
    2.String
    3.Boolean
    4.Undefined
    5.Null

    6.BigInt
    7.Symbol

2.Non-Primitive
---------------
    -Object
    -Class
    -Array

    //variable: name of storage where we can store data
    Keyword
    --------------
    var(older)

    //modern js
    let-Mutable 

    const-immutable

    Syntax to declare variable
    ==============-===========
    keyword variablename=value;

    Operator
    ============
    typeof operator
    -------------------
    this operator give the details about type of that value which is store into variable

*/

//number positive/negative or decimal digit 
let num1=1818;
console.log("Value of num1 is: "+num1);//1818
console.log("Type of num1 is: "+typeof num1);//number


let num2=-1818;
console.log("Value of num2 is: "+num2);//-1818
console.log("Type of num2 is: "+typeof num2);//number



let num3=89.67;
console.log("Value of num3 is: "+num3);//89.67
console.log("Type of num3 is: "+typeof num3);//number


/*
String is collection of characters
String is Object in js
1.single Quote: 'Hello'
2.double Quotes: "Hello"
3.back ticks or template string: `Hello`
*/

let fname='Jay';
console.log("fname is: "+fname);//Jay
console.log("type of fname is: "+typeof fname);//string


let location="Pune";
console.log("Location is: "+location);//Pune
console.log("type of location is: "+typeof location);//string

let email=`jay@gmail.com`;
console.log(`email is: ${email}`);//Jay
console.log(`type of fname is: ${typeof email}`);//string

//template string  ``
/*Using string you cant store like this
let info="My is name Priyanka,
 my qualification is ME Computers, total experience
 15+ years in It and I am ISTQB certified tester";
*/

let user="Priyanka";
let certificate="ISTQB";

let info=`My is name ${user},
 my qualification is ME Computers, total experience
 15+ years in It and I am ${certificate} certified tester`;

 console.log(info);
 console.log(typeof info);
 
let cname="AISSPMS";
console.log("Collage name is: "+cname);
console.log(`Collage name is: ${cname}`);



 
//boolean true/false

let isActive=true;
console.log("Value for isActive: "+isActive);//true
console.log("Type of isActive is: "+typeof isActive);//boolean

let currentStatus=false;
console.log(`value is: ${currentStatus}  ${isActive}`);//false
console.log(`type is: ${typeof currentStatus}`)//boolean

//undefined   
/* if variable is declare but not assign with any value then
by default variable type and default value of variable is undefined
*/

//declare 
let bname;
console.log("value is: "+bname);//undefined
console.log("type is: "+typeof bname);//undefined

//null - unknown value

let batch=null;
console.log('batch value is: '+batch);//null
console.log("type of null variable: "+typeof batch);
/*
In javascript typeof null variable is Object so its bug define in js
*/

//bigInt(dont required)
console.log(Number.MAX_VALUE);//1.7976931348623157e+308

let bigNum=7976931348623157888888888888888n;
console.log("value is: "+bigNum);
console.log("type is: "+typeof bigNum);//bigint
let num4=12n;
console.log(typeof num4);

//symbol
let data=Symbol('Add');
console.log(data);
console.log(typeof data)



console.log("**********NonPrimitive type*************");

//1.Object literal

let person={
    id:101,
    fname:"Sarang"
    }

    console.log(person);
    console.log(typeof person);
    
    

























