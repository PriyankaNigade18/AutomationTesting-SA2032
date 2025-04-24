
/*
Group of statments define to perform certain functionality is called function
Types
============
1.Function declaration

2.FunctionExpression
-------------------------
    1.Anonymous function: function without name
    2.Arrow function
*/
console.log("---------function declaration-------------");

function test1()
{
   console.log("Test1() is calling.....");
    
}

//calling function
test1();

console.log("---------function declaration with parameters-------------");
/* 
parameters represent variable
argument represent original data which we pass at the time calling that function
*/
function test2(id,fname)//2 parameters
{
console.log("Hello "+fname);
console.log("Your id is: "+id);
}

//call
test2(101,"Shweta");//2 arguments passing

console.log("---------function declaration with parameters and return keyword------------");

function test3(msg)
{
    return msg;
}

//call
let result=test3("Hello Everyone!");
console.log(result);

console.log("------");

console.log(test3("Bye All"));

console.log("--------Anonymous Function----------------");

const test4=function()
    {
    console.log("Anonymous function is calling!");
    
    }


//call
test4();


console.log("--------Anonymous Function with parameter----------------");


const add=function(a,b)
{
    console.log("Addition is: "+(a+b));
    
}

//call
add(100,2000);

console.log("--------Anonymous Function with parameter and return keyword---------------");

const test5=function(id,fname)
{
    return `student id is: ${id} and student name is: ${fname}`;
}

//call
console.log(test5(201,"Parag"));

console.log("--------Arrow function---------------");
let test6=()=>
    {
    console.log("Arrow function is calling.....");
    
    }

    //call
    test6();

    console.log("--------Arrow function with parameter and return keyword---------------");


     let sum=(a,b)=>{return a+b};
     //call
     let res=sum(1000,2000);
     console.log("Sum is: "+res);
     